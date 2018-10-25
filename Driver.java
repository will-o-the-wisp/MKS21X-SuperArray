public class Driver{
  public static void main(String[] args) {
    SuperArray a = new SuperArray();
    a.add("hi");
    a.add("bye");
    System.out.println(a.toStringDebug());
    System.out.println(a.size());
  }
}
