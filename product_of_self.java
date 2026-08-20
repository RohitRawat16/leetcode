public class product_of_self {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[]a= product(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static int[] product(int[] arr) {
        int n = arr.length;
        // prefix
        int[] left = new int[n];
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }
        // suffix
        int []right = new int[n];
        right[n-1] = 1 ;
        for (int i = n-2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }
        // calculation
for (int i = 0; i < n; i++) {
    left[i] = left[i] * right[i];
}
return left;
    }
}
