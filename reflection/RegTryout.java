

public class RegTryout {
	
	public static void main123(String[] args) {
		// TODO Auto-generated method stub
/*		String reg = "^(cntaobao|cnalichn)";
		Pattern p = Pattern.compile(reg);
		String[] testCase = new String[] {"cntaobao.alalall"
				, "cnalichnalalal","abcdefghijklmnopqrstuvwxyz"};
		Matcher m;
//		= p.matcher("cntaobao.abc");
		for(String iter: testCase){
			m = p.matcher(iter);
			while(m.find()){
				System.out.println(iter + " : ");
				System.out.println(iter.substring(m.start(), m.end()));
			}
		}*/
		Obj o  = new Obj();
		System.out.println(o.ref1+" " + o.ref2);
		Prote p = new Prote("abc");
		ProteSub ps = new ProteSub("def");
		System.out.println("ps.getStr(p): " + ps.getStr(p));
		System.out.println(ps.str);
		System.out.println(p.equals(ps));
		Class cl = p.getClass();
		ProteSub pss = new ProteSub("abcbb");
		Prote prote = (Prote)pss;
		ProteSub pss2 = (ProteSub)prote;
		Prote prote2 = new Prote("lalal");
		//pss2 = (ProteSub)prote2;
		lal aaabbbsss = new lal();
		Inter.rett();
		pss2.asdf(1111);
		pss2.asdf(1.22);
	}
	String abc = "abc";
	public String getAbc(){
		return abc;
	}
	private void variargs(String[] str, int abc){
		int a = str.length;
		System.out.println(a);
	}

}

abstract class abs{
	String s;
	static int abc ;
	static void rett(){}
}
class lal extends abs{
	
}
 interface Inter{
	double d = 11;
	static int abc = 11;
	static void rett(){System.out.println("alalallalaallala");}
}
 class Innter implements Inter{
	 public void chg(){//d = 111;
	 }
 }
class Obj{
	 String str;
	 String ref1;
	 int ref2;
	public Obj(){
		str = "111";
	}
}

class Prote{
	protected String str;
	public Prote(String astring){
		str = astring;
	}
	void asdf(int a){System.out.println("Prote.asdf");}
	void asdf(double d){System.out.println("Prote.asdf dou");}
}

class ProteSub extends Prote{
	public ProteSub(String astring){
		super(astring);
	}
	public String getStr(Prote p){
		return p.str; 
	}
	void asdf(int a){System.out.println("sub");}
}
