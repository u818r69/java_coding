package basis.Question10;

import java.util.Scanner;

public class Question10 {
	//倍数、累乗指数の宣言
	static final int MULTIPLE_NUMBER = 2;
	static final int INDEX_NUMBER = 2;

	public static void main(String[] args) {
		//メッセージ出力
		System.out.println("整数を入力してください");
		//例外処理
		try (Scanner scanner = new Scanner(System.in);) {
			//キーボード入力
			String strInput = scanner.nextLine();
			//String型からint型に型変換
			int intInput = Integer.parseInt(strInput);
			//2倍メソッド呼び出し
			printCalculateDouble(intInput);
			//2乗メソッド呼び出し
			printCalculateSquare(intInput);
		} catch (NumberFormatException e) {//例外処理
			//メッセージ出力
			System.out.println("整数以外の値が入力されました");
		}
	}

	public static void printCalculateDouble(int num) {
		//引数を倍数
		int doubleAns = num * MULTIPLE_NUMBER;
		//メッセージ出力
		System.out.println("入力された " + num + " を" + MULTIPLE_NUMBER + "倍した値は " + doubleAns + " です");
	}

	public static void printCalculateSquare(int num) {
		//引数を累乗
		int squareAns = (int) Math.pow(num, INDEX_NUMBER);
		//メッセージ出力
		System.out.println("入力された " + num + " を" + INDEX_NUMBER + "乗した値は " + squareAns + " です");
	}

}
