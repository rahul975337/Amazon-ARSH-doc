import java.util.*;

/*
*3. Given a number, transform it in two numbers p1 and p2 such that sum of p1 and p2 is minimum.
Ex - 4523 - 59 ( 24 + 35)
*/
public class app03 {
    public static void main(String[] args) {
        int n = 4523;
        String str = 4523 + "";
        String[] strArray = str.split("");
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(strArray));
        Collections.sort(arr);
        String num1 = "";
        String num2 = "";
        for (int i = 0; i < arr.size(); i += 2) {
            num1 += arr.get(i);
            num2 += arr.get(i + 1);
        }
        System.out.println(num1);
        System.out.println(num2);

    }
}
