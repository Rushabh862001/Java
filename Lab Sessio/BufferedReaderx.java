package Corejava;
import java.io.*;

public class BufferedReaderx {

	public static void main(String[] args) throws Exception{
		
		
FileReader Fr = new FileReader("D:/MyFile.txt");
		
		BufferedReader Br = new BufferedReader(Fr);
		
		int i;
		
		while ((i=Br.read())!=-1){
			System.out.print((char)i);
			}
		
		Br.close();
		Fr.close();
	}

}
