package edu.pitt.dbmi.daquery.update;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) //can use in method only.
public @interface DBVersion {

	//should ignore this test?
	public float version();
	public String ddlFile() default "";

}