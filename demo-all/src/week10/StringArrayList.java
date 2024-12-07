package week10;

public class StringArrayList {
    private String[] strings;
  
    public StringArrayList() {
      this.strings = new String[0]; // length
    }
  
    public void add(String string) {
      String[] newArray = new String[this.strings.length + 1];
      for (int i = 0; i < this.strings.length; i++) {
        newArray[i] = this.strings[i];
      }
      newArray[newArray.length - 1] = string;
      this.strings = newArray; // replace the whole array object
    }
  
    public void remove(String string) {
      boolean hasRemoveItem = false;
      for (int i = 0; i < this.strings.length; i++) {
        if (this.strings[i].equals(string)) {
          hasRemoveItem = true;
          break;
        }
      }
      // Early return
      if (!hasRemoveItem)
        return;
      String[] newArray = new String[this.strings.length - 1];  // 0 - 6
      int skipCount = 0;
      int idx = 0;
      for (int i = 0; i < this.strings.length; i++) { // 0 - 7
        if (this.strings[i].equals(string) && skipCount == 0) {
          skipCount++;
          continue;
        }
        newArray[idx++] = this.strings[i];
      }
      this.strings = newArray; // !
    }
  
    public int size() {
      return this.strings.length;
    }
  
    // toString()
  
    public static void main(String[] args) {
      StringArrayList arr = new StringArrayList();
      arr.add("hello");
      arr.add("abc");
      System.out.println(arr.size()); // 2
  
      arr.add("hello");
      System.out.println(arr.size()); // 3
      arr.remove("hello");
      System.out.println(arr.size()); // 2
  
      arr.remove("vincent");
      System.out.println(arr.size()); // 2
    }
  }
