package Corejava;

public class CallByReferenceBySwappingTwoNumber {

	
	//initializing a and b
	int a=10;
	int b=5;
	//swap method
	void swap(CallByReferenceBySwappingTwoNumber  k)
	{
		int temp;
		temp=k.a;
		k.a=k.b;
		k.b=temp;
		System.out.println("before swapping values a="+k.a+" b="+k.b);
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating an object
		CallByReferenceBySwappingTwoNumber  c=new CallByReferenceBySwappingTwoNumber ();
		System.out.println("before swapping values a="+c.a+" b="+c.b);
		//calling swap method by pass-by-value
		c.swap(c);
	}
}







