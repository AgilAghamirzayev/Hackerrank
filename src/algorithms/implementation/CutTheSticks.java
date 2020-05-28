package algorithms.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CutTheSticks {

    static int[] cutTheSticks(int[] arr) {

        List<Integer> ar = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> cuts = new ArrayList<>();

        while (ar.size() != 0){
             Integer min = ar.stream().min(Comparator.comparingInt(a -> a)).orElseThrow(RuntimeException::new);
             cuts.add(ar.size());

            for (int i = 0; i < ar.size(); i++) {
                Integer remove = ar.remove(i);
                remove -= min;
                if (remove != 0) ar.add(i, remove);
                else             i--;
            }
        }

        return cuts.stream().mapToInt(i->i).toArray();

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(cutTheSticks(new int[]{5, 4, 4, 2, 2, 8})));
        System.out.println(Arrays.toString(cutTheSticks(new int[]{1,2,3,4,3,3,2,1})));

        }
}
