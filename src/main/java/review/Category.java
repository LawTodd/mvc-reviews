package review;

import java.util.Collection;
import java.util.Collections;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;
	
	// mappedBy: because in the database, things point the other direction
	// mappedBy "customer" is referring to CustomerOrder.customer
	@OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
	private Collection<Review> reviews;

	/**
	 * Spring Data/JPA requires a no-argument constructor.
	 */
	protected Category() {
	}

	/**
	 * Overloading constructor to allow creation of a Category without any
	 * reviews.
	 */
	public Category(long id, String name) {
		this(id, name, Collections.emptyList());
	}

	public Category(long id, String name, Collection<Review> reviews) {
		this.id = id;
		this.name = name;
		this.reviews = reviews;
	}
	
	public long getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public Collection<Review> getReviews(){
		return reviews;
	}

	
	@Override
	public String toString() {
		return String.format("Category[id=%d, name ='%s', reviews: %s]", 
				id, name, reviews);
	}

}
