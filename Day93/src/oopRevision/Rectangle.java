package oopRevision;

public class Rectangle {
	private int length;
	private int breadth;

	public Rectangle(int l, int b)
	{
		this.length = l;
		this.breadth = b;
	}

	public int getArea()
	{
		return this.length*this.breadth;
	}

	public int getPerimeter() {
		return 2 * (this.length + this.breadth);
	}

	@Override
	public String toString() {
		return String.format("Length - %d, Width - %d", this.length, this.breadth);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		if (length <= 0) {
			this.length = 0;
		} else {
			this.length = length;
		}
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		if (breadth <= 0) {
			this.breadth = 0;
		} else {
			this.breadth = breadth;
		}
	}
}
