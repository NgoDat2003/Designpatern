package state;
public class NhanVien {
    private ChucVuState chucVuState;

    public NhanVien(ChucVuState chucVuState) {
        this.chucVuState = chucVuState;
    }

    public void setChucVuState(ChucVuState chucVuState) {
        this.chucVuState = chucVuState;
    }

    public void handleRequest() {
        chucVuState.chucVu();
    }
}