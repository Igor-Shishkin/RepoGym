package selfStudyJava.codeWars.kyu5;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr = new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        /*
        The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array
        or list of integers:

Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
// should be 6: {4, -1, 2, 1}
Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array.
If the list is made up of only negative numbers, return 0 instead.

Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.
         */

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


        /*

                int m = 0, a = 0, s = 0;
        for(int e : arr) {
            s += e;
            m = Math.min(s, m);
            a = Math.max(a, s - m);
        }
        System.out.println(a);;
         */
//        return sumMax;
    }

}
