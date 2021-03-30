package firstDay;

public class SumC {

	public static void main (String [] args) {
		SumC sum= new SumC();
		sum.Sum();
		
		sum.Sub();
		
		sum.div();
		
		sum.Mul();

	}

	void Sum() {
		int fNum, lNum, total;
		fNum = 5;
		lNum = 10;
		total = fNum + lNum;
		System.out.println(total);
	}

	void Sub() {
		int fNum, lNum, sub;
		fNum = 5;
		lNum = 10;
		sub = fNum - lNum;
		System.out.println(sub);
	}

	void div() {
		double fNum, lNum, div;
		fNum = 5;
		lNum = 10;
		div = fNum / lNum;
		System.out.println(div);
	}

	void Mul() {
		int fNum, lNum, mul;
		fNum = 5;
		lNum = 10;
		mul = fNum * lNum;
		System.out.println(mul);
	}

}
