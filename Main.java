package Cau1b;
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
        DanhSachHangThucPham ds = new DanhSachHangThucPham();
        Scanner sc = new Scanner(System.in);
        int menu;
        do{
            System.out.println("Lua chon chuc nang");
            System.out.println("1. Nhap thong tin hang hoa");
            System.out.println("2. In thong tin hang hoa");
            System.out.println("0. Thoat");
            System.out.print("Nhap: "); menu = sc.nextInt();
            
            switch(menu){
                case 1:
                    ds.nhap();
                    break;
                case 2:
                    ds.in();
                    break;
                default:
                    if(menu !=0){
                        System.out.println("Nhap lai");
                    }else{
                        System.out.println("Thoat thanh cong");
                    }
            }
        }while(menu !=0);
    }

    private static class DanhSachHangThucPham {

        public DanhSachHangThucPham() {
        }

        private void nhap() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void in() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}