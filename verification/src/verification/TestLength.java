package verification;

public class TestLength extends A_V{

	
	/*public void testLen(String str) {
		int len = 8;
		if(str.length()>=len) {
		success(str);	
		}else {
			unsuccess(str);
		}
	}*/
	@Override
	public void success(String str) {
		// TODO Auto-generated method stub
		//System.out.println("length " + str.length());
		nextNode.test(str);
		
	}

	@Override
	public void unsuccess(String str) {
		// TODO Auto-generated method stub
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
