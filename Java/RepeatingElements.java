import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepeatingElements {
    public static void main(String[] args) {
        int[] inputArray = {11,11,11,33,33,33};
        int n = inputArray.length;
        List<Integer> ls = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        int min = (int)(n/3) + 1;
        for (int i = 0; i < n; i++) {
            int value = hm.getOrDefault(inputArray[i], 0);
            hm.put(inputArray[i], value + 1);
            if (hm.get(inputArray[i]) == min) {
                ls.add(inputArray[i]);
            }
            if (ls.size() == 2) {
                break;
            }
        }
        for (int i = 0; i < ls.size(); i++) {
            System.out.println(ls.get(i));
        }
    }
}
