package basis.Question13;

import java.util.Scanner;

public class Question13 {
	//選択肢の定数化
	static final int SUM_SUBTRACTION = 1;
	static final int SUBTRACTION_SUM = 2;

	public static void main(String[] args) {
		//メッセージ出力o
		System.out.println("1：足し算結果⇒引き算結果の順で出力する");
		System.out.println("2：引き算結果⇒足し算結果の順で出力する");
		System.out.print("番号を選択してください（1,2）：");
		//try-with-resources
		try (Scanner scanner = new Scanner(System.in);) {
			//キーボード入力
			String bango = scanner.nextLine();
			//String型からint型への変換
			int num = Integer.parseInt(bango);
			//ifのみ構文
			if (!(num == SUM_SUBTRACTION || num == SUBTRACTION_SUM)) {
				System.out.println("1～2の範囲で入力してください");
				return;
			}
			//メッセージ出力
			System.out.println("整数を入力してください");
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
			//if文
			if (num == SUM_SUBTRACTION) {
				//CalculateSuperクラスのインスタンス生成
				CalculateSuper calcSuper = new CalculateSuper(intInput1, intInput2);
				//flowメソッドの呼び出し
				calcSuper.flow();
			} else {
				//CalculateChildクラスのインスタンス生成
				CalculateChild calcChild = new CalculateChild(intInput1, intInput2);
				//flowメソッドの呼び出し
				calcChild.flow();
			}
		} catch (NumberFormatException e) {//catchメソッド
			//メッセージ出力
			System.out.println("整数以外の値が入力されました");
		}
	}
}
