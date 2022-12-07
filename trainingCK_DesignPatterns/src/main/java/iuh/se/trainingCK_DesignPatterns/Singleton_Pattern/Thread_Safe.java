package iuh.se.trainingCK_DesignPatterns.Singleton_Pattern;

public class Thread_Safe {
	
	// volatile giúp ghi vào bộ nhớ chính của máy, khi truy xuất đến biến instance ở những thread luồng khác nhau sẽ chỉ có 1 kết quả duy nhất
	// trường hợp thread 1 ta thay đổi giá trị biến instance, thread 2 truy suất đến sẽ ko phải là giá trị đã thay đổi ở thread 1
	private static volatile Thread_Safe instance;

	public Thread_Safe() {

	}
	
	// trong 1 thời điểm chi có 1 luồng duy nhất đc truy xuất khi ta getInstance, nhớ private
	private static synchronized Thread_Safe getInstance() {
		if(instance == null)
			instance = new Thread_Safe();
		return instance;
	}
	
}
