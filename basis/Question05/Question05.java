package basis.Question05;

import java.util.Scanner;

public class Question05 {
	// mainメソッド
	public static void main(String[] args) {
		// 「整数100を入力された値で割り算します」のメッセージ出力
		System.out.println("整数100を入力された値で割り算します");
		// 「割り算する整数を入力してください」のメッセージ出力
		System.out.println("割り算する整数を入力してください");
		// scanner変数の宣言
		Scanner scanner = new Scanner(System.in);
		// 例外処理try-catch文
		try {
			// strInputにキーボード入力
			String strInput = scanner.nextLine();
			// String型からint型に型変換
			int intInput = Integer.parseInt(strInput);
			// if文：入力値が0の場合
			if (intInput == 0) {
				// 「0では割り算できません」のメッセージ出力
				System.out.println("0では割り算できません\n終了");
			}
			// ans=100/strinput
			else {
				int ans = 100 / intInput;
				// 「割り算結果はansです」のメッセージ出力
				System.out.println("割り算結果は" + ans + "です\n終了");
			}
			// try文終了
		}
		// catch文：整数以外の値が入力された場合
		catch (NumberFormatException e) {
			// 「整数以外の値が入力されました」のメッセージ出力
			System.out.println("整数以外の値が入力されました\n終了");
			// catch文：”0”が入力された場合
		}
	}
}