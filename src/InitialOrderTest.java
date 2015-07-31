/**
 * 
 * 类加载时先跑静态初始化，包括直接赋值和静态初始化
 * 每次构造都运行初始化块的代码
 * @author c6s
 *
 */

public class InitialOrderTest {             
    // 静态变量        
    public static String staticField = "静态变量11";        
    // 变量        
    public String field = "变量";   
    public String fieldStaticInit = assign();
    // 静态初始化块      
    static {        
        System.out.println(staticField);
        System.out.println("静态初始化块");
        //System.out.println(staticField2);
    }                
//    public static String staticField2 = "静态变量2"； //can't ref a field before it is defined
    // 初始化块            
    {        
        System.out.println(field);
        System.out.println("初始化块");      
    }          
    public static String assign(){
    	System.out.println("assign");
    	return "assigned";
    }
    // 构造器        
    public InitialOrderTest() {
        System.out.println("构造器");   
    }                
    public InitialOrderTest(int i){
    	System.out.println("alal " + i);
    }
    {
    	System.out.println("after constructor");
    }
    public static void main(String[] args) {
        new InitialOrderTest();   
        new InitialOrderTest(1);
    }        
}