package basis.Question14;

public class CalculateImpl implements Calculate {
	//定数の宣言
	static final int DIVISOR_NUMBER = 2;

	//multiplicationメソッドの宣言（戻り値型　int、引数　int, int）
	public int multiplication(int num1, int num2) {
		//引数の掛け算をする
		int ans1 = num1 * num2;
		//return文
		return ans1;
	}

	//divisionメソッドの宣言（戻り値型　int、引数　int, int）
	public int division(int num1, int num2) {
		//引数の掛け算結果を2でわる
		int ans2 = (num1 * num2) / DIVISOR_NUMBER;
		//return文
		return ans2;
	}

	public CalculateImpl() {
	}
}
