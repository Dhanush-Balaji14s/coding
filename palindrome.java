public class Main
{
    public static void main(String[] args){
        int num=171;
        int temp= num;
        int rev=0;
        while(num!=0){
            int digit = num%10;
            rev=rev*10+digit;
            num = num/10;
        }
        if(temp==rev){
            System.out.println("Palindrome");
        }
        else{
           System.out.println("Not Palindrome"); 
        }
    }
}
[Done] exited with code=1 in 0.881 seconds

[Running] cd "d:\java learning\" && javac palindrome.java && java palindrome
Palindrome

[Done] exited with code=0 in 1.072 seconds
