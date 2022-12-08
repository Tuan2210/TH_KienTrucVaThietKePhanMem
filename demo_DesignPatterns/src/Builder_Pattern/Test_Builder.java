package Builder_Pattern;

//link yt: https://www.youtube.com/watch?v=9KdqObSYzy8&list=PLRoAKls-7kksSBqximU9CjBgCApQVDgmX&index=6

public class Test_Builder {
	public static void main(String[] args) {
		// Builder Pattern là build 1 đối tượng tùy theo y/cầu build thành phần nào
		// phức tạp code nhưng dễ khởi tạo thuộc tính của đối tượng
		
		HondaCar hondaCar1 = new HondaCarBuilder()
								 .buildId(1)
								 .buildTen("Honda City")
								 .buildGia("500,000,000 vnd")
								 //.buildCauHinh("Tốt")
								 .buildNhaSX("Nhật Bản")
								 .build();
		System.out.println("Honda car 1: " +hondaCar1);
	}
}
