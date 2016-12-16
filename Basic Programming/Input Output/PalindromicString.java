import java.util.Scanner;
class PalindromicString{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String orginal = in.nextLine();
		StringBuffer orginalString = new StringBuffer(orginal);
		orginalString = orginalString.reverse();
		if (orginalString.toString().equals(orginal)) {
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
