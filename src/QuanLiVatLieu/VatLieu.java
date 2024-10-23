package QuanLiVatLieu;

import java.util.Scanner;

public class VatLieu {
    private String id;
    private String ma;

    public VatLieu(String id, String ma) {
        this.id = id;
        this.ma = ma;
    }

    public VatLieu() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id: ");
        id = sc.nextLine();
        System.out.println("Nhap ma: ");
        ma = sc.nextLine();
        this.id = id;
        this.ma = ma;
    }
    public String display() {
        return "VatLieu{" +
                "id='" + id + '\'' +
                ", ma='" + ma + '\'' +
                '}';
    }
}
