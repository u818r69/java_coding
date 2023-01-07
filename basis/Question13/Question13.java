package basis.Question13;

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
			String bango = scanner.nextLine();
			//String型からint型への変換
			int num = Integer.parseInt(bango);
			if (num == 1 || num == 2) {
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
				//switch文
				switch (num) {
					//1の場合
					case 1:
						//CalculateSuperクラスのインスタンス生成
						CalculateSuper calcSuper = new CalculateSuper(intInput1, intInput2);
						//flowメソッドの呼び出し
						calcSuper.flow();
						break;
					//2の場合
					case 2:
						//CalculateChildクラスのインスタンス生成
						CalculateChild calcChild = new CalculateChild(intInput1, intInput2);
						//flowメソッドの呼び出し
						calcChild.flow();
						break;
				}
			} else {
				System.out.println("1～2の範囲で入力してください");
			}
		} catch (NumberFormatException e) {//catchメソッド
			//メッセージ出力
			System.out.println("整数以外の値が入力されました");
		}
	}
}
