package Test;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class NhanVien {
String name;
String IDnhanvien;
String birthday;
String SDT;
String GT;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getIDnhanvien() {
	return IDnhanvien;
}
public void setIDnhanvien(String iDnhanvien) {
	IDnhanvien = iDnhanvien;
}
public String getBirthday() {
	return birthday;
}
public void setBirthday(String birthday) {
	this.birthday = birthday;
}
public String getSDT() {
	return SDT;
}
public void setSDT(String sDT) {
	SDT = sDT;
}
public String getGT() {
	return GT;
}
public void setGT(String gT) {
	GT = gT;
}
public NhanVien() {
}
public NhanVien(String name,String IDnhanvien,String birthday,String SDT,String GT) {
	this.name=name;
	this.IDnhanvien=IDnhanvien;
	this.birthday=birthday;
	this.SDT=SDT;
	this.GT=GT;
}
}

