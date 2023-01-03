package basis.Question13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question13 {
	public static void main(String[] args) {
		//「1：足し算結果⇒引き算結果の順で出力する」メッセージ出力
		System.out.println("1：足し算結果⇒引き算結果の順で出力する");
		//「2：引き算結果⇒足し算結果の順で出力する」メッセージ出力
		System.out.println("2：引き算結果⇒足し算結果の順で出力する");
		//「番号を選択してください（1,2）：」メッセージ出力
		System.out.print("番号を選択してください（1,2）：");
		//try-with-resources文：Scanner宣言
		try (Scanner scanner = new Scanner(System.in);) {
			//int型キーボード入力
			int bango = scanner.nextInt();
			//switch文
			switch (bango) {
				//1の場合
				case 1:
					//「整数を入力してください」メッセージ出力
					System.out.println("整数を入力してください");
					//「1個目：」メッセージ出力
					System.out.print("1個目：");
					//int型キーボード入力
					int intInput1 = scanner.nextInt();
					//「2個目：」メッセージ出力
					System.out.print("2個目：");
					//int型キーボード入力
					int intInput2 = scanner.nextInt();
					//CalculateSuperクラスのインスタンス生成（引数はキーボード入力値）
					CalculateSuper CalcSuper = new CalculateSuper(intInput1, intInput2);
					//flowメソッドの呼び出し
					CalcSuper.flow();
					break;
				//2の場合
				case 2:
					//「整数を入力してください」メッセージ出力
					System.out.println("整数を入力してください");
					//「1個目：」メッセージ出力
					System.out.print("1個目：");
					//int型キーボード入力
					int intInput3 = scanner.nextInt();
					//「2個目：」メッセージ出力
					System.out.print("2個目：");
					//int型キーボード入力
					int intInput4 = scanner.nextInt();
					//CalculateChildクラスのインスタンス生成（引数はキーボード入力値）
					CalculateChild CalcChild = new CalculateChild(intInput3, intInput4);
					//flowメソッドの呼び出し
					CalcChild.flow();
					break;
				//defaultメソッド
				default:
					//「1～2の範囲で入力してください」のメッセージ出力
					System.out.println("1～2の範囲で入力してください");
			}
		} catch (InputMismatchException e) {//catchメソッド
			//「整数以外の値が入力されました」の出力
			System.out.println("整数以外の値が入力されました");
		}
	}
}
