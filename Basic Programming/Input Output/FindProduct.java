import java.util.Scanner;
class FindProduct{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        long modulo  = 1000000007;
		int size = in.nextInt();
		long product = 1;
		long[] numberArray = new long[size];
		for (int i=0;i<size;i++) {
			numberArray[i] = in.nextInt();                   
			product = (product * (numberArray[i])) % modulo;
		}
		System.out.println(product);
	}
    
}
