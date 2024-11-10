package functionalInterface;

import java.util.List;

public class LambdaBehindTheScreenRunner {

	public static void main(String[] args) {
		List.of(23, 33, 34, 45).stream().filter(n -> n % 2 == 1).forEach(e -> System.out.println(e));
	}

}
