//: typeinfo/GenericClassReferences.java
// �2015 MindView LLC: see Copyright.txt

public class GenericClassReferences {
  public static void main(String[] args) {
    Class intClass = int.class;
    Class<Integer> genericIntClass = int.class;
    genericIntClass = Integer.class; // Same thing
    intClass = double.class;
    // genericIntClass = double.class; // Illegal
  }
} /* Output: (None) *///:~
