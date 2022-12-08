package Builder_Pattern;

public class HondaCarBuilder implements Builder {
	private int id;
	private String ten;
	private String gia;
	private String cauHinh;
	private String nhaSX;

	@Override
	public Builder buildId(int id) {
		this.id = id;
		return this;
	}

	@Override
	public Builder buildTen(String ten) {
		this.ten = ten;
		return this;
	}

	@Override
	public Builder buildGia(String gia) {
		this.gia = gia;
		return this;
	}

	@Override
	public Builder buildCauHinh(String cauHinh) {
		this.cauHinh = cauHinh;
		return this;
	}

	@Override
	public Builder buildNhaSX(String nhaSX) {
		this.nhaSX = nhaSX;
		return this;
	}

	@Override
	public HondaCar build() {
		return new HondaCar(id, ten, gia, cauHinh, nhaSX);
	}

}
