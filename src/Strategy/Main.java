package Strategy;

public class Main {
	public static void main(String[] args) {
		
		NhanVienStrategy nv1 = new NhanVienStrategy(new DoiTruong());
		nv1.handleRequest(); 

		NhanVienStrategy nv2 = new NhanVienStrategy(new GiamDoc());
		nv2.handleRequest();

		NhanVienStrategy nv3 = new NhanVienStrategy(new NhanVienVanPhong());
		nv3.handleRequest(); 

		NhanVienStrategy nv4 = new NhanVienStrategy(new NhanVienXuong());
		nv4.handleRequest();

		NhanVienStrategy nv5 = new NhanVienStrategy(new KeToanTruong());
		nv5.handleRequest(); 
	}
}
