package Cau2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DSSinhvien {
     private ArrayList<Sinhvien> svn = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void in_sv(){
        for (Sinhvien sinhVien : svn) {
            System.out.println(sinhVien.toString());
        }
    }
    
    public List<Sinhvien> nhapthongtinsv(){
        List<Sinhvien> dsSV = new ArrayList<>();
        System.out.println("Nhap thong tin cua sinh vien");
        
        while(true){
            System.out.println("Nhap ma sinh vien: ");
            String maSV = sc.nextLine();
            
            System.out.println("Nhap ho ten sinh vien: ");
            String hoTen = sc.nextLine();
            
            if(maSV.isEmpty()||hoTen.isEmpty()){
                System.out.println("Nhap thanh cong");
                break;
            }
            Sinhvien sv = new Sinhvien(maSV, hoTen);
        }
        return dsSV;
    }
        public int getSoLuongSV(){
        return svn.size();
    }
}