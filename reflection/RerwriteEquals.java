
public class RerwriteEquals {
	public  static  void main(String[] args){
		parent p1 = new parent("p1", new Ref("ref-p1"));
		parent p2 = new parent("p2", new Ref("ref-p2"));
		System.out.println(p1.equals(p2));
		child chld = new child();
		nchld nhld = new nchld();
		parent p3 = new parent("child", new Ref("parent"));
		System.out.println(chld.equals(nhld));
		System.out.println(chld.equals(p3));
		System.out.println(p3.equals(chld));
		System.out.println(p3.equals(nhld));
		System.out.println(nhld.equals(p3));
		System.out.println("=============");
		Super sper = new Super();
		SubOne so = new SubOne();
		SubOne so2 = new SubOne();
		System.out.println(sper.equals(so));
		System.out.println(so.equals(sper));
		System.out.println(so2.equals(so));
		System.out.println(so.equals(so2));
		System.out.println("-------------");
		System.out.println(so2);
		System.out.println(so);
		System.out.println(sper);
		System.out.println(so2.hashCode());
		System.out.println(so.hashCode());
		System.out.println(sper.hashCode());
	}
}

class Super{
	String str;
	Super(){
		str = "super!";
	}
	@Override
	public boolean equals(Object o){
		if(this == o){
			return true;
		}
		if(o == null){
			return false;
		}
		if(getClass() != o.getClass()){
			return false;
		}
		Super other = (Super)o;
		return str.equals(other.str);
	}
	@Override 
	public String toString(){
		return getClass().getName() + " [" + str + " ]";
	}
	@Override
	public int hashCode(){
		return str.hashCode();
	}
}
class SubOne extends Super{
	int i;
	@Override
	public boolean equals(Object o){
		if(!super.equals(o)){
			return false;
		}
		SubOne other = (SubOne)o;
		return i == other.i;
	}
	@Override
	public String toString(){
		return super.toString() + " [" + i + "]";
	}
	@Override
	public int hashCode(){
		return super.hashCode() + new Integer(i).hashCode();
	}
}


class parent{
	@Override
	public final boolean equals(Object o){
		if(this == o){
			return true;
		}
		if(o == null){
			return false;
		}
		if(! (o instanceof parent)){
			return  false;
		}
		parent other = (parent)o;
		return i == other.i && str.equals(other.str);
		// && ref.equals(other.ref);
	}
	public parent(String str, Ref ref){
		this.str = str;
		this.ref = ref;
	}
	int i;
	String str;
	Ref ref;
}
class Ref{
	Ref(String s){
		this.str = s;
	}
	public boolean equals(Object o ){
		if(o == null || !(o instanceof Ref)){
			return false;
		}
		Ref other = (Ref)o;
		if(str.equals(other)){
			return true;
		}
		return false;
	}
	public String str;
}
class nchld extends parent{
	public nchld(){
		super("child", new Ref("nchld ref"));
	}
}
class child extends parent{
	public child (){
		super("child", new Ref("child ref"));
	}
}