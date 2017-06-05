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
@PreAuthorize(AllowedForApprovingBookings.condition)
public @interface AllowedForApprovingBookings {

    String condition = "@mySecurityService.canApproveBooking(#booking_id, principal) or " + AllowedForHotelManager.condition;
}
