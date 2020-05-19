package algorithms.implementation;

public class MinimumSwaps2 {

    static int minimumSwaps(int[] arr) {
        boolean[] isVisited = new boolean[arr.length+1];
        int count = 0;
        for (int i = 0; i < isVisited.length-1; i++) {
            int next;
            if (!isVisited[i]){
                isVisited[i] = true;
                if (i != arr[i]-1){
                    int curr = arr[i]-1;
                    while (!isVisited[curr]){
                        isVisited[curr] = true;
                        next = arr[curr]-1;
                        curr = next;
                        ++count;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minimumSwaps(new int[]{4,3,1,2}));
        System.out.println(minimumSwaps(new int[]{2,3,4,1,5}));
        System.out.println(minimumSwaps(new int[]{1,3,5,2,4,6,7}));
    }
}
