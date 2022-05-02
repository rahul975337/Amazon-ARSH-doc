import java.util.*;

/*
6.Give a linked list,which has even number of nodes, please return the maximum sum of PAIR
A pair means the node[i] and node[n-i], which n is linked list length.
example: [1,2,3,4,9,11]
1st pair sum: 1 + 11 = 12
2nd pair sum: 2 + 9 = 11
3rd pair sum: 3 + 4 = 7
Therefore, return 12
 */
// here i have used map another approach is to reverse half of the linkedlist and then iterate on both the halves
public class app06 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 9, 11 };
        Node root = new Node(arr[0]);
        Node temp = root;
        for (int i = 1; i < arr.length; i++) {
            Node node = new Node(arr[i]);
            temp.next = node;
            temp = node;
        }
        temp = root;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null)
                System.out.print("=>");
            temp = temp.next;
        }

        Map<Integer, Integer> map = new LinkedHashMap<>();
        temp = root;
        int idx = 0;
        while (temp != null) {
            map.put(idx++, temp.data);
            temp = temp.next;
        }

        System.out.println("\n" + map);
        int low = 0;
        int high = map.size() - 1;
        Integer currSum = 0, maxSoFar = 0;

        while (low < high) {
            currSum = map.get(low++) + map.get(high--);
            System.out.println(currSum);
            maxSoFar = Math.max(maxSoFar, currSum);
        }

        System.out.println(maxSoFar);

    }
}

class Node {
    int data;
    Node next = null;

    Node(int data) {
        this.data = data;
    }
}

class Triplet {
    int i, j, sum;

    Triplet(int i, int j, int sum) {
        this.i = i;
        this.j = j;
        this.sum = sum;
    }
}
