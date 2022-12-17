package basis.Question04;

import java.util.Scanner;

public class Question04 {
	public static void main(String[] args) {
		// 「2つの同じ文字列を入力してください」メッセージ出力
		System.out.println("2つの同じ文字列を入力してください");
		// try-catch-finally文
		try {
			// while文で繰り返し処理の宣言
			while (true) {
				Scanner scanner = new Scanner(System.in);
				// キーボード3文字ひらがな入力
				String Input1 = scanner.nextLine();
				// キーボード3文字ひらがな入力
				String Input2 = scanner.nextLine();
				// 「1個目：Input1」メッセージ出力
				System.out.println("1個目：" + Input1);
				// 「2個目：Input2」メッセージ出力
				System.out.println("2個目：" + Input2);
				// while文：Input1とInput2が同値の場合
				if (Input1.equals(Input2)) {
					// 「同じ文字列です」メッセージ出力
					System.out.println("同じ文字列です");
					// break文
					break;
				} else {
					// 「違う文字列です」メッセージ出力
					System.out.println("違う文字列です");
					continue;
				}
			}
			// if文：Input1、input2どちらかが空欄の場合
		} catch (NullPointerException e) {
			// 「空白が入力されています」メッセージ出力
			System.out.println("空白が入力されています");
		}
	}
}
