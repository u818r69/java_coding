package basis.Question12;

import java.util.Scanner;

public class Question12 {
	public static void main(String[] args) {
		//メッセージ出力
		System.out.println("1：氏名を入力する");
		System.out.println("2：氏名を入力しない");
		System.out.print("番号を選択してください（1,2）：");
		try (Scanner scanner = new Scanner(System.in);) {
			//キーボード入力
			String strInput1 = scanner.nextLine();
			//String型からint型に型変換
			int intInput = Integer.parseInt(strInput1);
			//if文分岐
			switch (intInput) {
				case 1:
					//メッセージ出力
					System.out.println("氏名を入力してください");
					System.out.print("氏名：");
					//キーボード入力
					String strInput2 = scanner.nextLine();
					//インスタンス生成
					Person person1 = new Person(strInput2);
					//getterメソッドの呼び出し
					System.out.println("私の名前は " + person1.getName() + " です");
					break;
				case 2:
					//インスタンス生成
					Person person2 = new Person();
					//メソッド呼び出し
					System.out.println("私の名前は " + person2.getName() + " です");
					break;
				default:
					System.out.println("1～2の範囲で入力してください");
			}
		} catch (NumberFormatException e) {//例外処理
			System.out.println("整数以外の値が入力されました");
		}
	}
}
