package noDP;

public class NhanVien {
	private String chucVu;
	
	public NhanVien(String chucVu) {
		super();
		this.chucVu = chucVu;
	}

	public void handleRequest() {
		if (chucVu.equals("Đội trưởng")) {
			System.out.println("Đội trưởng: Đi tuần, Gán việc cho nhân viên");
		} else if (chucVu.equals("Giám đốc")) {
			System.out.println("Giám đốc: Quản lý và ra quyết định chiến lược");
		} else if (chucVu.equals("Nhân viên VP")) {
			System.out.println("Nhân viên VP: Pha và phê duyệt công việc");
		} else if (chucVu.equals("Nhân viên Xưởng")) {
			System.out.println("Nhân viên Xưởng: Làm việc xưởng");
		} else if (chucVu.equals("Kế toán trưởng")) {
			System.out.println("Kế toán trưởng: tính toán");
		} else {
			System.out.println("Chức vụ không xác định");
		}
	}
}
