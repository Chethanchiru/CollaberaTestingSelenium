package sendkeysVarargsConcept;

public class RemoteCalculator implements Calculator {

	@Override
	public int add(int...arr) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int a: arr) {
			sum=sum+a;
		}
		return sum;

	}

	@Override
	public double div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public double mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
}

