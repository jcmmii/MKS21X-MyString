public class MyString implements CharSequence, Comparable<CharSequence>{
  private char[] data;

  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int x = 0; x < s.length(); x++) {
      data[x] = s.charAt(x);
    }
  }

  public char charAt(int index) {
      if (index < 0 || index >= data.length) throw new IndexOutOfBoundsException();
      return data[index];
  }

  public int length() {
    return data.length;
  }

  public CharSequence subSequence(int start, int end) {
    if (start < 0 || end < 0 || start > end || end > data.length) throw new IndexOutOfBoundsException();
    String ret = "";
    for (int x = start; x < end; x++) {
      ret = ret + data[x];
    }
    return ret;
  }



  public String toString() {
    String ret = "";
    for (int a = 0; a < this.length(); a++) {
      ret = ret + data[a];
    }
    return ret;

  }

}



// CharSequence returns anything that implements CharSequence
// including a String



// write comments
