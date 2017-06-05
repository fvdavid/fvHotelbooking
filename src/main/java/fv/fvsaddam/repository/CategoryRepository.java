package fv.fvsaddam.repository;

import fv.fvsaddam.model.Category;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author fvsaddam - fvmonster.corp@gmail.com
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Category findByName(String name);
}
