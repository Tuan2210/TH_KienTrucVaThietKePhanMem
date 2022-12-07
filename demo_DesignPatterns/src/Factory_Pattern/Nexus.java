package Factory_Pattern;

public class Nexus implements Car {
	private int id;
	private String ten;
	private String gia;
	private String cauHinh;
	private String nhaSX;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getGia() {
		return gia;
	}
	public void setGia(String gia) {
		this.gia = gia;
	}
	public String getCauHinh() {
		return cauHinh;
	}
	public void setCauHinh(String cauHinh) {
		this.cauHinh = cauHinh;
	}
	public String getNhaSX() {
		return nhaSX;
	}
	public void setNhaSX(String nhaSX) {
		this.nhaSX = nhaSX;
	}
	
	public Nexus(int id, String ten, String gia, String cauHinh, String nhaSX) {
		super();
		this.id = id;
		this.ten = ten;
		this.gia = gia;
		this.cauHinh = cauHinh;
		this.nhaSX = nhaSX;
	}
	
	public Nexus() {
		super();
	}
	
	@Override
	public String toString() {
		return "Nexus [id=" + id + ", ten=" + ten + ", gia=" + gia + ", cauHinh=" + cauHinh + ", nhaSX=" + nhaSX + "]";
	}
	
	@Override
	public String getCarName() {
		return "Nexus car";
	}
	
}
