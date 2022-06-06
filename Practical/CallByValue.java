package Corejava;

public class CallByValue {
 
	static void swap(int a,int b) {
	int temp=a;
	a=b;
	b=temp;
	System.out.println("after swapping x="+a+"and y="+b);
	}
	//Main driver method
	public static void main(String[]args) {
		int x=5;
		int y=7;
		
		System.out.println("before swapping x="+ x+" and y="+ y );
	
		swap(x,y);
	}
	
}