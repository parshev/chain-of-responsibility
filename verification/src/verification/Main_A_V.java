package verification;

public class Main_A_V {

	public static A_V getChein() {
		A_V tl = new TestLength();
		A_V td = new TestDigit();
		A_V tu = new TestUpperCase();
		A_V tws = new TestWhiteSpace();
		
		tl.setNextNode(td);
		td.setNextNode(tu);
		tu.setNextNode(tws);
		
		
		return tl;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pass = "faq1swdAer";
		A_V chein = getChein();
		chein.test(pass);
		
	}

}
