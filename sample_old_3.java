public class sample_old_3 {

  // public static void sayHi(String name) { //直接実行する場合。「void」は何も返さない場合の記述
  // System.out.println("はーい！" + name + "元気ですか？");
  // }

  public static String sayHi(String name) {// returnで値を帰す場合は型を先に宣言する(ここではString型
    return "おっしゃ！" + name + "元気だったか？";
  }

  public static String sayHi() {// 引数がなければ同じメソッド名でも共存できる（メソッドの）オーバーロード
    return "おっす！　おめえ元気だったか？";
  }

  public static void main(String[] args) {
    // sayHi();
    String msg1 = sayHi();// 変数なし
    String msg2 = sayHi("へたれ");// 変数入り
    System.out.println(msg1);// 無難な挨拶
    System.out.println(msg2);// 変数の名前に対しての挨拶

  }
}
