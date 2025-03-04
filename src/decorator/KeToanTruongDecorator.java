package decorator;

public class KeToanTruongDecorator extends NhanVienDecorator {

    public KeToanTruongDecorator(NhanVien decoratedNhanVien) {
        super(decoratedNhanVien);
    }

    @Override
    public void chucVu() {
        decoratedNhanVien.chucVu();
        addKeToanTruongTask();
    }

    private void addKeToanTruongTask() {
        System.out.println("Kế toán trưởng: Tính toán và kiểm soát tài chính.");
    }
}
