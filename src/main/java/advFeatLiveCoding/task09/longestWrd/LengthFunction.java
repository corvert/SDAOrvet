package advFeatLiveCoding.task09.longestWrd;

@FunctionalInterface
public interface LengthFunction<T> {
    int getLength(T element);
}
