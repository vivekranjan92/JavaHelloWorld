import java.util.Scanner;  

public class InputTest{  

 public static void main(String args[]){ 

	   Scanner sc=new Scanner(System.in);  
       
   		System.out.print("Enter a number: ");
    	int number = sc.nextInt();

    if(number < 100){ 
    	System.out.println("HELLO World");
    	}
    else {
    	System.out.println("BYE-BYE World");
    	}
 	}  
}