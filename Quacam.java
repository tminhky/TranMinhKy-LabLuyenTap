package Lab5;

public class Quacam extends Hoaqua {
    private double giaban;
    private String ngaynhap;
    private double soluong;
    private String nguongoc;

    public Quacam(String ten,String kichthuoc, String mau, double giaban, String ngaynhap, double soluong, String nguongoc) {
        super(ten, kichthuoc, mau);
        this.giaban = giaban;
        this.ngaynhap = ngaynhap;
        this.soluong = soluong;
        this.nguongoc = nguongoc;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public double getSoluong() {
        return soluong;
    }

    public void setSoluong(double soluong) {
        this.soluong = soluong;
    }

    public String getNguongoc() {
        return nguongoc;
    }

    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }

}
