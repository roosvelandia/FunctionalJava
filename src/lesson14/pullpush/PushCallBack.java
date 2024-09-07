package lesson14.pullpush;

public interface PushCallBack {
    void pushComplete();
    void pushData(String data);
    void pushError(Exception e);
}
