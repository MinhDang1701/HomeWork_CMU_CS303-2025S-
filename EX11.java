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
public class EX11 {

    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            n.add(rand.nextInt(100) + 1);
        }
        System.out.println("Ds so random: " + n);
        int max = n.get(0);
        int min = n.get(0);
        for (int i = 1; i < n.size(); i++) {
            int temp = n.get(i);
            if (temp > max) {
                max = temp;
            }
            if (temp < min) {
                min = temp;
            }
        }
        System.out.println("Max:  " + max);
        System.out.println("Min: " + min);
    }
}


