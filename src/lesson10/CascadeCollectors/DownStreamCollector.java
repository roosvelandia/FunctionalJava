package lesson10.CascadeCollectors;

import lesson10.Collectors1.EmployeeC;
import lesson10.Collectors1.EmployeeSpliterator;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class DownStreamCollector {
    public static void main(String[] args) {

        Path path = Path.of("src/lesson10/Collectors1/EmployeeData.txt");
        try (Stream<String> lines = Files.lines(path)) {

            Spliterator<String> wordsSpliterator = lines.flatMap(line -> Stream.of(line.split(","))).spliterator();
            Spliterator<EmployeeC> employeeSpliterator = new EmployeeSpliterator(wordsSpliterator);
            List<EmployeeC> employeeStream = StreamSupport.stream(employeeSpliterator, false).toList();

            // count by designation
            Map<String, Long> countByDesignation = employeeStream
                    .stream()
                    .collect(Collectors
                            .groupingBy(employee ->
                                    employee.getDesignation(),
                                    Collectors.counting()));
            countByDesignation.forEach((k, v) -> System.out.println(k + " " + v));

            // salaries by designation
            Map<String, Double> salariesByDesignation = employeeStream
                    .stream()
                    .collect(Collectors
                            .groupingBy(employee ->
                                            employee.getDesignation(),
                                    Collectors.summingDouble(EmployeeC::getSalary)));
            salariesByDesignation.forEach((k, v) -> System.out.println(k + " " + v));

            // max salary employee by designation
            Map<String, Optional<EmployeeC>> maxSalaryByDesignation = employeeStream
                    .stream()
                    .collect(Collectors
                            .groupingBy(employee ->
                                            employee.getDesignation(),
                                    Collectors.maxBy((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))));
            maxSalaryByDesignation.forEach((k, v) -> System.out.println(k + " " + v));

            // max salary by designation
            Map<String, Optional<Double>> maxSalaryValueByDesignation = employeeStream
                    .stream()
                    .collect(Collectors
                            .groupingBy(employee ->
                                            employee.getDesignation(),
                                    Collectors.mapping(
                                            e -> e.getSalary(),
                                            Collectors.maxBy(Comparator.comparing(Double::doubleValue)))));
            maxSalaryValueByDesignation.forEach((k, v) -> System.out.println(k + " " + v));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
