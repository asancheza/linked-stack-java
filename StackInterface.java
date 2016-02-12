interface StackInterface<T> {
  void push(T value);
  void queue(T value);
  T pop();
  T peek();
  boolean isEmpty();
  void clear();
}