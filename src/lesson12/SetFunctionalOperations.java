package lesson12;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetFunctionalOperations {

    public static void main(String[] args) {
        Set<Integer>  set = Set.of(2,6,1,52,5,61,8,9,96,0,18,23);

        //Traversal
        System.out.println("________Traversal________");
        set.forEach(System.out::println);
        //Filtering
        System.out.println("_______Filtering_________");
        set.stream()
                .filter(e->e%2==0)
                .forEach(System.out::println);
        //Sorting
        System.out.println("_______Sorting_________");
        set.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("_______Sorting TreeSet_________");
        TreeSet<Integer> treeSet = set.stream()
                .collect(Collectors.toCollection(TreeSet::new));
        treeSet.forEach(System.out::println);

        //Mapping
        System.out.println("_______Mapping_________");
        Set<Double> setDouble = set.stream()
                .map(Double::valueOf)
                .collect(Collectors.toSet());
        setDouble.forEach(System.out::println);
        //Reduce
        System.out.println("_______Reduce_________");
        set.stream()
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
    }
}
