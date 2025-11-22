package baisc_string;

public class subSequence {

    public static void main(String []k){
        System.out.println(isSubSeq("abcde","ace"));
        System.out.println(isSubSeq("sdmckjsnksncscs","hjbf"));
        System.out.println(isSubSeq("abcde1223","ace2"));
    }

    public static boolean isSubSeq(String str, String seq) {

        int i =0;
        int j =0;
        while(i<str.length() && j<seq.length()){
            if(str.charAt(i) == seq.charAt(j)){
                j++;
            }
            i++;
        }

        return j==seq.length();
    }
}
