package basis.Question08;

import java.util.ArrayList;
import java .util.List;
//java.util.Scannerクラスのimport文
import java.util.Scanner;

public class Question08 {
	public static void main(String[] args) {
		//1. 入力する整数の数をキーボードで入力
		//1-1. 「整数の数を入力してください」メッセージ出力
		System.out.println("整数の数を入力してください");
		//1-2. scanner変数の宣言
		Scanner scanner = new Scanner(System.in);
		//1-3. strInput1へのキーボード入力
		//5. 例外処理　
		//5-1. try文
		try {
			String strInput1 = scanner.nextLine();
			//1-4. String型からint型に型変換
			int num = Integer.parseInt(strInput1);
			//5-2. 整数の数に0以下が入力された場合
			if (num == 0) {
				System.out.println("整数の数は0より大きい値を入力してください");
			} else {
				//2-1. ArrayListクラスの宣言
				List<Integer> seisu = new ArrayList<>();
				//4. 平均の出力
				//4-1. 変数totalの宣言
				int total = 0;
				//2. 整数入力ループ
				//2-2. 「整数の各値を入力してください」メッセージ出力
				System.out.println("整数の各値を入力してください");
				//2-3. for文で整数を指定した個数分入力する
				for (int i = 0; i < num; i++) {
					//2-4.「i + 1個目：」メッセージ出力
					System.out.print(i + 1 + "個目：");
					//2-5. キーボード入力
					String strInput2 = scanner.nextLine();
					//2-6. String型からint型に型変換
					int intInput1 = Integer.parseInt(strInput2);
					//2-7. 整数を配列arrayに格納
					seisu.add(intInput1);
				}
				//3. 入力された整数の出力ループ
				//3-1. 「入力された値は」メッセージ出力
				System.out.print("入力された値は ");
				//3-1. for文で入力された整数の出力ループ
				for (int sample:seisu) {
					//3-2. 入力された整数の出力
					System.out.print(sample + " ");
					//4-2. totalの加算
					total += sample; 
				}
				//3-3. 「です」出力
				System.out.println("です");
				//4. 平均の出力
				//4-3. 変数avgに変数totalを変数numで割った数を代入
				int avg = total / num;
				//4-4. 「入力された整数の平均は  avg です」メッセージ出力
				System.out.println("入力された整数の平均は " + avg + " です");
			}
		} catch (NumberFormatException e) { // catch文：整数以外の値が入力された場合
			// 「整数以外の値が入力されました」のメッセージ出力
			System.out.println("整数以外の値が入力されました");
		} finally {
			scanner.close();
		}
	}
}
