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
public class Bai14_TinhTienDien {
    public static void main(String[] args) {
        System.out.println("CHUONG TRINH TINH TIEN DIEN");
        Scanner uwu = new Scanner(System.in);
        int sodiencu, sodienmoi, sodien, so, thue;
        double tiendien = 0, tongtien = 0;
        System.out.print("Nhap so dien cu: ");
        sodiencu = uwu.nextInt();
        System.out.print("Nhap so dien moi: ");
        sodienmoi = uwu.nextInt();
        System.out.print("Nhap so thue: ");
        thue = uwu.nextInt();
        sodien = sodienmoi - sodiencu;
        System.out.println("So dien: " + sodien);
        if(sodien > 0){
            so = 1;
            do{
                so++;
                sodien--;
                tiendien += 1893;
                tongtien += 1893;
            } while (sodien > 0 & so <= 50);
            System.out.println("Bac 1 don gia 1893 voi san luong " + (so - 1) + " co so tien la: " + tiendien + "d");
        }
        if(sodien > 0){
            so = 1;
            tiendien = 0;
            do{
                so++;
                sodien--;
                tiendien += 1956;
                tongtien += 1956;
            } while (sodien > 0 & so <= 50);
            System.out.println("Bac 2 don gia 1956 voi san luong " + (so - 1) + " co so tien la: " + tiendien + "d");
        }
        if(sodien > 0){
            so = 1;
            tiendien = 0;
            do{
                so++;
                sodien--;
                tiendien += 2271;
                tongtien += 2271;
            } while (sodien > 0 & so <= 100);
            System.out.println("Bac 3 don gia 2271 voi san luong " + (so - 1) + " co so tien la: " + tiendien + "d");
        }
        if(sodien > 0){
            so = 1;
            tiendien = 0;
            do{
                so++;
                sodien--;
                tiendien += 2860;
                tongtien += 2860;
            } while (sodien > 0 & so <= 100);
            System.out.println("Bac 4 don gia 2860 voi san luong " + (so - 1) + " co so tien la: " + tiendien + "d");
        }
        if(sodien > 0){
            so = 1;
            tiendien = 0;
            do{
                so++;
                sodien--;
                tiendien += 3197;
                tongtien += 3197;
            } while (sodien > 0 & so <= 100);
            System.out.println("Bac 5 don gia 3197 voi san luong " + (so - 1) + " co so tien la: " + tiendien + "d");
        }
        if(sodien > 0){
            so = 1;
            tiendien = 0;
            do{
                so++;
                sodien--;
                tiendien += 3302;
                tongtien += 3302;
            } while (sodien > 0);
            System.out.println("Bac 6 don gia 3302 voi san luong " + (so - 1) + " co so tien la: " + tiendien + "d");
        }
        System.out.println("Tien dien chua thue la: " + tongtien + "d");
        System.out.println("Thue: " + (tongtien / 100 * thue) + "d");
        System.out.println("Tong tien: " + (tongtien + tongtien / 100 * thue) + "d");
    }
}
