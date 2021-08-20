package com.searchsuggestion.searchsuggetion.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TopMostFrequentStringsList {

	private List<StringFrequency> orderedStringFrequencyList = new ArrayList<>();

	private Map<String, StringFrequency> stringFreqMap = new HashMap<>();

	public List<StringFrequency> getOrderedStringFrequencyList() {
		return orderedStringFrequencyList;
	}

	public void add(String submit) {
		if (submit != null && !submit.isBlank()) {
			if (stringFreqMap.containsKey(submit)) {
				StringFrequency stringFrequency = stringFreqMap.get(submit);
				stringFrequency.setCount(stringFrequency.getCount() + 1);
			} else {
				StringFrequency stringFrequency = new StringFrequency(submit, 0);
				stringFreqMap.put(submit, stringFrequency);
				orderedStringFrequencyList.add(stringFrequency);
			}
			Collections.sort(orderedStringFrequencyList,
					(sf1, sf2) -> (int) ((sf2.getCount() - sf1.getCount()) % 100000000));
		}
	}

}
