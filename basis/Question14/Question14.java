package basis.Question14;

import java.util.Scanner;

public class Question14 {
	public static void main(String[] args) {
		System.out.println("整数を入力してください");
		try (Scanner scanner = new Scanner(System.in);) {
			System.out.print("1個目：");
			//キーボード入力
			String strInput1 = scanner.nextLine();
			//String型からint型への変換
			int intInput1 = Integer.parseInt(strInput1);
			//メッセージ出力
			System.out.print("2個目：");
			//キーボード入力
			String strInput2 = scanner.nextLine();
			//String型からint型への変換
			int intInput2 = Integer.parseInt(strInput2);
			//インスタンス生成
			CalculateImpl calcimpl = new CalculateImpl();
			//メッセージ出力
			System.out.println(
					intInput1 + " と " + intInput2 + " の掛け算結果の値は " + calcimpl.multiplication(intInput1, intInput2)
							+ " です");
			//メソッド呼び出し
			System.out.println(intInput1 + " と " + intInput2 + " の掛け算結果を" + CalculateImpl.DIVISOR_NUMBER + "で割った値は "
					+ calcimpl.division(intInput1, intInput2) + " です");
		} catch (NumberFormatException e) {
			System.out.println("整数以外の値が入力されました");
		}

	}

}
