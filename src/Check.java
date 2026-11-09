
import java.util.Scanner;

public class Check {

    // nhap chuoi khong duoc de trong
    public static String nhapChuoi(Scanner sc, String thongBao) {
        while (true) {
            System.out.print(thongBao);
            String value = sc.nextLine().trim();

            if (!value.isEmpty()) {
                return value;
            }

            System.out.println("Khong duoc de trong, vui long nhap lai!");
        }
    }

    // nhap so nguyen trong khoang cho phep
    public static int nhapSoNguyen(Scanner sc, String thongBao, int min, int max) {
        while (true) {
            System.out.print(thongBao);

            try {
                int value = Integer.parseInt(sc.nextLine().trim());

                if (value >= min && value <= max) {
                    return value;
                }

                System.out.println("Gia tri phai tu " + min + " den " + max);
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so nguyen!");
            }
        }
    }

    // nhap so thuc lon hon 0
    public static double nhapSoThuc(Scanner sc, String thongBao) {
        while (true) {
            System.out.print(thongBao);

            try {
                double value = Double.parseDouble(sc.nextLine().trim());

                if (Double.isFinite(value) && value > 0) {
                    return value;
                }

                System.out.println("Gia tri phai lon hon 0!");
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so thuc!");
            }
        }
    }
}
