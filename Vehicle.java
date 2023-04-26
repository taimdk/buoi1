package bai1.minhtai01;

 import java.util.Scanner;

public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private double cylinderCapacity;
    private double vehicleValue;
    private double tax;

    public Vehicle(String ownerName, String vehicleType, double cylinderCapacity, double vehicleValue) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.cylinderCapacity = cylinderCapacity;
        this.vehicleValue = vehicleValue;
        calculateTax();
    }
    
    private void calculateTax() {
        if (cylinderCapacity < 100) {
            tax = vehicleValue * 0.01;
        } else if (cylinderCapacity >= 100 && cylinderCapacity <= 200) {
            tax = vehicleValue * 0.03;
        } else {
            tax = vehicleValue * 0.05;
        }
    }
    
    public String getOwnerName() {
        return ownerName;
    }
    
    public String getVehicleType() {
        return vehicleType;
    }
    
    public double getCylinderCapacity() {
        return cylinderCapacity;
    }
    
    public double getVehicleValue() {
        return vehicleValue;
    }
    
    public double getTax() {
        return tax;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[3];
    
        // Nhap thong tin cac xe
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("Nhap thong tin xe " + (i+1) + ":");
            System.out.print("Ten chu xe: ");
            String ownerName = scanner.nextLine();
            System.out.print("Loai xe: ");
            String vehicleType = scanner.nextLine();
            System.out.print("Dung tich xy lanh: ");
            double cylinderCapacity = scanner.nextDouble();
            System.out.print("Tri gia xe: ");
            double vehicleValue = scanner.nextDouble();
            scanner.nextLine(); 
    
            vehicles[i] = new Vehicle(ownerName, vehicleType, cylinderCapacity, vehicleValue);
        }
    
        // In bang ke khai tien thue truoc ba cua cac xe
        System.out.println("Bang ke khai tien thue truoc ba cua cac xe:");
        System.out.println("-------------------------------------------------");
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|\n", "Ten chu xe", "Loai xe", "Dung tich xy lanh", "Tri gia xe", "Thue phai nop");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|\n", vehicles[i].getOwnerName(), vehicles[i].getVehicleType(), vehicles[i].getCylinderCapacity(), vehicles[i].getVehicleValue(), vehicles[i].getTax());
        }
        System.out.println("-------------------------------------------------");
    }    
}





