package FourA;

public interface Notifier {
	void addListener(Listener listener);
    void removeListener(Listener listener);
    void notifyListeners(String event);
}
