package oop;

public class MyChar {
	private char ch;

	public MyChar(char c) {
		// TODO Auto-generated constructor stub
		this.ch = c;
	}

	boolean isVowel()
	{
		char c = Character.toUpperCase(this.ch);
		switch(c)
		{
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			return true;
		default:
			return false;
		}
	}

	boolean isConsonant() {
		return !isVowel();
	}

	public boolean isNumber() {
		// TODO Auto-generated method stub
		return Character.isDigit(this.ch);
	}

	public boolean isAlphabet() {
		// TODO Auto-generated method stub
		return Character.isAlphabetic(this.ch);
	}

	public static void printLowerCaseAlphabets() {
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void printUpperCaseAlphabets() {
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
