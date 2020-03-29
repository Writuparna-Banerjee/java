class Test 
{
	int a,b;
	void getdata(int i, int j)
	{
		a=i;
		b=j;
	}
	void math (Test o)
	{
		o.a = o.a*2;
		o.b = o.b/2;
	}
}
class CallByRef
{
	public static void main(String args[])
	{
        Test ob = new Test();
		ob.getdata(15,20);
		System.out.println("ob.a and ob.b before call" +ob.a +ob.b);
		ob.math(ob);
		System.out.println(" ob.a and ob.b  after call" +ob.a +ob.b);
	}
}