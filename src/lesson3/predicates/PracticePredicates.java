package lesson3.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PracticePredicates {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Basics");
        list.add("");
        list.add("Strong");
        list.add("BasicsStrong");

        Predicate<String> predicate = s -> !s.isEmpty();

        List<String> newList = filterList(list, predicate);
        System.out.println(newList);

        List<Integer> intList = List.of(1,4,6,7,8);
        Predicate<Integer> intPredicate = i -> i%2 == 0;
        List<Integer> newIntList = filterList(intList, intPredicate);
        System.out.println(newIntList);

        Predicate<String> filter = s-> s.contains("Basics");
        List<String> filterList = filterList(list, filter);
        System.out.println(filterList);


    }

    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {

        List<T> newList = new ArrayList<>();
        for(T s : list){
            if(predicate.test(s)){
                newList.add(s);
            }
        }
        return newList;
    }
}
