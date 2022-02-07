package by.epam.training.exceptions.logic;

import java.io.FileWriter;
import java.io.IOException;

public class MyProjectLogic {

	public String removeExtraSpaces(String s) {
		s = s.trim().replaceAll("\\s+", " ");
		return s;
	}
	
	public void makeFile(String str) {
		try {
			FileWriter fw = new FileWriter("src/text1.txt");
			fw.write(str);
			fw.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	public String getValue(String s0, String s1, String s2) {
        
	 	double finalVal = 0;
        double a = Double.parseDouble(s0);
        double b = Double.parseDouble(s1);
        char c = s2.charAt(0);

        if (c == '*') {
            finalVal = a * b;
        } else if (c == '/') {
            finalVal = a / b;
        } else if (c == '+') {
            finalVal = a + b;
        } else if (c == '-') {
            finalVal = a - b;

        }
        String s = a + " " + c + " "+ b + " = " + String.valueOf(finalVal);
        return s;
    }

}
