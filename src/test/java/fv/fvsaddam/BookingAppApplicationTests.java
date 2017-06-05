package fv.fvsaddam;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class BookingAppApplicationTests {

    @Test
    public void testEncode() {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        
        String password = "user123";
        String hash = encoder.encode(password);
        System.out.println("hash: " + hash);
        
        Assert.assertNotNull(hash);
    }

}
