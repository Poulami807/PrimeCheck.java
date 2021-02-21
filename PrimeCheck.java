package Assignment;

import java.util.Scanner;
public class PrimeCheck {
	public static void main(String[] args) {
		int num;	
		Scanner sc= new Scanner(System.in);
		System.out.println("Please insert any number");
		num=sc.nextInt();
		sc.close();
		boolean isPrime=true;
		for(int i=2;i<num;i++) {
			if(num%2==0) {
				isPrime=false;
			}
		}
		if(isPrime)
			System.out.println(num+" is a prime number");
		else
			System.out.println(num+" is not a prime number");
	}

}
