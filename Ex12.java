/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ThinkPad
 */
public class Ex12 {

    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            n.add(rand.nextInt(100) + 1);
        }
        System.out.println("Ds cac so: " + n);
        int sum = 0;
        for (int i = 0; i < n.size(); i++) {
            sum += n.get(i);
        }
        
        System.out.println("Tong : " + sum);
    }
}
