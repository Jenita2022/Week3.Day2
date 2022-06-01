package week3.day2;

public class Automation extends MultipleLanguage{
	public void Java() {
		System.out.println("Implementing Java in concrete class");
	}

	public void Selenium() {
		System.out.println("Implementing Selenium in concrete class");
	}

	public void ruby() {
		System.out.println("Implementing Ruby inn concrete class");
	}
	
	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.Java();
		auto.Selenium();
		auto.ruby();
		auto.python();
	};

}


