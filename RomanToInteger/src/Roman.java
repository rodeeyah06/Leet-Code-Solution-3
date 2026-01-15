import java.util.HashMap;
import java.util.Map;

public class Roman {
        public static int ConvertRoman(int P) {
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "I");
            map.put(5, "V");
            map.put(10, "X");
            map.put(50, "L");
            map.put(100, "C");
            map.put(500, "D");
            map.put(1000, "M");


            int total = 0;
            int count = 0;

            for (int i = 0; i < map.size() ; i++) {
                String s = map.get(i);
                while (count < P) {

                }




            }


            return total;
        }
}