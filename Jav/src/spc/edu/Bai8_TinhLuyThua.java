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
public class Bai8_TinhLuyThua {
    public static void main(String[] args) {
        System.out.println("CHUONG TRINH TINH LUY THUA");
        Scanner uwu = new Scanner (System.in);
        int so, mu, kq = 1;
        System.out.print("Nhap so: " );
        so = uwu.nextInt();
        System.out.print("Nhap so mu: ");
        mu = uwu.nextInt();
        for (int i = 1; i <= mu; i++) {
            kq *= so;
        }
        System.out.println("Luy thua cua " + so + " mu " + mu + " la " + kq);
    }
}
