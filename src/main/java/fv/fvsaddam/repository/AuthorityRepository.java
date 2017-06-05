package fv.fvsaddam.repository;

import fv.fvsaddam.model.Authority;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author fvsaddam - fvmonster.corp@gmail.com
 */
public interface AuthorityRepository extends CrudRepository<Authority, Long> {

    Authority findByRole(String role);
}
