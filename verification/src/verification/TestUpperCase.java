package verification;

public class TestUpperCase extends A_V{

	@Override
	public void test(String str) {
		for(int i=0;i<str.length();i++) {
			char a = str.charAt(i);
			if(Character.isUpperCase(a)){
				//if(Character.isDigit(str.charAt(i))) {	
				//System.out.println(a);	
				success(str);
				return;					
			}
		}
		unsuccess(str);
		
	}
	

	@Override
	public void success(String str) {
		//System.out.println("Upper casse char: yes ");
		nextNode.test(str);
		return;
	}

	@Override
	public void unsuccess(String str) {
		System.out.println("password must contain at least one capital letter ");
	}
	

}
