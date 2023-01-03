package basis.Question04;

import java.util.Scanner;

public class Question04 {
	public static void main(String[] args) {
		// 「2つの同じ文字列を入力してください」メッセージ出力
		System.out.println("2つの同じ文字列を入力してください");
		// Scannerインスタンス生成
		Scanner scanner = new Scanner(System.in);
		// while文で繰り返し処理の宣言
		while (true) {
			// 「1個目：Input1」メッセージ出力
			System.out.print("1個目：");
			// キーボード3文字ひらがな入力
			String inputStr1 = scanner.nextLine();
			// 「2個目：Input2」メッセージ出力
			System.out.print("2個目：");
			// キーボード3文字ひらがな入力
			String inputStr2 = scanner.nextLine();
			// while文：inpuStrt1とinputStr2のどちらかまたは両方が空白の場合
			if (inputStr1.isBlank() || inputStr2.isBlank()) {
				//「空白が入力されています」の出力
				System.out.println("空白が入力されています");
			//while文：inputStr1とinputStr2が違う場合
			} else if (!(inputStr1.equals(inputStr2))) {
				// 「違う文字列です」メッセージ出力
				System.out.println("違う文字列です");
			//while文：inputStr1とinputStr2が同じ場合
			} else {
				//「同じ文字列です」の出力
				System.out.println("同じ文字列です");
				break;
			}
		}
		// Scannerクローズ
		scanner.close();
	}
}
