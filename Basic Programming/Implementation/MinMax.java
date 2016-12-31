import java.util.*;
import java.io.*;
class MinMax{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<length;i++){
            set.add(in.nextInt());
        }
        Object[] arr = set.toArray();
        Arrays.sort(arr);
        System.out.println((set.size()-1 == ((int)arr[arr.length-1] -(int) arr[0]))?"YES":"NO");
	}

}
