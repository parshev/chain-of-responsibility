package verification;

public abstract class A_V {
    protected String str;
	protected A_V nextNode;
	
	public void setNextNode(A_V nextNode) {
		this.nextNode = nextNode;
	}
	public abstract void test(String str);
	public abstract void success(String str);
	public abstract void unsuccess(String str);
}
