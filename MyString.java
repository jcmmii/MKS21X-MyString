
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
    for (int a = 0; a < data.length; a++) {
      ret = ret + data[a];
    }
    return ret;
  }

  public int compareTo(CharSequence Seq) {
    if (Seq == null) throw new NullPointerException();
    if (this.length() == 0 && Seq.length() != 0) return -1;
    if (this.length() == 0 && Seq.length() == 0) return 0;
    if (this.length() != 0 && Seq.length() == 0) return 1;
    for (int x = 0; x < length(); x++) {
      if (this.charAt(x) != Seq.charAt(x)) {
        if (this.charAt(x) > Seq.charAt(x)) return 1;
        if (this.charAt(x) < Seq.charAt(x)) return -1;
      }
    }
    return 0;
  }

}




// write comments
