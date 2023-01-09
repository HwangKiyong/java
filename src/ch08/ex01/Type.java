package ch08.ex01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface Type {
	String name();
	int value();
}
@Retention(RetentionPolicy.CLASS)	//class 생성까지만 지속되는것
@Target(ElementType.FIELD)
@interface Field {
	int value();
}

@Retention(RetentionPolicy.RUNTIME) //객체 생성 후에도 지속되는것
@Target(ElementType.CONSTRUCTOR)
@interface Constructor {
	int value() default 0;
}

@Target(ElementType.METHOD)
@interface Method {
	
}

@Target(ElementType.PARAMETER)
@interface Param{
	
}

@Target(ElementType.LOCAL_VARIABLE)
@Annotation
@interface Local{
	
}

@Target(ElementType.ANNOTATION_TYPE)
@interface Annotation{
	
}

@Target({ElementType.TYPE, ElementType.FIELD})
@interface Universal {
	
}

//annotation 을 만드는 문법은 @을 붙이면 된다.
//field 의 동의어 member variable