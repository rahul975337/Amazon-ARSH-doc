import java.util.*;
/*
 5. You have n packets of some size, n[i] that need to be transferred optimally over m channels.
Rules:
Every channel must transfer at least one packet.
The optimal solution is one where quality of transfer is highest
Quality is defined as the sum of medians of packets(if float, take the next highest integer) transferred over each channel
Median is defined as the middle element in a non-decreasing array of elements. If even, it is the average of the middle two elements.
Return the maximum possible quality of transfer.
Eg 1. n= 3, packets=[2,6,3], m=2
Send packet 6 via 1st channel. Median = 6
Send packets 2,3 via 2nd channel. Median = (2+3)/2=2.5
6+2.5 = 8.5 ~ 9
Output: 9
*/
//TODO:
public class app05 {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = { 2, 6, 3 };
        int m = 2;


    }
}
