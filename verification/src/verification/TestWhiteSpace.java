package verification;

public class TestWhiteSpace extends A_V{

	@Override
	public void test(String str) {
		for(int i=0;i<str.length();i++) {
			char a = str.charAt(i);
			if(a==' '){
				unsuccess(str);
				return;
			}
		}
		success(str);
		
	}

	@Override
	public void success(String str) {
		System.out.println("good password");
		
		
	}

	@Override
	public void unsuccess(String str) {
		System.out.println("password should not contain any space \nuse :a-z,A-Z,0-9");
	}
	

}
