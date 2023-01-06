package basis.Question13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question13 {
	public static void main(String[] args) {
		//メッセージ出力
		System.out.println("1：足し算結果⇒引き算結果の順で出力する");
		System.out.println("2：引き算結果⇒足し算結果の順で出力する");
		System.out.print("番号を選択してください（1,2）：");
		//try-with-resources
		try (Scanner scanner = new Scanner(System.in);) {
			//キーボード入力
			int bango = scanner.nextInt();
			//switch文
			switch (bango) {
				//1の場合
				case 1:
					//メッセージ出力
					System.out.println("整数を入力してください");
					System.out.print("1個目：");
					//キーボード入力
					int intInput1 = scanner.nextInt();
					//メッセージ出力
					System.out.print("2個目：");
					//キーボード入力
					int intInput2 = scanner.nextInt();
					//CalculateSuperクラスのインスタンス生成
					CalculateSuper CalcSuper = new CalculateSuper(intInput1, intInput2);
					//flowメソッドの呼び出し
					CalcSuper.flow();
					break;
				//2の場合
				case 2:
					//メッセージ出力
					System.out.println("整数を入力してください");
					System.out.print("1個目：");
					//キーボード入力
					int intInput3 = scanner.nextInt();
					//メッセージ出力
					System.out.print("2個目：");
					//キーボード入力
					int intInput4 = scanner.nextInt();
					//CalculateChildクラスのインスタンス生成
					CalculateChild CalcChild = new CalculateChild(intInput3, intInput4);
					//flowメソッドの呼び出し
					CalcChild.flow();
					break;
				//defaultメソッド
				default:
					//メッセージ出力
					System.out.println("1～2の範囲で入力してください");
			}
		} catch (InputMismatchException e) {//catchメソッド
			//メッセージ出力
			System.out.println("整数以外の値が入力されました");
		}
	}
}
