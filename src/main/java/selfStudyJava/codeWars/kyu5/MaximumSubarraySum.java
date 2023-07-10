package selfStudyJava.codeWars.kyu5;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr = new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        if (arr.length==0) {
            System.out.println("0");;
        }
        int sumMax = 0;
        for (int i=0; i < arr.length; i++){
            int sum = 0;
            for (int j=i; j<arr.length; j++){
                sum+=arr[j];
                if (sum>sumMax) {
                    sumMax = sum;
                }
            }
        }
        System.out.println(sumMax);
//        return sumMax;
    }
    
}
