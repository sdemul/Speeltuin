package nl.thuis.sdm.java8;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;


public class StreamTest {

	public static void main(String[] args) {
		
		// Tweede commit 
		// Derde commit
		
//		File[] files = new File("/Users/sjaakdemul/Pictures").listFiles(new FileFilter() {
//			
//			@Override
//			public boolean accept(File f) {
//				return f.isDirectory();
//			}
//		});
//		for (File file : files) {
//			System.out.println(file.getName());
//		}

//		FileFilter ff = (File f) -> f.isDirectory();
//		File[]  files = new File("/Users/sjaakdemul/Pictures").listFiles(ff);
//		for (File file : files) {
//			System.out.println(file.getName());
//		}

// Commit van GitHub

		List<String> strings = new ArrayList<>();
		strings.add("Een");
		strings.add("Twee");
		strings.add("Drie");
		strings.add("Vier");
		strings.add("Vijf");
		
		new StringPrinter().print2(strings, s -> s.length()<4);
		
	}

}
