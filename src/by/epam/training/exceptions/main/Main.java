package by.epam.training.exceptions.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import by.epam.training.exceptions.logic.MyProjectLogic;
import by.epam.training.exceptions.print.Print;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		MyProjectLogic logic = new MyProjectLogic();
		Print view = new Print();

		String text;
		String result = "";
		String newLine = System.getProperty("line.separator");
		
		File file1 = new File("src/text.txt");
		File file2 = new File("src/text1.txt");
		Scanner sc = new Scanner(file1);

		while (sc.hasNextLine()) {
			text = sc.nextLine();
			text = logic.removeExtraSpaces(text);
			String[] line = text.split("\r\n|\r|\n");
	
			for (int a = 0; a < line.length; a++) {
				String delimiter = "\\s";
				
				String[] str = line[a].split(delimiter);
				String s = logic.getValue(str[0], str[1], str[2]) + newLine;		
				result += s;
			}
			logic.makeFile(result);
		}
		sc.close();
		view.print(file2);
	}

}
