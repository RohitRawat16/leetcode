/**
 * rain_water_trapping
 */
public class rain_water_trapping {

    public static void main(String[] args) {
        int []arr = {4,2,0,3,2,5};
        System.out.println(trapping(arr));
    }

    public static int trapping(int []arr) {
                // prefix
        int n = arr.length;
        int[]left = new int[n];
        left[0]= arr[0];
        for (int i = 1; i <n; i++) {
            left[i]=Math.max(left[i-1],arr[i]);
        }
        // suffix
        int[]right=new int[n];
        right[n-1]=arr[n-1];
        for (int i = n-2; i >=0; i--) {
            right[i]=Math.max(right[i+1],arr[i]);
        }
        // calculation
        int sum = 0;
        for (int i = 0; i < n; i++) {
              sum = sum +Math.min(left[i], right[i])-arr[i];            
        }
        return sum;
    }
}