package basis.Question02;

import java.util.Scanner;

public class Question02 {
	public static void main(String[] args) {
		// メッセージ出力
		System.out.println("整数を入力してください");
		Scanner scanner = new Scanner(System.in);
		// try-catch-finally
		try {
			// キーボード入力
			String inputStr = scanner.nextLine();
			// String型からint型に型変換
			int num = Integer.parseInt(inputStr);
			// if文
			if (num % 2 == 0) {
				// 偶数の場合
				System.out.println("入力された　" + num + " は　偶数　です");
			}
			// 奇数の場合
			else {
				System.out.println("入力された　" + num + " は　奇数　です");
			}
			// 例外のキャッチ
		} catch (NumberFormatException e) {
			// 例外処理
			System.out.println("数値以外の値が入力されました");
			// scannerのクローズ
		} finally {
			scanner.close();
		}
	}
}