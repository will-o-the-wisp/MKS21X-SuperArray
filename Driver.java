public class Driver{
  public static void main(String[] args) {
    SuperArray a = new SuperArray();
    a.add("hi");
    a.add("bye");
    System.out.println(a.toStringDebug());
    a.resize();
    a.set(1, "hey");
    System.out.println(a.toStringDebug());
  }
}
