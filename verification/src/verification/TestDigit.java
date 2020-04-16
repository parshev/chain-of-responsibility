package verification;

public class TestDigit extends A_V{

	@Override
	public void test(String str) {
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {	
				success(str);
				return;
			}
		}
		unsuccess(str);
		return;
	}

	@Override
	public void success(String str) {
		nextNode.test(str);
		return;
	}

	@Override
	public void unsuccess(String str) {
		System.out.println("password must contain at least one digit");
		
	}

}
