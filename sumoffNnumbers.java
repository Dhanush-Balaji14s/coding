public class sumoffNnumbers {
    public static void main(String[] args) {
       int n = 20;
       int sum = getsum(n);
       System.out.println(sum);
    }
    public static int getsum(int n){
    if(n==0){
        return 0;
    }
    else{
        return n + getsum(n-1);
    }
    }
}
