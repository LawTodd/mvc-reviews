package review;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.data.repository.CrudRepository;

@Component
public interface ReviewRepository extends 
	org.springframework.data.repository.CrudRepository<Review, Long>{
	
//	private Map<Long,Review> reviewMap = new HashMap<Long, Review>();
//	
//	public ReviewRepository(){
//		long id = 1;
//		Review review = new Review(1,"Bangkok","/images/ToddBangkokPalace.jpg",
//				"Asia","Bangkok is Hot!","April 2008");
//		reviewMap.put(id, review);	
//		id = 2;
//		reviewMap.put(id, new Review(2,"Venice","/images/BridgeOfSighs.jpg",
//				"Europe","Venice is Sinking!", "October 2002"));
//		id = 3;
//		reviewMap.put(id, new Review(3,"Beijing","/images/GateOfHeavenlyPeace.jpg",
//				"Asia","Beijing is Smoggy!","September 2007"));
//		id = 4;
//		reviewMap.put(id, new Review(4,"Siem Reap","/images/AngkorThom.jpg",
//				"Asia","Seim Reap is Cheap!","April 2008"));	
//		id = 5;
//		reviewMap.put(id, new Review(5,"London","/images/ToddParlament.jpg",
//				"Europe","London is Cool but Expensive!","June 2003"));	
//		id = 6;
//		reviewMap.put(id, new Review(6,"Athens","/images/ToddParthenon.jpg",
//				"Europe","Athens is really Old!","June 2006"));	
//		id = 7;
//		reviewMap.put(id, new Review(7,"Rio de Janero","/images/ToddSambaDrome.jpg",
//				"South America","Rio is Hot and Dangerous!","February 2006"));
//		id = 8;
//		reviewMap.put(id, new Review(8,"Santorini","/images/UsInSantorini.jpg",
//				"Europe","Santorini is Breathtaking!","June 2005"));
//		id = 9;
//		reviewMap.put(id, new Review(9,"Xian","/images/TerraCottaArmy.jpg",
//				"Asia","Xian is the 1st capitol of China!","September 2007"));
//		id = 10;
//		reviewMap.put(id, new Review(10,"Rome","/images/ToddStPeters.jpg",
//				"Europe","St Peters is the biggest church in the World!","June 2005"));
//		id = 11;
//		reviewMap.put(id, new Review(11,"Hanoi","/images/ToddHoChiMin.jpg",
//				"Asia","Hanoi is an ancient and super cheap city!","April 2008"));
//	}
//	
//	public Collection<Review> findAll(){
//		return reviewMap.values();
//	}
//
//	public Review findOne(long id){
//		Review reviewValue = reviewMap.get(id);
//		return reviewValue;
//	}
}
