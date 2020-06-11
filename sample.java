//Stringクラス----------------------------------------------------
public class sample{
  public static void main(String[] args){
    String s = "abcdef";
    System.out.println(s.length());
    System.out.println(s.substring(2,5));
    System.out.println(s.replaceAll("ab", "AB"));

    String s1 = "abc";
    String s2 = "abc";
    if(s1.equals(s2)){
      System.out.println("ばっちりやでー");
    }


    String ss1 = new String("abc");
    String ss2 = new String("abc");
    if(ss1 == ss2){
      System.out.println("こっちもばっちりやでー");
    }
  }
}



// //スレッド -----------------------------------------------------
// // class MyRunnable implements Runnable{//関数型インターフェース
// //   @Override
// //   public void run(){
// //     for(int i = 0;i < 500 ; i++){
// //       System.out.print('^');
// //     }
// //   }
// // }

// public class sample {
//   public static void main(String[] args) {
//     // MyRunnable r = new MyRunnable();
//     // Thread t = new Thread(r);
//     // t.start();
//     // ラムダ式
//     // （引数） -> （処理）

//     // new Thread(new Runnable(){
//     // @Override
//     // public void run(){
//     // for(int i = 0;i < 500 ; i++){
//     // System.out.print('^');
//     // }
//     // }
//     // }).start(); //無名クラス
//     // for(int i = 0;i < 500 ; i++){
//     // System.out.print('*');
//     // }
//     // }
//     new Thread(() -> {
//       for (int i = 0; i < 500; i++) {
//         System.out.print('^');
//       }
//     }).start(); // 無名クラス
//     for (int i = 0; i < 500; i++) {
//       System.out.print('*');
//     }
//   }
// }
