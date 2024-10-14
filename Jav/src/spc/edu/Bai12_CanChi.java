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
public class Bai12_CanChi {
    public static void main(String[] args) {
        String[] Can = {"Canh", "Tan", "Nham", "Quy", "Giap", "At", "Binh", "Đinh", "Mau", "Ky"};
        String[] Chi = {"Than", "Dau", "Tuat", "Hoi", "Ty", "Suu", "Dan", "Mao", "Thin", "Ti", "Ngo", "Mui"};
        System.out.println("CHUONG TRINH TINH CAN CHI");
        Scanner uwu = new Scanner(System.in);
        System.out.print("Nhap nam: ");
        int nam;
        nam = uwu.nextInt();
        System.out.print(Can[nam % 10] + " ");
        System.out.println(Chi[nam % 12]);
    }
}
