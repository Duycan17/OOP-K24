package QuanLiVatLieu;

import java.util.ArrayList;
import java.util.Scanner;

public class Management {
    private static ArrayList<VatLieu> list = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    private static void input() {
        System.out.println("Nhap so luong vat lieu: ");
        int soLuong = sc.nextInt();
        for (int i = 0; i < soLuong; i++) {
            XiMang xiMang = new XiMang();
            xiMang.input();
            list.add(xiMang);
        }
    }

    private static void display() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).display());
        }
    }

    private static void thanhTienNhoNhat() {
        float min = ((XiMang) list.get(0)).getThanhTien();
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (((XiMang) list.get(i)).getThanhTien() < min) {
                min = ((XiMang) list.get(i)).getThanhTien();
                index = i;
            }
        }
        System.out.println("Vat lieu co thanh tien nho nhat la: " + list.get(index).display());
    }

    public static void main(String[] args) {
        int choice = 0;
        do {
            System.out.println("Nhap lua chon");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    input();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    thanhTienNhoNhat();
                    break;
                case 4:
                    System.exit(0);
            }
        } while (choice != 4);
    }

}
