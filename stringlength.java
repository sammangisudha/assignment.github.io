package stringlength;

import java.util.Scanner;

public class stringlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter name");
     String str=sc.nextLine();
     
     if(str.length()<4) {
    	 System.out.println("name is short");
		}
     else{
    	 System.out.println("name is long");
		}
     }
     
	}


