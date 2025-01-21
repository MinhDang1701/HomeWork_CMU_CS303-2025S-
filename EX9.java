/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;

/**
 *
 * @author ThinkPad
 */
public class EX9 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(17);
        numbers.add(32);
        numbers.add(8);
        numbers.add(45);
        System.out.println("ds cac so: " + numbers);
        int max = numbers.get(0);
        int min = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            int n = numbers.get(i);
            if (n > max) {
                max = n;
            }
            
            if (n < min) {
                min = n;
            }
        }
        System.out.println("Lon nhat: " + max);
        System.out.println("Nho nhat: " + min);
    }
}
