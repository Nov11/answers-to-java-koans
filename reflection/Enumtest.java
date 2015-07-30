import java.util.Scanner;

public class Enumtest {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		String input = scanner.next().toUpperCase();
//		Size s = Enum.valueOf(Size.class, input);
//		System.out.println(s.getAbbre());
//		
//	}
//
//}
//enum Size{
//	SMALL("s"), MEDIUM("m"), LARGE("l"), EXTRA_LARGE("el");
//	Size(String s){
//		this.str = s;
//	}
//	private String str;
//	public String getAbbre(){
//		return str;
//	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.next().toUpperCase();
		SIZE s = Enum.valueOf(SIZE.class, input);
		System.out.println(s.getAbbr());
		System.out.println(s);
		switch(s){
		case SMALL:
			System.out.println("small");
			break;
		case MEDIUM:
			System.out.println("medium");
			break;
		case LARGE:
			System.out.println("large");
			break;
		case EXTRA_LARGE:
			System.out.println("extra_large");
			break;
		default:
			System.out.println("default");
		}
		sc.close();
	}
}

enum SIZE{
	SMALL("s"), MEDIUM("m"), LARGE("l"), EXTRA_LARGE("el");
	private String abbr;
	SIZE(String astr){
		abbr = astr;
	}
	public String getAbbr(){
		return abbr;
	}
}