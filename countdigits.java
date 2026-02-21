public class countdigits
  {
    public static void main(String[] args)
    {
      int num=12345678;
      int count=0;
      for(;num!=0;num=num/10)
        {
          count++;
        }
      System.out.println("Digits = " + count);
    }
  }
PS D:\java learning> javac countdigits.java
PS D:\java learning> java countdigits
Digits:8
        
