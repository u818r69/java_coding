package basis.Question13;

public class CalculateChild extends CalculateSuper {
	/**
	 * コンストラクタ
	 * @param num1 整数1
	 * @param num2 整数2
	 */
	protected CalculateChild(int num1, int num2) {
		super(num1, num2);
	}

	protected void flow() {
		subtraction();
		sum();
	}

}
