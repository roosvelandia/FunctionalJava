package lesson14.observerdesign;

public interface SubjectLibrary {
    void subscribeObserver(ObserverLibrary observer);
    void unsubscribeObserver(ObserverLibrary observer);
    void notifyObserver();
}
