package decorator;

public class Main {
    public static void main(String[] args) {
        NhanVien nhanVienVP = new NhanVienCoBan("Nhân viên VP");


        System.out.println("Chức vụ: Đội trưởng");
        NhanVien doiTruong = new DoiTruongDecorator(nhanVienVP);
        doiTruong.chucVu(); 

        System.out.println("Chức vụ: Giám đốc");
        NhanVien giamDoc = new GiamDocDecorator(nhanVienVP);
        giamDoc.chucVu(); 

        System.out.println("Chức vụ: Nhân viên Xưởng");
        NhanVien nhanVienXuong = new NhanVienXuongDecorator(nhanVienVP);
        nhanVienXuong.chucVu(); 

        System.out.println("Chức vụ: Kế toán trưởng");
        NhanVien keToanTruong = new KeToanTruongDecorator(nhanVienVP);
    }
}