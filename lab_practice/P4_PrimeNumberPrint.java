package lab_practice;

public class P4_PrimeNumberPrint {
	public static void main(String args[]) {
		System.out.println("Primes from 1 to 100 : ");
		for(int i=2;i<100;i++)
		{
			if(isPrime(i))
				System.out.println(i+" ");
		}
	}
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0) {
				return false;
			}
			
		}
		return true;
	}

}
