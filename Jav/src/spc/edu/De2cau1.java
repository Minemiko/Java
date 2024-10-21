/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author SPC
 */
public class De2cau1 {
    public static void main(String[] args) {
        Scanner uwu = new Scanner(System.in);
        ArrayList<Integer> Fib = new ArrayList();
        int N, a = 0, b = 1, c = 1, tong = 0;
        System.out.print("Nhap so luong so Fibonacci: ");
        N = uwu.nextInt();
        for (int i = 0; i < N; i++) {
            Fib.add(c);
            tong += c;
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(Fib);
        System.out.println("Tong cua day so tren la: " + tong);
    }
}
