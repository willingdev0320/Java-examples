// generics/HijackedInterface.java
// (c)2016 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// {CompileTimeError} (Will not compile)

class Cat
  extends ComparablePet implements Comparable<Cat>{
  // error: Comparable cannot be inherited with
  // different arguments: <Cat> and <ComparablePet>
  // class Cat
  // ^
  // 1 error

  public int compareTo(Cat arg) { return 0; }
}
