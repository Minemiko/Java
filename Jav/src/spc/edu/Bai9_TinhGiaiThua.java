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
public class Bai9_TinhGiaiThua {
    public static void main(String[] args) {
        System.out.println("CHUONG TRINH TINH LUY THUA");
        Scanner uwu = new Scanner (System.in);
        int so, luythua = 1;
        System.out.print("Nhap so: " );
        so = uwu.nextInt();
        for (int i = 1; i <= so; i++) {
            luythua *= i;
        }
        System.out.println("Giai thua cua " + so + " la " + luythua);
    }
}
