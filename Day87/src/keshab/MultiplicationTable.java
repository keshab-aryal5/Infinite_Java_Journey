package keshab;

public class MultiplicationTable {
	void printMultiplicationTable()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.printf("%d x %d = %d", 5, i, 5 * i).println();
		}
	}
	void printMultiplicationTable(int n)
	{
		printMultiplicationTable();
		for(int i=1;i<=10;i++)
		{
			System.out.printf("%d x %d = %d", n, i, n * i).println();
		}
	}
}
