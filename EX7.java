/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;

/**
 *
 * @author ThinkPad
 */
public class EX7 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("So ban dau: " + numbers);
        int n = numbers.size();
        for (int i = 0; i < n / 2; i++) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(n - i - 1));
            numbers.set(n - i - 1, temp);
        }
        System.out.println("Dao nguoc mang: " + numbers);
    }
}



