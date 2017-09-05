package edu.pitt.dbmi.daquery.rest;


import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.ws.rs.NameBinding;

import edu.pitt.dbmi.daquery.util.UserRoles;

/**
 * This interface comes from this thread: https://stackoverflow.com/questions/26777083/best-practice-for-rest-token-based-authentication-with-jax-rs-and-jersey
 * This interface is used by other REST endpoint classes by leveraging the @Secured
 * annotation for the methods requiring a JWT.
 * This interface also handles role-based authorization.  This thread covers this topic:
 * https://stackoverflow.com/questions/26777083/best-practice-for-rest-token-based-authentication-with-jax-rs-and-jersey/45814178#45814178
 * @author cborromeo
 *
 */

@NameBinding
@Retention(RUNTIME)
@Target({TYPE, METHOD})
public @interface Secured {
	UserRoles[] value() default {};	
}