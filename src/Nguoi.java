import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private int tuoi;

    // nhap thong tin nguoi
    public void nhap(Scanner sc) {
        hoTen = Check.nhapChuoi(sc, "Nhap ho ten: ");
        tuoi = Check.nhapSoNguyen(sc, "Nhap tuoi: ", 1, 120);
    }

    // xuat thong tin nguoi
    public void xuat() {
        System.out.print("Ho ten: " + hoTen);
        System.out.print(" | Tuoi: " + tuoi);
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }
}
