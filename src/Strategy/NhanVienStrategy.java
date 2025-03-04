package Strategy;

interface chucVuStrategy {
    void chucVu();
}


public class NhanVienStrategy {
    private chucVuStrategy chucVu;

    public NhanVienStrategy(chucVuStrategy chucVu) {
        this.chucVu = chucVu;
    }

    public void handleRequest() {
        chucVu.chucVu();
    }
}