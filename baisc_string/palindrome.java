package baisc_string;

public class palindrome{
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        
        // int num = sc.nextInt();
        // String str = Integer.toString(num);

        String str = "nonan";

        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str){

        int n = str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                
                //not a palindrome
                return false;
            }
        }
        return true;
    }
}