
public class Operations {
	byte b=10;
	byte b1=20;
	short s=130;
	short s1=140;
	int i=3350;
	int i1=3360;
	 void add()
	{
		System.out.println("addition="+(b+b1));
		System.out.println("addition="+(s+s1));
		System.out.println("addition="+(i+i1));
	}
	 void sub()
		{
			System.out.println("sub="+(b-b1));
			System.out.println("sub="+(s-s1));
			System.out.println("sub="+(i-i1));
		}
	 void mul()
		{
			System.out.println("mul="+(b*b1));
			System.out.println("mul="+(s*s1));
			System.out.println("mul="+(i*i1));
		}
	 void div()
		{
			System.out.println("div="+(b/b1));
			System.out.println("div="+(s/s1));
			System.out.println("div="+(i/i1));
		}
	 void add1()
	 {
		 byte b3=(byte)(b+b1);
		 System.out.println(b3);
	 }
	public static void main(String[] args) {
		Operations p=new Operations();
		p.add();
		p.sub();
		p.mul();
		p.div();
		p.add1();

	}

}
