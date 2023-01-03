package basis.Question09;

import java.util.Scanner;

public class Question09 {

	public static void main(String[] args) {
		//変数宣言（配列、Scanner
		int array[] = new int[5];
		Scanner scanner = new Scanner(System.in);
		//1.「5つの整数を入力してください」の表示
		System.out.println("5つの整数を入力してください");
		try {
			//2. 繰り返し処理（初期値1、6未満、1を足していく）
			for (int i = 0; i < 5; i++) {
				//1. 「i個目：」を表示
				System.out.print(i + 1 + "個目：");
				//2. キーボード入力を配列変数に格納
				String strInput = scanner.nextLine();
				array[i] = Integer.parseInt(strInput);
				//3. 繰り返し処理完了
			}
			System.out.print("昇順ソート結果は");
			//２繰り返し処理で昇順ソート
			//1. 繰り返し処理（初期値0、要素数-1未満、1を足していく）
			for (int i = 0; i < array.length; i++) {
				//1. （初期値i、要素数未満、1を足していく） 
				for (int j = i + 1; j < array.length; j++) {
					//2. array[I] がsorarray[j]より小さい場合       
					if (array[i] > array[j]) {
						//3. 値交換のための変数宣言
						int swp = array[j];
						array[j] = array[i];
						array[i] = swp;
					}
				}
				System.out.print(array[i] + " ");
			}
			System.out.println("です");
			//3.最大値、最小値出力
			System.out.println("最大値は " + array[4] + " です");
			System.out.println("最小値は " + array[0] + " です");
		} catch (NumberFormatException e) {
			System.out.println("整数以外の値が入力されました");
		} finally {
			scanner.close();
		}
	}

}
