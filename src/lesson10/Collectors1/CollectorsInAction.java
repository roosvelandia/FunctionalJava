package lesson10.Collectors1;


import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class CollectorsInAction {
    public static void main(String[] args) {

        Path path = Path.of("src/lesson10/Collectors1/EmployeeData.txt");
        try(Stream<String> lines =  Files.lines(path)){
            Stream<String> words = lines.flatMap(line -> Stream.of(line.split(",")));
            Spliterator<String> wordsSpliterator = words.spliterator();
            Spliterator<com.basicsstrong.functional.section11.Employee> employeeSpliterator = new EmployeeSpliterator(wordsSpliterator);

            Stream<com.basicsstrong.functional.section11.Employee> employeeStream = StreamSupport.stream(employeeSpliterator, false);

            // a List of Employees
            List<com.basicsstrong.functional.section11.Employee> collectEmployees = employeeStream.toList();
            // a List of names
            System.out.println("_____________ LIST ______________");
            List<String> collectNames = collectEmployees.stream().map(com.basicsstrong.functional.section11.Employee::getName).toList();
            collectNames.forEach(System.out::println);
            // all employee designations
            System.out.println("_____________ SET ______________");
            Set<String> collectDesignations = collectEmployees.stream().map(com.basicsstrong.functional.section11.Employee::getDesignation).collect(Collectors.toSet());
            collectDesignations.forEach(System.out::println);

        }catch (java.io.IOException e){
            e.printStackTrace();
        }
    }
}
