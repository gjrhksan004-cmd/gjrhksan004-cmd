import java.util.*; 

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); 

       
        while (T-- > 0) {

            int n = sc.nextInt(); 

            
            HashMap<String, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {

                String name = sc.next(); 
                String type = sc.next(); 

                if (map.containsKey(type)) {
                    map.put(type, map.get(type) + 1);
                }
                else {
                    map.put(type, 1);
                }
            }

            
            int result = 1;

            for (int count : map.values()) {

                result *= (count + 1);
            }

            result -= 1;

            System.out.println(result);
        }
    }
}
