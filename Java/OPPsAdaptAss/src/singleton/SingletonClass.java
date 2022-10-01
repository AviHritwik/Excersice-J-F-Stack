package singleton;

public class SingletonClass {
	public static SingletonClass obj=null;
	private SingletonClass() {
		
	}
	
	public static SingletonClass getSingleton() {
		if(obj == null) {
			obj= new SingletonClass();
		}
		return obj;
	}
}
