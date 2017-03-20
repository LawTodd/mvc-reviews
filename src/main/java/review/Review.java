package review;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Review {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String title;
	private String imageURL;
	private String content;
	private String date;
	//private String category;
	
	@ManyToOne(fetch = FetchType.EAGER)
	//private Review review;
	private Category category;
	
	protected Review(){
	}
	
	public Review(String title, String imageURL, String category, 
			String content, String date){
		this.id = id;
		this.title = title;
		this.imageURL = imageURL;
		//this.category = category;
		this.content = content;
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImageURL() {
		return imageURL;
	}

//	public String getCategoryName() {
//		categoryName = category.getName();
//		return categoryName;
//	}
	
	public Category getCategory() {
		return category;
	}

	public String getContent() {
		return content;
	}

	public String getDate() {
		return date;
	}
	
	
}
