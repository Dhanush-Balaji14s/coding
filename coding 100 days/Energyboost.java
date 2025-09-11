public class Energyboost{
    public static void main(String[] args) {                                                                                                                                                                                                 
            int n = 7;
            int[] energy = {2, 1, 5, 1, 3, 2, 6};
            int k = 3;

            int maxSum = Integer.MIN_VALUE;
            for (int i = 0; i <= n - k; i++) {
                int sum = 0;
                for (int j = i; j < i + k; j++) {
                    sum += energy[j];
                }
                System.out.println(energy[i] + " + " + energy[i+1] + " + " + energy[i+2] + " = " + sum);
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
            System.out.println("Maximum energy in " + k + " days: " + maxSum);
    }
}