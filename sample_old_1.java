public class sample_old_1 {

  public static void main(String[] args) {

int[] sales = {750, 2550, 6550,2150,990,5320};

for(int sale : sales){
    System.out.println("この商品は" + sale + "円です。");
}


// for (int i = 0; i < sales.length; i++){
//   System.out.println("この商品は" + sales[i] + "円です。");
// }



/*
    //配列
int[] sales = {5,10,15};

// int[] sales;
// sales = new int[]{5,10,15};

// // sales = new int[3];
// // sales[0] = 5;
// // sales[1] = 10;
// // sales[2] = 15;


System.out.println(sales[0]);
System.out.println(sales[1]);
System.out.println(sales[2]);

sales[0] = 255;
System.out.println(sales[0]);
*/
    /*
//for
// break
// continue

for (int i = 0 ; i < 10 ; i++ ){
  if(i == 5){
//    break; //この行で処理を中断
      continue;//このときだけ処理をスキップ
  }
  System.out.println("今は" + i + "番目");
}

// for (int i = 0 ; i < 10 ; i++ ){
//   System.out.println("今は" + i + "番目");
// }
*/
/*
//while ・ do while
int i = 0;

do {
  System.out.println("今は" + i + "番目");
  i++;
} while(i < 10);

// while(i < 10){
//   i++;
//   System.out.println("今は" + i + "番目");
// }
*/
/*
    //SWITCH
    String signal = "green";

    switch (signal) {
      case "red":
        System.out.println("--------------- S T O P ! --------------");
        break;
      case "yellow":
        System.out.println("- C - A - T - I - O - N -");
        break;
      case "blue":
      case "green":
        System.out.println("GO");
        break;
      default: //どれでもない場合
        System.out.println("what?");
        break;
    }
    //
*/
    /*
     * //if // > < >= <= == != // && || !
     *
     * int score = 100; // if (score > 80){ // System.out.println("Great!"); // }
     * else if(score > 60){ // System.out.println("Good"); // } else { //
     * System.out.println("umm......"); // } String mes = score > 80 ? "Great!" :
     * "ummm....."; System.out.println(mes);
     */

    /*
     * //キャストする double d = 45685.22357; int i = (int)d; System.out.println(i);
     *
     * int ii = 1; double dd = (double)ii / 4; System.out.println(dd);
     */
    /*
     * int i; i = 100 / 3; System.out.println(i); i = 100 % 3;
     * System.out.println(i); int ii = 100; ii++; System.out.println(ii); ii--;
     * System.out.println(ii);
     *
     * //変数型 変数名 String msg; msg = "Hello World!"; String plus = " Again!";
     * System.out.println(msg + plus);
     *
     * char a = 'A'; //文字 //整数 byte short int long(通常intでOK。long型は数値の最後にLをつける) int x
     * = 100; long y = 123456789101112L; //浮動小数点 float
     * double（通常はdoubleでOK。floatの場合は数値の最後にFをつける） double d = 24.3620679; float f =
     * 3.141592F; //論理値 true もしくは false boolean flag = true;
     *
     * //エスケープ \n(改行) \t(タブ) System.out.println(a + '\n'); System.out.println(x +
     * '\n'); System.out.println(y + '\n'); System.out.println(d + '\n');
     * System.out.println(f + '\n'); System.out.println(flag);
     */
  }
}
