public class whilereverse{
public static void main(String[] args)
{
int num=1714;
int rev=0;
while(num!=0){
int digit = num % 10;
rev = rev*10+digit;
num=num/10;
}
System.out.println("Reverse : " + rev);
}
}
PS D:\java learning> javac whilereverse.java
PS D:\java learning> java whilereverse
Reverse : 4171
