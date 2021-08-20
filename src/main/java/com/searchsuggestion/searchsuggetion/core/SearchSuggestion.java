package com.searchsuggestion.searchsuggetion.core;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class SearchSuggestion {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter number of results for suggestion: ");
			SearchSuggestionEngine searchSuggestionEngine = new SearchSuggestionEngine(sc.nextInt());
			sc.nextLine();
			while (true) {
				System.out.println("Please enter some string for suggestion/submition: ");
				String str = sc.nextLine();
				System.out.println("Please enter\n1: for suggestion\n2: for submission\n0: for exit ");
				switch (sc.nextLine()) {
				case "1":
					int c = 0;
					for (String suggestion : searchSuggestionEngine.suggest(str)) {
						System.out.println(String.format("%d: %s", ++c, suggestion));
					}
					break;
				case "2":
					searchSuggestionEngine.consume(str);
					System.out.println("Submitted successfully!!");
					break;
				case "0":
					System.out.println("Exiting bye!!");
					System.exit(0);
					break;

				default:
					System.out.println("Wrong option. Try again!!");
					break;
				}
			}
		}

	}
}
