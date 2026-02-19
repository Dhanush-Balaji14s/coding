public class Factorialof10
  {
    public static void main(String[] args)
    {
      int fact = 1;
      for(int i=1;i<=10;i++)    
        {
          fact = fact*i; // fact *=i;
        }
          System.out.println("Factorial of 10: "+fact);
    }
  }
//while loop
// public class Main{
//     public static void main(String[] args){
//         int i=1;
//         int fact = 1;
//         while(i<=10){
//             i++;
//             fact *= i;
//             System.out.println("Factorial of 10 :" +fact);
//         }
//     }
// }
