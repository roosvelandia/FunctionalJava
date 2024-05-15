package lesson3.genericFunctionalInterface;

@FunctionalInterface
public interface FunctionalGenerics <T, R>{
    R execute(T t);
}
