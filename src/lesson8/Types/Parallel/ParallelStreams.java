package lesson8.Types.Parallel;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreams {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            employees.add(new Employee("John", 50000));
            employees.add(new Employee("Sara", 100000));
            employees.add(new Employee("Mike", 80000));
            employees.add(new Employee("Sara", 60000));
            employees.add(new Employee("John", 30000));
        }
// sequential stream
        long startTime = System.currentTimeMillis();
        System.out.println("total employees = " + employees.stream().filter(e -> e.getSalary() > 60000)
                .count());
        long endTime = System.currentTimeMillis();

        System.out.println("Sequential stream took: " + (endTime - startTime) + " ms");

        // parallel stream
        long startParallelTime = System.currentTimeMillis();
        System.out.println("total employees = " + employees.parallelStream().filter(e -> e.getSalary() > 60000)
                .count());
        long endParallelTime = System.currentTimeMillis();

        System.out.println("Parallel stream took: " + (endParallelTime - startParallelTime) + " ms");
    }
}
