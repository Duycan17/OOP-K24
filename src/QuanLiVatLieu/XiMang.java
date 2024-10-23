package QuanLiVatLieu;

import java.util.Scanner;

public class XiMang extends VatLieu{
    private int soLuong;
    private float donGia;

    public XiMang(String id, String ma, int soLuong, float donGia) {
        super(id, ma);
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public XiMang() {
        super();
    }

    public float getThanhTien(){
        return soLuong * donGia;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhap so luong: ");
        soLuong = sc.nextInt();
        System.out.println("Nhap don gia: ");
        donGia = sc.nextFloat();
    }
}
