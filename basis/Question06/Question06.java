package basis.Question06;

import java.util.Scanner;

public class Question06 {
	// mainメソッド
	public static void main(String[] args) {
		// 「本日の曜日番号を入力してください」のメッセージ出力
		System.out.println("本日の曜日番号を入力してください");
		// scanner変数の宣言
		Scanner scanner = new Scanner(System.in);
		// 例外処理try-catch文
		try {
			// strInputにキーボード入力
			String strInput = scanner.nextLine();
			// switch文：strInput
			switch (strInput) {
			// strinput = 0の場合
			case "0":
				// メッセージ出力
				System.out.println("本日は 日曜日 です");
				// break文
				break;
			// strinput = 1の場合
			case "1":
				// メッセージ出力
				System.out.println("本日は 月曜日 です");
				// break文
				break;
			// strinput = 2の場合
			case "2":
				// メッセージ出力
				System.out.println("本日は 火曜日 です");
				// break文
				break;
			// strinput = 3の場合
			case "3":
				// メッセージ出力
				System.out.println("本日は 水曜日 です");
				// break文
				break;
			// strinput = 4の場合
			case "4":
				// メッセージ出力
				System.out.println("本日は 木曜日 です");
				// break文
				break;
			// strinput = 5の場合
			case "5":
				// メッセージ出力
				System.out.println("本日は 金曜日 です");
				// break文
				break;
			// strinput = 6の場合
			case "6":
				// メッセージ出力
				System.out.println("本日は 土曜日 です");
				// break文
				break;
			// default文
			default:
				// メッセージ出力
				System.out.println("0～6の範囲で入力してください");
			}
		}
		// catch文
		catch (NumberFormatException e) {
			// 「整数以外の値が入力されました」のメッセージ出力
			System.out.println("整数以外の値が入力されました");
		}
		// finally文：scnnerのクローズ
		finally {
			scanner.close();
		}
	}
}
