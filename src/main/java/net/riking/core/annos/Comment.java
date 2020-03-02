package net.riking.core.annos;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ ElementType.FIELD, ElementType.TYPE })
@Retention(RUNTIME)
public @interface Comment {
	String value() default "";
	String dictKey() default "";
}
