import java.lang.reflect.Array;


public class Reflct_array {
	public static void main55(String[] args){
		
		int[] array = {1,2,3,4,5,6};
		int[] another = (int[]) copyArray(array);
		printArray("another", another);
		printArray("array", array);
	}
	public static Object copyArray(Object o){
		if(o == null){
			return null;
		}
		Class cl = o.getClass();
		if(!cl.isArray()){
			System.out.println("in copyArray: not an array");
			return null;
		}
		Object copied = Array.newInstance(cl.getComponentType(), Array.getLength(o));
		System.arraycopy(o, 0, copied, 0, Array.getLength(o));
		return copied;
		
	}
	public static void printArray(String str, Object o){
		if(str != null){
			System.out.println(str);
		}
		if(o == null || !o.getClass().isArray()){
			System.out.println("not an array. stop printing");
			return ;
		}
		Class cl = o.getClass();
		Class type = cl.getComponentType();
		System.out.println(type + " [" + Array.getLength(o) + "]");
		for(int i = 0; i < Array.getLength(o); i++){
			System.out.print(Array.get(o, i) + " ");
		}
		System.out.println("");
		
	}
}
