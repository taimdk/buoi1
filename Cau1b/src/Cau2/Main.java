package Cau2;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] agrs) {
        LopHocPhan lhp = new LopHocPhan();
        DSSinhvien ds=new DSSinhvien();
        Scanner sc = new Scanner(System.in);

        ArrayList<Sinhvien> sv = new ArrayList<Sinhvien>();

        System.out.println("Nhap ma lop:");
        String maLHP = sc.nextLine();

        System.out.println("Nhap ten lop hoc:");
        String tenLHP = sc.nextLine();

        System.out.println("Nhap ten giao vien:");
        String tenGV = sc.nextLine();

        System.out.println("Nhap thong tin buoi hoc:");
        String thongTinLopHoc = sc.nextLine();

        System.out.println("maLH" + maLHP);
        System.out.println("ten lop:" + tenLHP);
        System.out.println("ten giao vien " + tenGV);
        System.out.println("thong tin buoi hoc " + thongTinLopHoc);
        System.out.println("danh sach sinh vien");
        System.out.println("Tong sinh vien: " + ds.getSoLuongSV());

    }
}