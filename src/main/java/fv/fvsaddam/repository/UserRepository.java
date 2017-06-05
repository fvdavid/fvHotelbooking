/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fv.fvsaddam.repository;

import fv.fvsaddam.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author fvsaddam
 */
public interface UserRepository extends CrudRepository<User, Long> {
    
    User findByUsername(String username);
    
}
