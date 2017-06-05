package fv.fvsaddam.repository;

import fv.fvsaddam.model.Hotel;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author fvsaddam - fvmonster.corp@gmail.com
 */
public interface HotelRepository extends CrudRepository<Hotel, Long> {

    Hotel findByName(String name);
}
