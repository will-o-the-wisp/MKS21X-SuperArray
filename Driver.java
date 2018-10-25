public class Driver{
  public static void main(String[] args) {
    SuperArray a = new SuperArray();
    for(int i=0; i<15; i++){
     a.add("hi");
    }
    System.out.println(a.toStringDebug());
    System.out.println(a.contains("hey"));
    System.out.println(a.contains("hi"));
    a.set(1, "hey");
    System.out.println(a.toStringDebug());
    System.out.println(a.contains("hey"));
  }
}
