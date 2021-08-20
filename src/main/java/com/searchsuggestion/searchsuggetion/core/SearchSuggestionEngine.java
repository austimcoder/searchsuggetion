package com.searchsuggestion.searchsuggetion.core;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SearchSuggestionEngine {
	
	private Map<String,TopMostFrequentStringsList> stringListMap = new HashMap<>();
	
	private int maxCount;
	
	public List<String> suggest(String search){
		search = search.trim();
		if(stringListMap.get(search) != null) {
		return stringListMap.get(search).getOrderedStringFrequencyList().stream()
				.limit(maxCount)
				.map(sf -> sf.getString())
				.collect(Collectors.toList());
		}
		return Collections.emptyList();
	}
	
	public void consume(String submit) {
		String str = "";
		putInMap(submit, str);
		for(char a : submit.toCharArray()) {
			str += a;
			putInMap(submit, str);
		}
	}

	private void putInMap(String submit, String str) {
		if(stringListMap.get(str) == null) {
			stringListMap.put(str, new TopMostFrequentStringsList());
		}
		stringListMap.get(str).add(submit);
	}

	public SearchSuggestionEngine(int maxCount) {
		super();
		this.maxCount = maxCount;
	}

}
