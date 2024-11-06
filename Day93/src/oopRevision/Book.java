package oopRevision;

import java.util.ArrayList;

public class Book {
	private int id;
	private String description;
	private String aurthor;
	private ArrayList<Review> review = new ArrayList<>();

	public Book(int id, String description, String aurthor) {
		super();
		this.id = id;
		this.description = description;
		this.aurthor = aurthor;
	}

	public void addReview(Review re) {
		review.add(re);
	}

	@Override
	public String toString() {
		return String.format("id = %d name = %s aurthor = %s Reviews = [%s]", id, description, aurthor, review);
	}

}
