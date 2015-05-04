package nl.thuis.sdm.java8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * User: sjaakm
 * Date: 5/2/15
 * Time: 9:31 AM
 */
public class Demo {

    private List<String> words = new ArrayList<>();

    public static void main(String[] args) {
	Demo java8Demo = new Demo();
	java8Demo.init();
	java8Demo.start();
    }

    private void init()  {

	try {
	    BufferedReader bufferedReader = new BufferedReader(new FileReader(this.getClass().getResource("english_words.txt").getFile()));
	    System.out.println("Number of words: " + bufferedReader.lines().count());
	    bufferedReader.close();

	    bufferedReader = new BufferedReader(new FileReader(this.getClass().getResource("english_words.txt").getFile()));
	    bufferedReader.lines().forEach(this.words::add);
	    bufferedReader.close();


	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    private void start()  {

    	// Voorbeelden
	System.out.println(words.stream().findFirst());

	System.out.println(words.stream().findAny());

	System.out.println(words.stream().allMatch(s -> s.length() > 2));
	System.out.println(words.stream().anyMatch(s -> s.length() == 15));
	words.stream().filter(s -> s.length() == 15).forEach(System.out::println);
	words.stream().filter(s -> s.length() == 14).forEach(System.out::println);

    }
}
