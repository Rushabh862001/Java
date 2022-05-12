package corejava;
import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
	
    int i=1,n;
   
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the num:");	
		n=sc.nextInt();
		while(i<=10){
			System.out.println(i*n);
			i++;
		}
				
	}
}
