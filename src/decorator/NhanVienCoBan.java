package decorator;

public class NhanVienCoBan implements NhanVien {
    private String chucVu;

    public NhanVienCoBan(String chucVu) {
        this.chucVu = chucVu;
    }

    @Override
    public void chucVu() {
        System.out.println("Nhân viên chức vụ: " + chucVu);
    }
}
