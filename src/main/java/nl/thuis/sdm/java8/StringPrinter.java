package nl.thuis.sdm.java8;

import java.util.List;
import java.util.function.Predicate;

public class StringPrinter {
	
	public void print(List<String> strings, Skipper<String> skipper) {
		for (String s : strings) {
			if (!skipper.skip(s)) {
				System.out.println(s);
			}
		}
	}

	public void print2(List<String> strings, Predicate<String> skipper) {
		for (String s : strings) {
			if (!skipper.test(s)) {
				System.out.println(s);
			}
		}
	}
}
