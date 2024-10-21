/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;
/**
 *
 * @author SPC
 */
public class De2cau2 {
    public static void main(String[] args) {
        Scanner uwu = new Scanner(System.in);
        double r, S, V;
        System.out.print("Nhap ban kinh: ");
        r = uwu.nextDouble();
        S = 4 * Math.PI * (r * r);
        V = 4 * Math.PI * (r * r * r) / 3;
        System.out.println("Dien tich hinh tron la: " + S);
        System.out.println("The tich hinh tron la: " + V);
    }
}
