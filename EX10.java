import java.util.ArrayList;
import java.util.Scanner;

public class EX10 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap sl ten:");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Nhap ten:");
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            names.add(name);
        }

        ArrayList<String> kq = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            boolean tenTrung = false;
            for (int j = 0; j < kq.size(); j++) {
                if (kq.get(j).equals(name)) {
                    tenTrung = true;
                    break;
                }
            }
            if (!tenTrung) {
                kq.add(name);
            }
        }

        System.out.println("KQ: " + kq);
    }
}



