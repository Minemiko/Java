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
public class Bai4_PhepTinhCoBan {
    public static void main(String[] args) {
        System.out.println("CHUONG TRINH TINH 2 SO THAP PHAN");
        int a, b;
        Scanner owo = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        a = owo.nextInt();
        System.out.print("Nhap so b: ");
        b = owo.nextInt();
        System.out.println(a + " + " + b + " = " + tinhTong(a,b));
        System.out.println(a + " - " + b + " = " + tinhHieu(a,b)); 
        System.out.println(a + " * " + b + " = " + tinhTich(a,b)); 
        System.out.println(a + " / " + b + " = " + tinhThuong(a,b)); 
    }
    public static int tinhTong(int a, int b){
        return a + b;
    }
    public static int tinhHieu(int a, int b){
        return a - b;
    }
    public static int tinhTich(int a, int b){
        return a * b;
    }
    public static double tinhThuong(int a, int b){
        if (b == 0){
            return -1;
        } else {
            return (double)a / b;
        }
    }
}
