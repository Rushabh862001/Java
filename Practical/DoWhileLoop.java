package corejava;

import java.util.Scanner;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int num,sum;
		sum=0;
		num=0;
		
		do {
			sum+= num;
			System.out.println("Enter a number:");
			num=sc.nextInt();
			}
		while(num>=0);
			System.out.println("The Sum of Number are:" + sum);
		sc.close();
	}

}
