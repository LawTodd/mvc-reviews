package review;

import org.springframework.stereotype.Component;

@Component
public interface CategoryRepository extends
org.springframework.data.repository.CrudRepository<Category, Long>{

}
