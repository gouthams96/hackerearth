import java.util.Scanner;
public class MagicalWord {   
    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;       
    }
    
    public static String findPrime(int num){
        int primeOne =0;
        int primeTwo =0 ;
        for(int i=num;i>=65;i--){
            if(isPrime(i)){
                primeOne = i;
                 if(Character.isLetter((char)primeOne) && i>=65){
                    break;
                }
            }
        }
        for(int i=num;i<=126;i++){
            if(isPrime(i)){
                primeTwo = i;
                if(Character.isLetter((char)primeTwo) && i>=65){
                    break;
                }
            }
        }
        
        char magicLetter;
        if(Math.abs(num-primeOne) > Math.abs(num-primeTwo)){
            magicLetter = (char)primeTwo;
        }else if(Math.abs(num-primeOne) < Math.abs(num-primeTwo)){
                if(Character.isLetter((char)primeOne)){
                    magicLetter = (char)primeOne;
                }else{
                    magicLetter = (char)primeTwo;
                }
        }else{
            magicLetter = (char)primeOne;
        }
        return Character.toString(magicLetter);       
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t>0){
            String magicalWord = new String();
            int length = scan.nextInt();
            String word = scan.next();
            for(int i=0;i<word.length();i++){
                magicalWord += findPrime((int)word.charAt(i));
            }
            System.out.println(magicalWord);
            t--;
        }
        scan.close();               
     }   
  }
