import java.util.Scanner;

public class Nhanvien extends Nguoi {
    private int snct;
    private double hsl;

    // nhap thong tin nhan vien
    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        snct = Check.nhapSoNguyen(
                sc, "Nhap so nam cong tac: ", 0, 100
        );

        hsl = Check.nhapSoThuc(
                sc, "Nhap he so luong: "
        );
    }

    // tinh tien luong cua nhan vien
    public double tinhTienLuong() {
        double lcb = 1.5;
        double phucap = 0.2 * snct;

        return lcb * hsl + phucap;
    }

    // xuat thong tin nhan vien
    @Override
    public void xuat() {
        super.xuat();

        System.out.printf(
                " | SNCT: %d | HSL: %.2f | Luong: %.2f trieu%n",
                snct, hsl, tinhTienLuong()
        );
    }

    public int getSnct() {
        return snct;
    }
}
