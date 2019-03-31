
public class RecusiveAndIteration {
	
	public static long Summation1(long n) {
		if (n <= 1)
			return n;
		if (n == 2)
			return 1;
		if (n % 2 == 0)
			return (n - 1) + Summation(n - 3);
		else
			return (n) + Summation(n - 2);
	}

	public static void main1(String[] args) {
		System.out.println(Summation1(1000));
	}

	public static long Summation(long n) {
		if (n <= 1)
			return n;
		if (n == 2)
			return 1;
		if (n % 2 == 0)
			return (n - 1) + Summation(n - 3);
		else
			return (n) + Summation(n - 2);
	}

	public static void main(String[] args) {
		System.out.println(Summation(1000));
	}	

}
