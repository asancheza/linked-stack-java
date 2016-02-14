/*
 * Stack interface
 * 
 * @author Alejandro Sanchez Acosta
 */

interface StackInterface<T> {
  void push(T value);
  void queue(T value);
  T pop();
  T peek();
  boolean isEmpty();
  void clear();

  /* Additional methods */
  T peek2();
  String toString();
  void remove(int n);
  void pushAll(T[] a);
}