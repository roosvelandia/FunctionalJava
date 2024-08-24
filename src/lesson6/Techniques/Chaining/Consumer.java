package lesson6.Techniques.Chaining;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

@FunctionalInterface
public interface Consumer <T>{
    void accept(T t);

    default Consumer<T> thenAccept(Consumer<T> consumer2) {

        Objects.requireNonNull(consumer2);

        return t -> {
            this.accept(t);
            consumer2.accept(t);
        };
    }
}
