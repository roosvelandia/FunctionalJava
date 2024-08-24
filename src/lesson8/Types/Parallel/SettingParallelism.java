package lesson8.Types.Parallel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class SettingParallelism {

    public static void main(String[] args) {
        System.out.println("Number of cores: " + Runtime.getRuntime().availableProcessors());
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "5");
        System.out.println("Parallelism: " + ForkJoinPool.getCommonPoolParallelism());

        ForkJoinPool forkJoinPool = new ForkJoinPool(1);

        List<Employee> employees = new ArrayList<>();

        for (long i = 0; i < 100000L; i++) {
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

        // with a pool
        long startParallelThreadTime = System.currentTimeMillis();
        forkJoinPool.execute(() -> {
            System.out.println("total employees = " + employees.parallelStream().filter(e -> e.getSalary() > 60000)
                    .count());
        });
        long endParallelThreadTime = System.currentTimeMillis();

        System.out.println("with more threads stream took: " + (endParallelThreadTime - startParallelThreadTime) + " ms");
    }
}
