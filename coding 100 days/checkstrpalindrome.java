public class checkstrpalindrome {
    public static void main(String[] args) {
        String str = "Madam";
        char[] ch = str.toCharArray();
        String rev = "";
        //used for Reverse the string
        for (int i = ch.length - 1; i >= 0; i--) {
            rev = rev + ch[i];
        }
        //it generally  Checks palindrome (ignore case)
        if (rev.equalsIgnoreCase(str)) {
            System.out.println("String str: "+"Palindrome");
        } else {
            System.out.println("String str: "+"Not a Palindrome");
        }
    }
}
