package basis.Question11;

import java.util.Scanner;

public class Question11 {
	//割る数の定数宣言
	static final int DIVISOR_NUMBER = 2;

	public static void main(String[] args) {
		//メッセージ出力
		System.out.println("整数を入力してください");
		//例外処理
		try (Scanner scanner = new Scanner(System.in);) {
			//メッセージ出力
			System.out.print("1個目：");
			//キーボード入力
			String strInput1 = scanner.nextLine();
			//String型からint型に型変換
			int intInput1 = Integer.parseInt(strInput1);
			//メッセージ出力
			System.out.print("2個目：");
			//キーボード入力
			String strInput2 = scanner.nextLine();
			//String型からint型に型変換
			int intInput2 = Integer.parseInt(strInput2);
			//メッセージ出力
			System.out.println(
					intInput1 + " と " + intInput2 + " の掛け算結果の値は " + multiplication(intInput1, intInput2) + " です");
			//メッセージ出力
			System.out.println(
					intInput1 + " と " + intInput2 + " の掛け算結果を2で割った値は " + division(intInput1, intInput2) + " です");
		}catch (NumberFormatException e) {//例外処理
			//メッセージ出力
			System.out.println("整数以外の値が入力されました");
		}
	}

	public static int multiplication(int num1, int num2) {
		//引数を倍数
		int doubleAns = num1 * num2;
		return doubleAns;
	}

	public static int division(int num1, int num2) {
		//引数を累乗
		int divisionAns = (num1 * num2) / DIVISOR_NUMBER;
		return divisionAns;
	}
}