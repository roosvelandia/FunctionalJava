package lesson12;

import java.util.Map;

public class MapFunctionalOperations {
    public static void main(String[] args) {
        Map<String,String> contacts = Map.of(
                "1234567890","John",
                "098765432","Doe",
                "123456789","Jane",
                "0987654321","Doe"
        );

        //Traversal
        System.out.println("________Traversal________");
        contacts.forEach((k,v)-> System.out.println(k+" : "+v));
        //Filtering
        System.out.println("_______Filtering_________");
        contacts.entrySet().stream()
                .filter(e->e.getKey().equals("1234567890"))
                .forEach(e-> System.out.println(e.getKey()+" : "+e.getValue()));
        //Sorting
        System.out.println("_______Sorting_________");
        contacts.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e-> System.out.println(e.getKey()+" : "+e.getValue()));
        //Mapping
        System.out.println("_______Mapping_________");
        contacts.entrySet().stream()
                .map(e->e.getKey()+" : "+e.getValue())
                .forEach(System.out::println);
        //Reduce
        System.out.println("_______Reduce_________");
        contacts.entrySet().stream()
                .map(e->e.getKey()+" : "+e.getValue())
                .reduce((e1,e2)->e1+" | "+e2)
                .ifPresent(System.out::println);
    }
}
