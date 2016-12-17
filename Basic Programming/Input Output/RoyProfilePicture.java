import java.util.Scanner;
class RoyProfilePicture{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		int n = in.nextInt();
		int w , h;
		while(n != 0){
			w = in.nextInt();
			h = in.nextInt();
			if(w < l || h < l){
				System.out.println("UPLOAD ANOTHER");
			}else if(w >= l && h >= l){
				if(w == h){
					System.out.println("ACCEPTED");

				}else{
					System.out.println("CROP IT");
				}
			}
			n--;
		}
	}
}
