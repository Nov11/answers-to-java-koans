

public class TestStaticCon { 
    public static int a = 0;
      static {  
        a = 10;
          System.out.println("1父类的非静态代码块在执行a=" + a); 
    }   
    {  
        a = 8;
          System.out.println("2父类的非静态代码块在执行a=" + a); 
    }
      public TestStaticCon() { 
 
        this("3a在父类带参构造方法中的值：" + TestStaticCon.a); // 调用另外一个构造方法  
        System.out.println("test" + a);  
        System.out.println("4父类无参构造方法在执行a=" + a); 
    }
      public TestStaticCon(String n) {  
    	System.out.println("first line in constr " + a);
        System.out.println(n);  
        System.out.println("test(string)"+a);
      }
      public static void main(String[] args) {  
        
          System.out.println("5!!!!!!!!!!!!!!!!!!!!!");  TestStaticCon tsc = null;
        tsc = new TestStaticCon(); 
    }
}