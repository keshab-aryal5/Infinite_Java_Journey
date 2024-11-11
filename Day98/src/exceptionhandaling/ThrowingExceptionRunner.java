package exceptionhandaling;

class Amount {
	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amount that) throws CurrenciesDoNotMatchException {
		if (this.currency.equals(that.currency)) {
			this.amount += that.amount;
		} else {
			throw new CurrenciesDoNotMatchException("Currencies mismatch");
		}

	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}

}

@SuppressWarnings("serial")
class CurrenciesDoNotMatchException extends Exception {
	public CurrenciesDoNotMatchException(String msg) {
		super(msg);
	}
}
public class ThrowingExceptionRunner {

	public static void main(String[] args) throws CurrenciesDoNotMatchException {
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("EUR", 20);
		amount1.add(amount2);
		System.out.println(amount1);
	}
}