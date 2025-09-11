class secondsmallestnumber{
    public static void main(String[] args) {
        int[] arr = {10,20,5,50,15};
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
       // int first = Integer.MIN_VALUE;
       //int second = Integer.MIN_VALUE;
        for (int i = 0;i < arr.length; i++) {
           if (arr[i] < first) {
            // if (arr[i] > first) {
               second = first;                                                                                                                      
               first = arr[i];
           } else if (arr[i] < second && arr[i] != first) {
               second = arr[i]; 
           }
        }
        System.out.println("Second smallest number: "+second);
    }
}