abstract class A
{
	abstract void show();
}
class B extends A
{
	void show()
	{
        int i=50;
        int j=60;
	    System.out.println(i+j);
	}
}
class C extends A
{
    void show()
    {
        int i=50;
        int j=50;
        int k=50;
        System.out.println(i+j+k);
    }
}
class Abstract{
	public static void main(String args[])
	{
		//A aa=new A();
		B bb=new B();
		C cc=new C();
       // aa.show();
        bb.show();
        cc.show();
	}
}