package Adapter_Pattern;

public class AdapterBusiness implements TargetCustomer {
	private AdapteeCar adapteeCar;

	public AdapterBusiness(AdapteeCar adapteeCar) {
		this.adapteeCar = adapteeCar;
	}
	
	private String handleRequest(String req) {
		return req;
	}


	@Override
	public void sendRequest(String request) {
		System.out.println("Đang đọc request...");
		System.out.println(request);
		String info = this.handleRequest(request);
		System.out.println("Đang gửi thông tin...");
		adapteeCar.receive(info);
	}

}
