public class StringExample {
    public boolean confirmFirstAndLastCharAreSame(String str){
        if (str.length()<=1){
            return false;
        }
        if (str.length()==2){
            return false;
        }

        String first2Char = str.substring(0, 2);
        String last2Char = str.substring(str.length() -2);
        return first2Char.equals(last2Char);
    }
    public String reverseString(String str) {
        String result ="";
        for (int i=str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }
        return result;
    }
}
