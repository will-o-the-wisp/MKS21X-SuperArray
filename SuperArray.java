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
    if(size()+1>data.length){
      resize();
    }
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
  public boolean contains(String target){
    for(int i=0;i<size();i++){
      if(get(i).equals(target)){
        return true;
      }
    }
    return false;
  }
  public int indexOf(String element){
    for(int i=0;i<size();i++){
      if(get(i).equals(element)){
        return i;
      }
    }
    return -1;
  }
  public int lastIndexOf(String element){
    for(int i=size()-1;i>0;i--){
      if(get(i).equals(element)){
        return i;
      }
    }
    return -1;
  }
  public void add(int index, String element){
    if(index < 0 || index >= size()){
      System.out.println("index out of bounds");
    }
    if(size()+1>data.length){
      resize();
    }
    size++;
    for(int i = index;i<size();i++){
      set(i+1,get(i));
    }
    set(i,element);
  }
  public String remove(int index){
    if(index < 0 || index >= size()){
      System.out.println("index out of bounds");
      return null;
    }
    for(int i = index;i<size();i++){
      set(i,get(i+1));
    }
    size--;
  }
  public boolean remove(String target){
    int index = indexOf(target);
    if(index != -1){
      remove(index);
      }
    }
    return false;
  }
}
