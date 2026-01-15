import java.util.HashMap;
import java.util.Map;

public class Numerals {

    public static int ConvertNumerals(String s) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        map.put('F', 5000);

        int total = 0;
        int count = 0;

        for (int i = s.length()- 1; i >= 0; i--) {
            int N = map.get(s.charAt(i)); //Current
            if (N < count) {
                total -= N;
            } else {
                total += N;
            }
            count = N;
        }
        return total;

    }
    public static void main(String[] args) {
        System.out.println(ConvertNumerals("CIX"));
    }
}
