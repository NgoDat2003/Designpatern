package decorator;


public class NhanVienXuongDecorator extends NhanVienDecorator {

    public NhanVienXuongDecorator(NhanVien decoratedNhanVien) {
        super(decoratedNhanVien);
    }

    @Override
    public void chucVu() {
        decoratedNhanVien.chucVu();
        addNhanVienXuongTask();
    }

    private void addNhanVienXuongTask() {
        System.out.println("Nhân viên Xưởng: Làm việc tại xưởng.");
    }
}
