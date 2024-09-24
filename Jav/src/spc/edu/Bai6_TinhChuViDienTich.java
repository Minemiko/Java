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
public class Bai6_TinhChuViDienTich {
    public static void main(String[] args) {
        System.out.println("CHUONG TRINH TINH CHU VI VA DIEN TICH");
        double cv, dt, cvht, dtht, cd, cr, bk;
        Scanner uwu = new Scanner(System.in);
        System.out.print("NHAP CHIEU DAI HINH CHU NHAT: ");
        cd = uwu.nextDouble();
        System.out.print("NHAP CHIEU RONG HINH CHU NHAT: ");
        cr = uwu.nextDouble();
        System.out.print("NHAP BAN KINH HINH TRON: ");
        bk = uwu.nextDouble();
        cv = (cd + cr) * 2;
        dt = cd * cr;
        cvht = 2 * Math.PI * bk;
        dtht = Math.PI * (bk * bk);
        System.out.println("CHU VI HINH CHU NHAT: " + cv);
        System.out.println("DIEN TICH HINH CHU NHAT: " + dt);
        System.out.println("CHU VI HINH TRON: " + cvht);
        System.out.println("DIEN TICH HINH TRON: " + dtht);
    }
}
