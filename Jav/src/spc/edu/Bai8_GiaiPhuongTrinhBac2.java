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
public class Bai8_GiaiPhuongTrinhBac2 {
    public static void main(String[] args) {
        System.out.println("CHUONG TRINH GIAI PHUONG TRINH BAC 2");
        double a, b, c;
        Scanner uwu = new Scanner(System.in);
        System.out.print("NHAP SO A: ");
        a = uwu.nextDouble();
        System.out.print("NHAP SO B: ");
        b = uwu.nextDouble();
        System.out.print("NHAP SO C: ");
        c = uwu.nextDouble();
        if (a == 0){
            if (b == 0){
                if (c != 0){
                    System.out.println("PHUONG TRINH VO NGHIEM");
                } else {
                    System.out.println("PHUONG TRINH VO SO NGHIEM");
                }
            } else {
                System.out.println("NGHIEM CUA PHUONG TRINH LA: " + (-c / b));
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0){
                System.out.println("PHUONG TRINH VO NGHIEM");
            } else {
                System.out.println("x1 = " + (-b + (Math.sqrt(delta)) / (2 * a)));
                System.out.println("x2 = " + (-b - (Math.sqrt(delta)) / (2 * a)));
            }
        }
    }
}
