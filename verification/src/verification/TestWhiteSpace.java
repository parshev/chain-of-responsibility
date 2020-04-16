package verification;

public class TestWhiteSpace extends A_V{

	@Override
	public void test(String str) {
		for(int i=0;i<str.length();i++) {
			char a = str.charAt(i);
			if(a==' '){
				//System.out.println(a+" "+i);
				unsuccess(str);
				return;
			}
		}
		success(str);
		
	}

	@Override
	public void success(String str) {
		// TODO Auto-generated method stub
		System.out.println("good password");
		
		
	}

	@Override
	public void unsuccess(String str) {
		// TODO Auto-generated method stub
		System.out.println("password should not contain any space \nuse :a-z,A-Z,0-9");
	}
	

}
