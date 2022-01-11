package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Driver {
	public static void main(String[] args) {
		
		//Writing in the file
		Driver.fileInput();
		
		//Reading from the file
		Driver.fileOutput();
	}
	
	public static void fileInput() {
		try {
			FileInputStream reader =new FileInputStream("C:\\Users\\ShivR\\Downloads\\test.txt");    
            int i=0;    
            while((i=reader.read())!=-1){    
             System.out.print((char)i);    
			}
			reader.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			
		}
	}
	
	public static void fileOutput() {
		try{    
			FileOutputStream fout=new FileOutputStream("C:\\Users\\ShivR\\Downloads\\test.txt");    
			String s="This is my test file";    
			byte b[]=s.getBytes();//converting string into byte array    
			fout.write(b);    
			fout.close(); 
		}
		catch(Exception e)
		{
			System.out.println(e);
			}        
	}

}
