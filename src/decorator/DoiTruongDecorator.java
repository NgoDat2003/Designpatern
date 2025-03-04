package decorator;

public class DoiTruongDecorator extends NhanVienDecorator {

    public DoiTruongDecorator(NhanVien decoratedNhanVien) {
        super(decoratedNhanVien);
    }

    @Override
    public void chucVu() {
        decoratedNhanVien.chucVu();
        addDoiTruongTask();
    }

    private void addDoiTruongTask() {
        System.out.println("Đội trưởng: Đi tuần, Gán việc cho nhân viên.");
    }
}