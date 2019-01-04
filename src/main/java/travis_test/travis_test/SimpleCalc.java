package travis_test.travis_test;

public class SimpleCalc {
	private int res = 0;
	public void add( int x, int y) {
		res = x+y;
	}
	
	public int getResult() {
		return res;
	}

}
