package training;

import java.util.HashMap;

public class HappyGarbage01 {
    public static void main(String [] args)
    {
        var map = new HashMap<String, Integer>();
        map.put("One", 1);
        map.merge("Two", 1, Integer::sum);
        map.merge("Two", 1, Integer::sum);
        map.merge("Two", 1, Integer::sum);
        map.merge("Two", 1, Integer::sum);
        System.out.println(map.get("Two"));
    }
    static int sum(int n) {
        if (n == 1) return 1;
        return n + sum(n - 1);
    }
}
