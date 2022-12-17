package basis.Question03;
import java.util.Scanner;

public class Question03 {
	//mainメソッド
	public static void main(String[] args) {
		//「整数を入力してください」のメッセージ出力
		System.out.println("整数を入力してください");
		//scanner変数の宣言
		Scanner scanner = new Scanner(System.in);
		//例外処理try-catch文
		try {
			//strInputにキーボード入力
			String strInput = scanner.nextLine();
			//String型からint型に型変換
			int intInput = Integer.parseInt(strInput);
			//for文：j=0, i < intInput, I++
			int i;
			for(i = 0, i < intInput, i++) {

	//for文：j=intInput,  , j++

	//「＊」の出力

	//「 」の出力

	//try文の終了

	//catch文：整数以外の値が入力された場合

	//「整数以外の値が入力されました」のメッセージ出力


}
