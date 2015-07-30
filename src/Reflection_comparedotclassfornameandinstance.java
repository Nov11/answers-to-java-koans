import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Reflection_comparedotclassfornameandinstance {
	public static void main(String[]args){
		System.out.println("abc");
		System.out.println("1" + Mockd.class.getClass());
		try {
			System.out.println("2" + Class.forName("Mockd").getClass());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Mockd m = new Mockd();
		System.out.println("3" + m.getClass());
		view(Mockd.class);
		try {
			view(Class.forName("Mockd"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		view(m);
		Class c1 = Mockd.class;
		printFields(c1);
		Class c2;
		try {
			c2 = Class.forName("Mockd");printFields(c2);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Mockd dd = new Mockd();
		Class c3 = dd.getClass();
		printFields(c3);
		
		System.out.println("###########");
		if(dd.getClass() == Mockd.class){
			System.out.println("1equals");
		}
		try {
			if(dd.getClass() == Class.forName("Mockd")){
				System.out.println("2equals");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Object obj = dd.getClass();
		Class oc = obj.getClass();
		if(oc == Mockd.class){
			System.out.println("3equals too");
		}
		System.out.println(oc);
		System.out.println(obj);
		System.out.println(dd.getClass());
		if(obj instanceof Class){
			System.out.println("yes!");
		}
	}
	static void view(Object o){
		//System.out.println(o.getClass());
//		System.out.println((Class)o);
		//printFields((Class)o);
	}
	   public static void printFields(Class cl)
	   {
		   System.out.println("!!!");
	      Field[] fields = cl.getDeclaredFields();

	      for (Field f : fields)
	      {
	         Class type = f.getType();
	         String name = f.getName();
	         System.out.print("   ");
	         String modifiers = Modifier.toString(f.getModifiers());
	         if (modifiers.length() > 0) System.out.print(modifiers + " ");         
	         System.out.println(type.getName() + " " + name + ";");
	      }
	   }
}


class Mockd{
	public int a;
}