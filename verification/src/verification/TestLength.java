package verification;

public class TestLength extends A_V{


	@Override
	public void success(String str) {
		
		nextNode.test(str);
		
	}

	@Override
	public void unsuccess(String str) {
	
		System.out.println("password must contain at least eight characters in length ");
	}
	@Override
	public void test(String str) {
		int len = 8;
		if(str.length()>=len) {
		success(str);	
		}else {
			unsuccess(str);
		}
	}
	

}
