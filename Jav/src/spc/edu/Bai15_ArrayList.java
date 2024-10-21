/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author SPC
 */
public class Bai15_ArrayList {
    public static void main(String[] args) {
        System.out.println("UwU roulette");
        ArrayList owo = new ArrayList();
        for (int i = 0; i < 5; i++) {
            owo.add(i);
        }
        owo.add("UwU");    
        Collections.shuffle(owo);
        owo.remove(0);
        System.out.println(owo);
    }
}
