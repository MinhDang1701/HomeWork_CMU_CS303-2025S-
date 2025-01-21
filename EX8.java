/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;

/**
 *
 * @author ThinkPad
 */
public class EX8 {

    public static void main(String[] args) {
        ArrayList<String> traiCay = new ArrayList<>();
        traiCay.add("chuoi");
        traiCay.add("tao");
        traiCay.add("dua");
        traiCay.add("nho");
        traiCay.add("dau tay");
        System.out.println("ds trai cay: " + traiCay);
        ArrayList<String> copy = new ArrayList<>(traiCay);
        System.out.println("copy : " + copy);
    }
}
