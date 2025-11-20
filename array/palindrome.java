package array;

public class palindrome {

    public static void main(String[] args) {

        String word = "madam";
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length()-1;
        while(start<end){
            if(charArray[start] != charArray[end]){
                System.out.println("false");
            }
            start ++;
            end --;
        }

        System.out.println("true");
        
    }
    
}
