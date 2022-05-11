package corejava;

import java.util.Scanner;

public class PerformArithmetcicOperation {

	public static void main(String[] args) {
		//create scanner class
    Scanner sc= new Scanner(System.in);
    
    //Input Two No From User
    System.out.println("Enter First No:" );
    int num1=sc.nextInt();
    System.out.println("Enter Second No:" );
    int num2=sc.nextInt();
    
    //Perform Arithmetic operations 
    int add,sub,mul,div,mod;
    add=num1+num2;
    sub=num1-num2;
    mul=num1*num2;
    div=num1/num2;
    mod=num1%num2;
    
    //Print Result
   System.out.println("Addition:"+add);
   System.out.println("Subtration:"+sub);
   System.out.println("Multiplication:"+mul);
   System.out.println("Division:"+div);
   System.out.println("Modulo:"+mod);
  
  	}

}
