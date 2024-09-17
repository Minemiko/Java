/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;
import java.time.Year;
import java.util.Scanner;
/**
 *
 * @author SPC
 */
public class Bai5_TinhTuoi {
    public static void main(String[] args) {
        System.out.println("CHUONG TRINH TINH TUOI");
        Scanner uwu = new Scanner(System.in);
        String name;
        int a, tuoi;
        int y = Year.now().getValue();
        System.out.print("Nhap ten: ");
        name = uwu.nextLine();
        System.out.print("Nhap nam sinh: ");
        a = uwu.nextInt();
        tuoi = y - a;
        System.out.println("Ho va ten: " + name);
        System.out.println("Tuoi: " + tuoi);
    }
}
