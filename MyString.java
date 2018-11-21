public class MyString implements CharSequence, Comparable<CharSequence>{
  private char[] data;

  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int x = 0; x < s.length(); x++) {
      data[x] = s.charAt(x);
    }
  }

  public char charAt(int index) {
      return data[index];
  }

  public int length() {


  }

  public CharSequence subSequence(int start, int end) {

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
