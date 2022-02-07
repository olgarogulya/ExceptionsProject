package by.epam.training.exceptions.print;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Print {

	public void print(File file2) throws FileNotFoundException {
		File file = new File("src/text1.txt");
		Scanner sc = new Scanner(file);
		String text;
		while (sc.hasNextLine()) {
			text = sc.nextLine();	
			System.out.println(text);	
		}
		sc.close();		
	}	
}

