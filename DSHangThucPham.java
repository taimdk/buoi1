package Cau1b;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;


public class DSHangThucPham {
 private ArrayList<HangThucPham> htpn = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void nhap(){
        String maHang;
        boolean trungMa;
        do{
            System.out.println("Nhap vao ma hang: ");
            maHang = sc.nextLine();
            trungMa=false;
            
            for (HangThucPham s : htpn) {
                if(s.getMaHang()==maHang){
                    trungMa=true;
                    System.out.println("Nhap lai ma");
                    break;
                }
            }
        }while(trungMa);
        System.out.println("Nhap ten hang hoa: ");
        String tenHang = sc.nextLine();

        System.out.println("Nhap vao don gia: ");
        double donGia = sc.nextDouble();

        boolean validNgaySanXuat = false;
        LocalDate ngaySanXuat = null;
        while (!validNgaySanXuat) {
            System.out.print("Nhap ngay san xuat (dd/mm/yyyy): ");
            String ngaySanXuatStr = sc.next();
            try {
                ngaySanXuat = LocalDate.parse(ngaySanXuatStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                validNgaySanXuat = true;
            } catch (DateTimeParseException e) {
                System.out.println("Ngay san xuat khong dung dinh dang, vui long nhap lai!");
            }
        }

        boolean validNgayHetHan = false;
        LocalDate ngayHetHan = null;
        while (!validNgayHetHan) {
            System.out.print("Nhap ngay het han (dd/mm/yyyy): ");
            String ngayHetHanStr = sc.next();
            try {
                ngayHetHan = LocalDate.parse(ngayHetHanStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                if (ngayHetHan.isBefore(ngaySanXuat)) {
                    System.out.println("Ngay het han phai sau ngay san xuat, vui long nhap lai!");
                } else {
                    validNgayHetHan = true;
                }
            } catch (DateTimeParseException e) {
                System.out.println("Ngay het han khong dung dinh dang, vui long nhap lai!");
            }
        }
        
        HangThucPham tp = new HangThucPham(maHang, tenHang, donGia, ngaySanXuat, ngayHetHan);
        htpn.add(tp);
        System.out.println("Them thanh cong");
    }
    public void in(){
        if(htpn.isEmpty()){
            System.out.println("Khong co hang");
        }else{
            System.out.println( String.format("| %-15s | %-25s | %-15s | %-20s | %-20s | %-10s |%n", "Ma hang", "Ten hang", "Don gia","Ngay san xuat", "Ngay het han", "Ghi Chu") + 
            "================================================================================================================================"+ "\n");
            for (HangThucPham t : htpn) {
                System.out.println(t);
            }
        }
    }
}