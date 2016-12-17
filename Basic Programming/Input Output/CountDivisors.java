import java.util.Scanner;
class CountDivisors{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int start = in.nextInt();
		int end = in.nextInt();
		int number = in.nextInt();
		int divisorFound=0;
		int iter = 1;
		if(start % number == 0){
			iter = number;

		}
		for (int i=start;i<=end;i=i+iter) {
			if(i % number == 0){
				divisorFound++;
			}			
		}
		System.out.println(divisorFound);
	}

}
