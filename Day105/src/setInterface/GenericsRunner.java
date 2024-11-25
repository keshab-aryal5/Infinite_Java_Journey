package setInterface;

public class GenericsRunner {

	public static void main(String[] args) {
		MyCustomList<String> list = new MyCustomList<String>();
		list.addElement("Element 1");
		list.addElement("Element 2");
		list.removeElement("keshab");
	}
}
