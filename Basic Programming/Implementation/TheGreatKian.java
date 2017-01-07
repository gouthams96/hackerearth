import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
class TheGreatKian {
    public static void main(String args[] ) throws Exception {
       BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long[] array = Arrays.stream(br.readLine().trim().split(" ")).mapToLong(Long::parseLong).toArray();
        long one=0,two=0,three=0;
        for(int i=0;i<n;i+=3){
            one+=array[i];
            if(i+1<n){
                two+=array[i+1];
            }
            if(i+2<n){
                three+=array[i+2];
            }     
        }
         System.out.println(one+" "+two+" "+three);
    }
}
