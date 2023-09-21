package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What number do you want to find all of the primes up to? ");
		
		int n = scan.nextInt();
		
		boolean[ ] sieve = new boolean [n];
		
		for (int i=0; i<n;i++) {

			sieve [i] = true;	
		}	
		
		for (int i=2;i<n;i++) {
				
			if (sieve [i]) {
					
				for (int j=i*i;j<n;j+=i) {

					sieve [j] = false;
				}	
			}
		}
		
		for (int i=2;i<n;i++) {
			
			if (sieve[i]) {
				
				System.out.println (i);
			}
		}
	}
}
