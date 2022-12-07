package Singleton_Pattern;

public class Double_Check_Locking {

	// volatile giúp ghi vào bộ nhớ chính của máy, khi truy xuất đến biến instance ở những thread luồng khác nhau sẽ chỉ có 1 kết quả duy nhất
	// trường hợp thread 1 ta thay đổi giá trị biến instance, thread 2 truy suất đến sẽ ko phải là giá trị đã thay đổi ở thread 1
	private static volatile Double_Check_Locking instance;

	public Double_Check_Locking() {

	}

	// trong 1 thời điểm chi có 1 luồng duy nhất đc truy xuất khi ta getInstance
	private static Double_Check_Locking getInstance() {
		if(instance == null)
			synchronized (Double_Check_Locking.class) {
				if(instance == null)
					instance = new Double_Check_Locking();
			}
		return instance;
	}
		
}
