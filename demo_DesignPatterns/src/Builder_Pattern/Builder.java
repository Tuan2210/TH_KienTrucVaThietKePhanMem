package Builder_Pattern;

public interface Builder {
	Builder buildId(int id);
	Builder buildTen(String ten);
	Builder buildGia(String gia);
	Builder buildCauHinh(String cauHinh);
	Builder buildNhaSX(String nhaSX);
	HondaCar build();
}
