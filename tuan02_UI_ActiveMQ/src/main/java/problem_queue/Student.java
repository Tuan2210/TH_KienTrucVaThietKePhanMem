package problem_queue;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder={"mssv","hoTen","ngaySinh"})
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String mssv, hoTen, ngaySinh;

	public String getMssv() {
		return mssv;
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public Student(String mssv, String hoTen, String ngaySinh) {
		super();
		this.mssv = mssv;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [mssv=" + mssv + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + "]";
	}
	
}
