/**
 * 2.Given an array of N numbers and a number K, find the minimum number of
 * groups that the array can be split into.
 */
public class app02 {
    public static void main(String[] args) {
        int n = 10;
        int k = 4;
        int base = n / k;
        double decimal = (double) n / k;
        int ans =0;
        if ((decimal - base) != 0)
            ans = base + 1;
        System.out.println(base);
        System.out.println(decimal);
        System.out.println(ans);

    }
}
