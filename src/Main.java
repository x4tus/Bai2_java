import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Nhanvien> ds = new ArrayList<>();

        System.out.print("Nhap so luong nhan vien: ");
        int n = Check.nhapSoNguyen(sc, "", 1, Integer.MAX_VALUE);

        // nhap danh sach nhan vien
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap nhan vien thu " + (i + 1));

            Nhanvien nv = new Nhanvien();
            nv.nhap(sc);

            ds.add(nv);
        }

        // tim nhan vien co so nam cong tac nhieu nhat
        if (!ds.isEmpty()) {
            int max = ds.get(0).getSnct();

            for (Nhanvien nv : ds) {
                if (nv.getSnct() > max) {
                    max = nv.getSnct();
                }
            }

            System.out.println("\nNhan vien co so nam cong tac nhieu nhat:");
            for (Nhanvien nv : ds) {
                if (nv.getSnct() == max) {
                    nv.xuat();
                }
            }
        }

        // sap xep danh sach theo tien luong giam dan
        ds.sort(Comparator.comparingDouble(
                Nhanvien::tinhTienLuong
        ).reversed());

        // in danh sach sau khi sap xep
        System.out.println("\nDanh sach nhan vien theo luong giam dan:");
        for (Nhanvien nv : ds) {
            nv.xuat();
        }

        sc.close();
    }
}
