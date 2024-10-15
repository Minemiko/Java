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
public class Bai13_LaiSuat {
    public static void main(String[] args) {
        System.out.println("CHUONG TRINH TINH LAI SUAT");
        double sotien, tienlai = 0, laisuat, nam;
        Scanner uwu = new Scanner(System.in);
        System.out.print("Nhap so tien:");
        sotien = uwu.nextDouble();
        System.out.print("Nhap so nam:");
        nam = uwu.nextDouble();
        System.out.print("Nhap phan tram lai suat:");
        laisuat = uwu.nextDouble();
        for (int i = 1; i <= nam; i++) {
            tienlai = sotien / 100 * laisuat;
            System.out.println("Nam " + i + " no " + sotien + " voi tien lai la " + tienlai);
            sotien += tienlai;
        }
    }
}
