package metaAnontation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Inherited
/*
 * Inherited Meta Annotation
 * Suppose a class annotation use this custom
 * Every class inheriting this class will also have the annotation
 */
@Documented
/*
 * Documented Meta Annotation
 * The Annotation With this Meta Annotation Will be added to the documents
 */
@Target(ElementType.TYPE)
/*
 * Target Meta Annotation
 * This decide with what it can be used like class, method, variable etc
 */
@Retention(RetentionPolicy.RUNTIME)
/* Retention Meta Annotation
 * This decide till when the annotation will persist.
 * This was reason behind the NullPointer error in DriverType Run
 */
public @interface InheritedMeta {
	String str() default "ABC";
}
