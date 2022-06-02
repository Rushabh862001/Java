package Corejava;
import java.io.*;
public class BufferedWriterEx {

	public static void main(String[] args) throws Exception{
		
		FileWriter write = new FileWriter("D:\\MyFile.txt");
		
		BufferedWriter bw= new BufferedWriter(write);
		
		bw.write("Welcome to Anudip Foundation"); 
	    
	    bw.close();  
	    
	    System.out.println("Success");  
	}
	
}
				