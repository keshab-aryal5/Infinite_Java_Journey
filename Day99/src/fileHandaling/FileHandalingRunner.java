package fileHandaling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileHandalingRunner {

	public static void main(String[] args) {
		try {
			File obj = new File("myIntro.txt");
			Scanner sc = new Scanner(obj);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
				;
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occureed.");
		}

	}

}
