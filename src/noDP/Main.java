package noDP;

public class Main {
	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien("Đội trưởng");
		nv1.handleRequest();
		NhanVien nv2 = new NhanVien("Giám đốc");
		nv2.handleRequest();
		NhanVien nv3 = new NhanVien("Nhân viên VP");
		nv3.handleRequest();
		NhanVien nv4 = new NhanVien("Nhân viên Xưởng");
		nv4.handleRequest();
		NhanVien nv5 = new NhanVien("Kế toán trưởng");
		nv5.handleRequest();
	        
	}
}