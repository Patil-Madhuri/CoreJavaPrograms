package inheritance;

public class Banking {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.rules();
		s.savingacc();
		System.out.println();
		BOI b = new BOI();
		b.rules();
		b.currentacc();
		b.number();
	}
	}
