import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public class ReflectFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		view(Lookinto.class, "");
		System.out.println("####");
		view(Mock.class, "");
		System.out.println("$$$$");
		Lookinto li = new Lookinto();
		view(li, "java.lang.String");
	}
	static void view(Object o, String name){
		Class cl =  o.getClass();
		System.out.println("Name of cl: " + cl);
		if(!name.isEmpty()){
			try {
				Class c = Class.forName(name);
				System.out.println("Name of c: " + c.getName());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		Field[] f = cl.getFields();
		System.out.println("num of fields: " + f.length);
		AccessibleObject.setAccessible(f, true);
		for(Field tmpField : f){
			System.out.println("name: " + tmpField.getName());
			System.out.println("type: " + tmpField.getType());
			try {
				System.out.println(tmpField.get(o));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("================");
		}
	}
}

class Lookinto{
	 int i;
	public double d;
	public String str;
}
class Mock{}