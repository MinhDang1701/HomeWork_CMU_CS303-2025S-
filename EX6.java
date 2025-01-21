
import java.util.ArrayList;
import java.util.Random;

public class EX6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Integer> n = new ArrayList<>();
        Random rand = new Random();

        
        for (int i = 0; i < 15; i++) {
            n.add(rand.nextInt(50) + 1);
        }

        int soLe = 0;
        int soChan = 0;
        int i = 0;
        while (i < n.size()) {
            if (n.get(i) % 2 == 0) {
                soChan++;
            } else {
                soLe++;
            }
            i++;
        }

        System.out.println("Numbers: " + n);
        System.out.println("Odd count: " + soLe);
        System.out.println("Even count: " + soChan);
    }
}
