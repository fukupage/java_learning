public class sample_old_2 {

  public static void main(String[] args) {
    //参照型の変数の挙動 -----------------------------------------------------------------------
    int[] a = { 3, 5, 7 };
    int[] b = a;// ここで代入されるのは、値ではなく代入される変数のアドレスなので、
    b[1] = 8;// ここで行われているのは、実際はa[]の中身に代入されている
    System.out.println(a[1]);// なので、
    System.out.println(b[1]);// a[1]とb[1]の値はおなじになるので要注意！

    String s = "hello";//String型は参照型のではあるが、
    String t = s;
    t = "world";
    System.out.println(s);//そのへんの対処ができているため、
    System.out.println(t);//sとtの値は違うものが入っている。

    // int x = 10;
    // int y = x;
    // y = 5;
    // System.out.println(x);
    // System.out.println(y);
  }
}
