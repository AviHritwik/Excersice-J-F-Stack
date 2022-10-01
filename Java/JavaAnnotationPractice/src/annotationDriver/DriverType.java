package annotationDriver;
import java.lang.annotation.Annotation;
import customAnotation.MarkerAnnotationEx;
import customAnotation.MultiValueDefaultAnnEx;
import customAnotation.SingleValueAnnEx;
import customAnotation.SmartPhoneMultiValueAnn;

@MarkerAnnotationEx 
class MarkerAnnClass {
	static void show() {
		System.out.println("This is a class with marker annotation");
	}
}

@SingleValueAnnEx(exmaple = "This")
class SingleAnnClass{
	static void show() {
		System.out.println("This is a single valued annotation class,It forces you to provide value for example");
	}
}

@SmartPhoneMultiValueAnn(os = "Mac", version = 10)
class MultiValueAnnClass{
	static void show() {
		System.out.println("This a class with annotation having multiple fields.");
	}
}

@MultiValueDefaultAnnEx
class MultiValueDefaultAnnClass{

	static void show() {
		System.out.println("This is a class with multivalue annotation but with default value. So, it doesn't force you to provide a value.");
	}
	
	/*
	 * Executing this function will give runtime NullPointerException
	 * 	Reason : It's cause the annotation is not available till run time.
	 * 				It will be removed in compilation only.
	 */
	static void accessAnnotationValue() {
		MultiValueDefaultAnnClass obj = new MultiValueDefaultAnnClass();

		Class c = obj.getClass();
		Annotation annObj = c.getAnnotation(MultiValueDefaultAnnEx.class);
		MultiValueDefaultAnnEx annMultiObj = (MultiValueDefaultAnnEx) annObj;
		System.out.println("Name : "+annMultiObj.name());
	}

	int a;
	int b;

	public MultiValueDefaultAnnClass() {
		this.a = 1;
		this.b = 2;
	}
}

public class DriverType{
	public static void main(String[] args) {
		MarkerAnnClass.show();
		SingleAnnClass.show();
		MultiValueAnnClass.show();
		MultiValueDefaultAnnClass.show();
		try {
			MultiValueDefaultAnnClass.accessAnnotationValue();
		}
		catch(NullPointerException ex) {
			System.out.println("Access function is throwing Null Pointer Exception. You can find reason in the comment.");
		}
	}
}
