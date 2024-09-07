package lesson13.map;

public class MapDemo {

        public static void main(String[] args) {
            MapFun<String, Integer> map = new MapFun<>(10);
            map = map.put("one", 1);
            map = map.put("two", 2);
            map = map.put("three", 3);
            map = map.put("four", 4);
            map = map.put("five", 5);
            map = map.put("six", 6);
            map = map.put("seven", 7);
            map = map.put("eight", 8);
            map = map.put("nine", 9);
            map = map.put("ten", 10);

            System.out.println("_________get hash MapFun________");
            System.out.println(map.getHash("seven"));
            System.out.println("_________get value MapFun________");
            System.out.println(map.getValue("seven"));
            System.out.println("_________get value no exist MapFun________");
            System.out.println(map.getHash("eleven"));
            System.out.println("_________display MapFun________");
            map.display();

        }
}
