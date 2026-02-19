public class sumfirst100.java
  {
    public static void main(String[] args)
    {
      int sum=0;
      for(int i=1;i<=100;i++)
        {
          sum += i; 
          //sum=sum+i; 0+1=1+2=3+3=6+4=10+5=15.....sum=4950+100=5050 ->output 
        }
      System.out.println("sum :" +sum);
    }
  }
      
