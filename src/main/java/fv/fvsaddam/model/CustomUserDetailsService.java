
package fv.fvsaddam.model;

import fv.fvsaddam.repository.UserRepository;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author fvsaddam
 */
@Service
@Qualifier("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {
    
    @Autowired
    private UserRepository userRepository;
    

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        
        // returns the get(0) of the user list obtained from the db
        User domainUser = userRepository.findByUsername(name);
        String role = domainUser.getAuthority().getRole();
        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        
        authorities.add(new SimpleGrantedAuthority(role));
        
        CustomUserDetail customUserDetail = new CustomUserDetail();
        customUserDetail.setUser(domainUser);
        customUserDetail.setAuthorities(authorities);
        return customUserDetail;
    }
    
}
