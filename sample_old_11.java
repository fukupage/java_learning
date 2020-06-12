import java.util.*;

// HashMap--------------------------------------------------------------
//HashMap:key Value（データは不順）
//TreeMap（データはkey順）
//LinkedHashMap（データは追加順）

public class sample_old_11 {
  public static void main(String[] args) {
    // HashMap: key value
    // HashMap<String, Integer> sales = new HashMap<>();
    Map<String, Integer> sales = new HashMap<>();
    sales.put("Rei", 100);
    sales.put("Fuku", 150);
    sales.put("BowWorks", 200);
    sales.put("FKPG", 250);

    System.out.println(sales.get("Rei"));
    System.out.println(sales.get("Fuku"));
    System.out.println(sales.get("BowWorks"));
    System.out.println(sales.get("FKPG"));
    System.out.println(sales.size());

    for (Map.Entry<String, Integer> sale : sales.entrySet()) {
      System.out.println(sale.getKey() + ":" + sale.getValue());
    }

    sales.put("Rei", 3500);
    sales.remove("FKPG");
    for (Map.Entry<String, Integer> sale : sales.entrySet()) {
      System.out.println(sale.getKey() + ":" + sale.getValue());
    }
  }
}

// // HashSet--------------------------------------------------------------
// import java.util.*;

// public class sample{
// public static void main(String[] args){
// //HashSet
// //TreeSet
// //LinkedSet
// // HashSet<Integer> sales = new HashSet<>();
// Set<Integer> sales = new HashSet<>();

// sales.add(100);
// sales.add(150);
// sales.add(200);
// sales.add(250);
// sales.add(150);

// System.out.println(sales.size());

// for (Integer sale : sales){
// System.out.println(sale);
// }
// System.out.println("-----------------------------------------------------------------");
// sales.remove(250);
// for (Integer sale : sales){
// System.out.println(sale);
// }
// }
// }

// // ArrayList--------------------------------------------------------------
// import java.util.*;

// public class sample{
// public static void main(String[] args){
// //ArrayList
// //LinkedList 要素の追加と削除は早いが検索は遅い
// // ArraList<Integer> sales = new ArrayList<>();
// List<Integer> sales = new ArrayList<>();
// sales.add(100);
// sales.add(200);
// sales.add(250);

// for (int i = 0; i < sales.size(); i++){
// System.out.println(sales.get(i));
// }

// sales.set(0,150);
// sales.set(1,250);
// sales.remove(2);

// for (Integer sale : sales){
// System.out.println(sale);
// }

// }
// }

// //Math、Random--------------------------------------------------------------
// import java.util.Random;
// public class sample {
// public static void main(String[] args) {
// double d = 532.56;
// System.out.println(Math.ceil(d));
// System.out.println(Math.floor(d));
// System.out.println(Math.round(d));
// System.out.println(Math.PI);
// // System.out.println(Math.random());

// Random r = new Random();
// System.out.println(r.nextDouble());
// System.out.println(r.nextInt(100));
// System.out.println(r.nextBoolean());
// }
// }

// //printf（特定の書式で出力する）--------------------------------------------------------------

// public class sample{
// public static void main(String[] args){
// int score = 50;
// double height = 163.5;
// String name = "Rei Fukuda";
// System.out.printf("名前: %-10s, 得点: %10d, 身長: %5.2f\n", name, score, height);

// //Stringで受けてから出力する場合はprintlnでも可能
// String s = String.format("名前: %-10s, 得点: %10d, 身長: %5.2f\n", name, score,
// height);
// System.out.println(s);
// }
// }
