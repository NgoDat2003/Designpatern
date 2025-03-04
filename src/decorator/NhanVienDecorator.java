package decorator;

public abstract class NhanVienDecorator implements NhanVien {
	protected NhanVien decoratedNhanVien;

	public NhanVienDecorator(NhanVien decoratedNhanVien) {
		this.decoratedNhanVien = decoratedNhanVien;
	}

	@Override
	public void chucVu() {
		decoratedNhanVien.chucVu();
	}
}