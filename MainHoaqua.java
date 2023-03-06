package Lab5;

public class Main {
    public static void main(String[] args) {
        Quacam quacam = new Quacam("Cam tươi","Vừa","Màu cam",2.5,"1/1",5.0,"Tây Ninh");

        System.out.println("Ten: " + quacam.getTen());
        System.out.println("Mau: " + quacam.getMau());
        System.out.println("Gia ban: " + quacam.getGiaban());
        System.out.println("Ngay nhap: " + ((Quacam) quacam).getNgaynhap());
        System.out.println("So luong: " + quacam.getSoluong());
        System.out.println("Nguon goc: " + quacam.getNguongoc());
    }
}
