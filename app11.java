import java.util.*;

public class app11 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2 }, { 1, -1 }, { 3, 4 } };
        int k = 2;
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int[] temp = arr[i];
            int dist = (int) Math.sqrt(Math.pow(temp[0], 2) + Math.pow(temp[1], 2));
            list.add(new Pair(i, dist));
        }

        Collections.sort(list, new MyCmp());
        int len = list.size();
        for (int i = k; i < len; i++) {
            list.remove(i);
        }
        for (int i = 0; i < len; i++) {
            System.out.print(Arrays.toString(arr[list.get(i).idx]) + "\n");
        }
    }
}

class Pair {
    int idx, dist;

    Pair(int idx, int dist) {
        this.idx = idx;
        this.dist = dist;
    }

}

class MyCmp implements Comparator<Pair> {

    public int compare(Pair o1, Pair o2) {
        return o1.dist - o2.dist;
    }
}