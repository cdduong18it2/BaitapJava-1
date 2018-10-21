package Test;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Enumeration;
import java.util.Vector;
public class NhanVienManagement {
Vector list =new Vector();
	public NhanVienManagement() {
		while(true)	
		{
			System.out.println(" Quan Li Nhan Vien ");
			System.out.println("1. Nhap Thong Tin Nhan Vien");
			System.out.println("2. Xem Thong Tin Nhan Vien");
			int n;
			Scanner key = new Scanner(System.in);
			System.out.println("Moi ban chon chuc nang : ");
			n = key.nextInt();
			switch(n) {
			case 1: NhapTT();
				break;
			case 2: InTT();
			break;
			
			}
	}
}
public void NhapTT() {
	int n;
	Scanner key = new Scanner(System.in);
	System.out.println("Nhap so luong nhan vien");
	n = Integer.parseInt(key.nextLine());
	for(int i=1;i<=n;i++) {
		System.out.println("Nhap ten nhan vien : ");
		String name = key.nextLine();
		System.out.println("Nhap ID nhan vien : ");
		String IDnhanvien = key.nextLine();
		System.out.println("Nhap ngay sinh nhan vien : ");
		SimpleDateFormat ns = new SimpleDateFormat("yyyy-MM-dd");
		String birthday =  key.nextLine();
		System.out.println("Nhap so dien thoai nhan vien : ");
		String SDT = key.nextLine();
		System.out.println("Nhap gioi tinh nhan vien : ");
		String GT = key.nextLine();
		NhanVien NV = new NhanVien(name,IDnhanvien,birthday,SDT,GT);
		list.add(NV);
	}
}
public void InTT() {
	Enumeration eNhanVien = list.elements();
	int i=1;
	while(eNhanVien.hasMoreElements()) {
		NhanVien nhanvien = (NhanVien)eNhanVien.nextElement();
		System.out.println("Ten Nhan Vien : "+nhanvien.getName());
		System.out.println("ID Nhan Vien : "+nhanvien.getIDnhanvien());
		System.out.println("Gioi Tinh Nhan Vien : "+nhanvien.getGT());
		System.out.println("Ngay Sinh Nhan Vien : "+nhanvien.getBirthday());
		System.out.println("So Dien Thoai Nhan Vien : "+nhanvien.getSDT());
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new  NhanVienManagement();
	}

}
