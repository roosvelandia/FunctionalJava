package lesson10.Collectors1;


import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class CollectorsInAction {
    public static void main(String[] args) {

        Path path = Path.of("src/lesson10/Collectors1/EmployeeData.txt");
        try (Stream<String> lines = Files.lines(path)) {
            Stream<String> words = lines.flatMap(line -> Stream.of(line.split(",")));
            Spliterator<String> wordsSpliterator = words.spliterator();
            Spliterator<EmployeeC> employeeSpliterator = new EmployeeSpliterator(wordsSpliterator);

            Stream<EmployeeC> employeeStream = StreamSupport.stream(employeeSpliterator, false);

            // a List of Employees
            List<EmployeeC> collectEmployeeCS = employeeStream.toList();
            // a List of names
            System.out.println("_____________ LIST ______________");
            List<String> collectNames = collectEmployeeCS.stream().map(EmployeeC::getName).toList();
            collectNames.forEach(System.out::println);
            // all employee designations
            System.out.println("_____________ SET ______________");
            Set<String> collectDesignations = collectEmployeeCS.stream().map(EmployeeC::getDesignation).collect(Collectors.toSet());
            collectDesignations.forEach(System.out::println);
            // sorted by salary
            System.out.println("_____________ TREESET ______________");
            TreeSet<EmployeeC> employeesSorted = collectEmployeeCS.stream().collect(Collectors.toCollection(TreeSet::new));
            employeesSorted.forEach(System.out::println);
            // sorted by salary
            System.out.println("_____________ MAP ______________");
            Map<Integer, String> mapEmployees = collectEmployeeCS.stream().collect(Collectors.toMap(EmployeeC::getId, EmployeeC::getName));
            mapEmployees.forEach((k, v) -> System.out.println(k + " " + v));
            // two genders
            System.out.println("_____________ MAP PARTITIONING BY ______________");
            Map<Boolean, List<EmployeeC>> mapGender = collectEmployeeCS.stream().collect(Collectors.partitioningBy(employee -> employee.getGender() == 'M'));
            List<EmployeeC> maleEmployees = mapGender.get(true);
            List<EmployeeC> femaleEmployees = mapGender.get(false);
            System.out.println("FEMALES");
            maleEmployees.forEach(System.out::println);
            System.out.println("MALES");
            femaleEmployees.forEach(System.out::println);
            // several designations
            System.out.println("_____________ MAP GROUPING BY ______________");
            Map<String, List<EmployeeC>> mapDesignation = collectEmployeeCS.stream().collect(Collectors.groupingBy(employee -> employee.getDesignation()));
            mapDesignation.forEach((k, v) -> System.out.println(k + " " + v));
            List<EmployeeC> devEmployees = mapDesignation.get("Developer");
            List<EmployeeC> archEmployees = mapDesignation.get("Architect");
            List<EmployeeC> leadEmployees = mapDesignation.get("Lead");
            System.out.println("DEVELOPERS");
            devEmployees.forEach(System.out::println);
            System.out.println("ARCHITECT");
            archEmployees.forEach(System.out::println);
            System.out.println("LEAD");
            leadEmployees.forEach(System.out::println);

            // several designations
            System.out.println("_____________ JOIN ______________");
            String names = collectEmployeeCS.stream().map(EmployeeC::getName).collect(Collectors.joining(","));
            System.out.println(names);

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
