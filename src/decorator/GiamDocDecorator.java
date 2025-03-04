package decorator;

public class GiamDocDecorator extends NhanVienDecorator {

    public GiamDocDecorator(NhanVien decoratedNhanVien) {
        super(decoratedNhanVien);
    }

    @Override
    public void chucVu() {
        decoratedNhanVien.chucVu();
        addGiamDocTask();
    }

    private void addGiamDocTask() {
        System.out.println("Giám đốc: Quản lý và ra quyết định chiến lược.");
    }
}
