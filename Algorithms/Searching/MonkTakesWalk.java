import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while(testCase>0){
            String tree = br.readLine().trim().toLowerCase();
            System.out.println(tree.length()-tree.replaceAll("a|e|i|o|u","").length());
            testCase--;
        }
          br.close();
    }
}
