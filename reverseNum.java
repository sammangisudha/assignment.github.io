package reverseNum;

import java.util.Scanner;

public class reverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     System.out.println("enter name");
	     int num=sc.nextInt();
	     int sum=0;
	     while(num>0) {
	    	 sum=(sum*10)+(num%10);
	    	 num=num/10;
	     }
	     System.out.println(sum);  
	}

}
