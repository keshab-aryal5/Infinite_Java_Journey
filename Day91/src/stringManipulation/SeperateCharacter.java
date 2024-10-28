package stringManipulation;

public class SeperateCharacter {
	public static void main(String[] args) {
		String name = "value";
		System.out.println(name.lastIndexOf('e'));
		System.out.println(name.contains("text"));
		System.out.println(name.startsWith("jsdf"));
		System.out.println(name.equalsIgnoreCase("VALue"));
		System.out.println(String.join(",", "ABC", "DEF"));
	}
}
