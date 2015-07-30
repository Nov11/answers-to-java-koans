import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;

public class ObjectInspect {

	public int intField;
	public double doubleField;
	public String stringField;
	public Outer outerField;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("object inspector");
		ObjectInspect oi = new ObjectInspect();
		oi.inspect(ObjectInspect.class);
		System.out.println("--class done -----");
		oi.inspect(11);
		System.out.println("--int done========");
		oi.inspect(1.1);
		System.out.println("--double done   -----");
		oi.inspect("string msg");
		System.out.println("--string msg -----");
		oi.inspect(new int[] {1,2,3,4,5,6});
		System.out.println("--int array  -----");
		Class tmp = new Integer(11).getClass();
		if(tmp.isPrimitive()){
			System.out.println("Integer is primitive");
		}
		System.out.println(tmp);
	}
	void inspect(Object o){
		if(o == null){
			System.out.println("param: null");
			return;
		}
		Class cl = o.getClass();
		if(cl == String.class){
			System.out.println("String: " + o.toString());
			return ;
		}
		if(cl.isArray()){
			Class type = cl.getComponentType();
			System.out.println("array of " + type + " :");
			for(int i = 0; i < Array.getLength(o); i++){
				System.out.print(Array.get(o, i) + " ");
			}
			System.out.println("");
			return ;
		}
//		if(cl.is()){
//			System.out.println("primitive: type=" + cl.getTypeName() + ", value=" + o);
//			return ;
//		}
		do{
			try{
				Field fields[] = cl.getDeclaredFields();
				AccessibleObject.setAccessible(fields, true);
				System.out.println(Arrays.toString(fields));
				for(Field f : fields){
					Class cltmp = f.getType();
					System.out.println("type: " + cltmp + " name: " + f.getName() + " value:" + f.get(o));
				}
			}catch (IllegalAccessException e){
				e.printStackTrace();
			}
			cl = cl.getSuperclass();
		}while(cl != null);
		
	}
}


class Outer{}