package Cau2Lab5;

public class Car extends Vehicle {
    private int giaban;
    private String ngaynhap;
    private String nguongoc;

    public Car(String color, String model, int giaban, String ngaynhap, String nguongoc)
    {
        super(color, model);
        this.giaban = giaban;
        this. ngaynhap = ngaynhap;
        this.nguongoc = nguongoc;
    }
    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }
    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }
    public String getNguongoc() {
        return nguongoc;
    }

    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }

}
