package metaAnnDriver;

import java.lang.annotation.Annotation;
import metaAnontation.InheritedMeta;

@InheritedMeta
class InheritedMetaClass{
	static void show() {
		System.out.println("Every Class that inherits this class will need to use this annotation as well");
	}
}

class SubInheritedMetaClass extends InheritedMetaClass{
	static void show(){
		System.out.println("This will give error if @Inherited Annotation is not used");
	}
	
	/*
	 * This will not give the null Pointer exception we were getting in DriverType main
	 * 		It's because of Retention MetaAnnotation.
	 * 		We are specifying the retention of the annotation till runtime.
	 */
	static void accessAnnotationValue() {
		SubInheritedMetaClass obj = new SubInheritedMetaClass();

		Class c = obj.getClass();
		Annotation annObj = c.getAnnotation(InheritedMeta.class);
		InheritedMeta annMetaInheritedObj = (InheritedMeta) annObj;
		System.out.println("Str : "+annMetaInheritedObj.str());
	}
}



public class DriverMeta {
	public static void main(String[] args) {
		InheritedMetaClass.show();
		SubInheritedMetaClass.show();
		SubInheritedMetaClass.accessAnnotationValue();
	}
}
