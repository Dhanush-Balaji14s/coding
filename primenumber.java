public class primenumber{
    public static void main(String[] args) {
        int start = 10;
        int end = 20;
        for(int n = start;n<=end;n++){
         boollean prime = true;
         if(n < = 1)
            prime = false;
        } else{
            for(int i = 2;i< = n/2;i++){
                if(n%i == 0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                System..out.println(n + " ");
            }
        }
    }
}