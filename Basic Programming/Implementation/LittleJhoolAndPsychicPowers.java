import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String binary = br.readLine().trim();
        System.out.println(binary.contains("000000") || binary.contains("111111")?"Sorry, sorry!":"Good luck!");
    }
}
