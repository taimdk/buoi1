package Cau1b;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class HangThucPham {
   private String maHang, tenHang="xxx";
    private double donGia;
    private LocalDate ngaySanXuat=LocalDate.now(),ngayHetHan=ngaySanXuat;

    public HangThucPham() {
    }

    public HangThucPham(String maHang) {
        this.maHang = maHang;
    }

    public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
        if(!maHang.trim().equals("")){
            this.maHang = maHang;
        }else{
            throw new ExceptionInInitializerError("Khong duoc de trong");
        }
        
        if(tenHang.isEmpty() || tenHang == ""){
            this.tenHang="xxx";
        }else{
            this.tenHang=tenHang;
        }
        
        if(donGia>=0){
            this.donGia=donGia;
        }else{
            this.donGia=0;
        }
        
        if(ngaySanXuat.isBefore(LocalDate.now())){
            this.ngaySanXuat=ngaySanXuat;
        }else{
            this.ngaySanXuat=LocalDate.now();
        }
        
        if(ngayHetHan.isAfter(ngaySanXuat)){
            this.ngayHetHan=ngayHetHan;
        }else{
            this.ngayHetHan=ngaySanXuat;
        }
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if(tenHang.isEmpty() || tenHang == ""){
            this.tenHang="xxx";
        }else{
            this.tenHang=tenHang;
        }
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if(donGia>=0){
            this.donGia=donGia;
        }else{
            this.donGia=0;
        }
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        if(ngaySanXuat.isBefore(LocalDate.now())){
            this.ngaySanXuat=ngaySanXuat;
        }else{
            this.ngaySanXuat=LocalDate.now();
        }
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        if(ngayHetHan.isAfter(ngaySanXuat)){
            this.ngayHetHan=ngayHetHan;
        }else{
            this.ngayHetHan=ngaySanXuat;
        }
    }
    
    @Override
    public String toString(){
        String ghiChu = "Chua het han";
        if(ngayHetHan.isBefore(LocalDate.now())){
            ghiChu="Da het han";
        }
        NumberFormat nf = NumberFormat.getInstance();
        nf.isGroupingUsed();
        String dongia = nf.format(donGia);
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return 
            String.format("| %-15s | %-25s | %-15s | %-20s | %-20s | %-10s |%n",maHang, tenHang, dongia, ngaySanXuat.format(dtf), ngayHetHan.format(dtf), ghiChu);
    }
}