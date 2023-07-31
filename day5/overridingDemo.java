package telstra.day5.staticDemo;

class RBI
{
	void holidays() {
		System.out.println("2nd and 4th Weekend");
	}
	void dailylimit() {
		System.out.println("1 lakh");
	}

}
class SBI extends RBI
{
	void dailylimit() {
		System.out.println("2 lakh");
	}
	void sbirule() {
		System.out.println("All the day working");
	}

}




public class overridingDemo {

	public static void main(String[] args) {
		SBI sbi=new SBI();
		sbi.dailylimit();
		sbi.holidays();
		sbi.sbirule();
		
		
		RBI sbi2=new RBI();
		sbi2.dailylimit();
		sbi2.holidays();
	}

}

