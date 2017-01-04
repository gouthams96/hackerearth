import java.io.BufferedReader;
import java.io.InputStreamReader;
class ToggleString {
    public static void main(String args[] ) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for(char c: s.toCharArray()){
            System.out.print(Character.isLowerCase(c)?Character.toUpperCase(c):Character.toLowerCase(c));
        }
     
    }
}
