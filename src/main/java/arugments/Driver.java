package arugments;

public class Driver {
	
	public static void main(String[] args) {
		
		//Program argument & System argument
		
		//Accessing the value of Program arguments
		if(args.length >0) {
			for(String a: args) {
				System.out.print(a +" ");
			}
		}
	}

}

