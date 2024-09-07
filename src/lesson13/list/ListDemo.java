package lesson13.list;

import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        System.out.println("_________ListFun________");
        ListFun<String> list =ListFun.list("1","2","3");
        list.forEach(System.out::println);

        System.out.println("_________add element________");
        list.addEle("4")
                .forEach(System.out::println);
        System.out.println("_________add element in position________");
        list.addEle(2,"5")
                .forEach(System.out::println);
        System.out.println("_________remove element________");
        list.removeEle("2")
                .forEach(System.out::println);
        System.out.println("_________remove element in position________");
        list.removeEle(2)
                .forEach(System.out::println);
        System.out.println("_________Reverse ListFun________");
        list.reverseList()
                .forEach(System.out::println);
        System.out.println("_________concat ListFun________");
        ListFun<String> list2 =ListFun.list("one","two","three");
        ListFun<String> list3 =  ListFun.concat(list,list2);
        list3.forEach(System.out::println);
        System.out.println("_________ListFun add all________");
        list2.addAllEle(List.of("four","five","six"))
                .forEach(System.out::println);
    }
}
