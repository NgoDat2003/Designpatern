package state;

public class Main {
	public static void main(String[] args) {
        NhanVien nv = new NhanVien(new DoiTruong());
        nv.handleRequest();  

        nv.setChucVuState(new GiamDoc());
        nv.handleRequest();  

        nv.setChucVuState(new NhanVienVanPhong());
        nv.handleRequest(); 

        nv.setChucVuState(new NhanVienXuong());
        nv.handleRequest(); 

        nv.setChucVuState(new KeToanTruong());
        nv.handleRequest();  
    }
}
