package Composite_Pattern;

//link yt: https://www.youtube.com/watch?v=YFE-WFe8-uc&list=PLRoAKls-7kksSBqximU9CjBgCApQVDgmX&index=8

public class Test_Composite {

	public static void main(String[] args) {
		Boss boss = new Boss(60, "Tom", 8000);
		Business b = new Business(27, "Jame", 2100);
		
		ProjectManager pm = new ProjectManager(45, "Sam", 5000);
		Developer dev1 = new Developer(30, "John", 2000);
        Developer dev2 = new Developer(25, "Ana", 1800);
        
        pm.add(dev1); 
        pm.add(dev2);
        boss.add(pm); 
        boss.add(b);
        
        boss.print();
	}

}
