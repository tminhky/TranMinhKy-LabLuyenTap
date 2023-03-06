package Cau2Lab5;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Đen", "Đia hinh",100000000,"7/8","USA");
        System.out.println("Color: " + bicycle.getColor());
        System.out.println("Model: " + bicycle.getModel());
        System.out.println("Gia ban: " + bicycle.getGiaban());
        System.out.println("Ngay nhap: " + bicycle.getNgaynhap());
        System.out.println("Nguon goc: " + bicycle.getNguongoc());
    }
}
