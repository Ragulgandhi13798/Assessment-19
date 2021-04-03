package overridingeg;

class A
{
	public int multi(int a,int b,int c)
	{
		return a*b*c;
	}
}

 class B extends A
{
	public int multi(int a,int b,int c)
	{
		return a*b*c;
	}

}
public class Multi {

	public static void main(String[] args) {
		
		B b = new B ();
		int d=b.multi(4,6,2);
		System.out.println(d);
		A a = new A ();
		int e =a.multi(9, 6, 4);
		System.out.println(e);
		
	}

}
