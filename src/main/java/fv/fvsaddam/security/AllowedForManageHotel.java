package fv.fvsaddam.security;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.security.access.prepost.PreAuthorize;

/**
 *
 * @author fvsaddam - fvmonster.corp@gmail.com
 */
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@PreAuthorize(AllowedForManageHotel.condition)
public @interface AllowedForManageHotel {

    String condition = "@mySecurityService.canEditHotel(#id, principal) or " + AllowedForAdmin.condition;
    String condition2 = "@mySecurityService.canEditHotel(#vars.hotel.id, principal) or " + AllowedForAdmin.condition;
}
