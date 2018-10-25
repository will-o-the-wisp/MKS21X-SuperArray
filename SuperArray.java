public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(){
    data = new String[10];
    size = 0;
  }
  public void clear(){
    size = 0;
  }
  public int size(){
    return size;
  }
  public boolean isEmpty(){
    return size() == 0;
  }
  public boolean add(String s){
    data[size()] = s;
    size++;
    return true;
  }
  public String toString(){
    String ans = "[";
    for(int i=0;i<size();i++){
      ans += get(i);
      if(i<size()-1){
        ans += ", ";
      }
    }
    return ans + "]";
  }
  public String toStringDebug(){
    String ans = "[";
    for(int i=0;i<data.length;i++){
      ans += get(i);
      if(i<data.length-1){
        ans += ", ";
      }
    }
    return ans += "]";
  }
  public String get(int index){
    if (index < 0 || index >= size()){
      System.out.println("index out of range");
      return null;
    }
    else{
      return data[index];
    }
  }
  public String set(int index, String s){
    if (index < 0 || index >= size()){
      System.out.println("index out of range");
      return null;
    }
    else{
      String old = get(index);
      data[index] = s;
      return old;
    }
  }
  private void resize(){
    String[] ans = new String[data.length*2];
    for(int i=0;i<data.length;i++){
      ans[i] = data[i];
    }
    data = ans;
  }
}
