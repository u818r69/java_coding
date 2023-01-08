package basis.Question12;

import java.util.Scanner;

public class Question12 {
	//選択肢の定数化
	static final int NAME_NUMBER = 1;
	static final int NO_NAME_NUMBER = 2;

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
			//ifのみ構文
			if (!(intInput == NAME_NUMBER || intInput == NO_NAME_NUMBER)) {
				System.out.println("1～2の範囲で入力してください");
				return;
			}
			//インスタンス生成
			Person person = new Person();
			//if文分岐
			if (intInput == NAME_NUMBER) {
				//メッセージ出力
				System.out.println("氏名を入力してください");
				System.out.print("氏名：");
				//キーボード入力
				String strInput2 = scanner.nextLine();
				//メソッド呼び出し
				person.setName(strInput2);
				//getterメソッドの呼び出し
				System.out.println("私の名前は " + person.getName() + " です");
			} else {
				//メソッド呼び出し
				System.out.println("私の名前は " + person.getName() + " です");
			}
		} catch (NumberFormatException e) {//例外処理
			System.out.println("整数以外の値が入力されました");
		}
	}
}
