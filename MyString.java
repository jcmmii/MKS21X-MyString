public class MyString implements CharSequence, Comparable<CharSequence>{
  private char[] data;

  //constructor: takes in CharSequence, makes the data array the length of
  //             the sequence, and loops + adds each character to it
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int x = 0; x < s.length(); x++) {
      data[x] = s.charAt(x);
    }
  }

  //returns the character at the index of the array
  //exception thrown when index is invalid
  public char charAt(int index) {
      if (index < 0 || index >= data.length) throw new IndexOutOfBoundsException();
      return data[index];
  }

  //returns how long the array is
  public int length() {
    return data.length;
  }

  //returns a subsequence of chracters in format of a string
  //loops through array starting at start index, ending at end index adding to ret string
  //exception thrown when start or end values are invalid
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

  //overriding the compareTo method in Comparable
  //exception thrown when Seq is null
  public int compareTo(CharSequence Seq) {
    if (Seq == null) throw new NullPointerException();

    //determines which sequence is smaller in length
    //by default the first is smaller
    int lowLen = length();
    if (length() > Seq.length()) lowLen = Seq.length();

    //loops through and compares each character up to the length of the smaller sequence
    //if any chracters are unequal, then returns 1 or -1 for if first sequence's character is greater or not
    for (int x = 0; x < lowLen; x++) {
        if (this.charAt(x) > Seq.charAt(x)) return 1;
        if (this.charAt(x) < Seq.charAt(x)) return -1;
    }

    //after looping through sequences in which are characters are equal,
    //if sequences are unequal in length then returns 1 or -1 for if first sequence is greater or not
    if (this.length() > Seq.length()) return 1;
    if (this.length() < Seq.length()) return -1;

    //default return value: if all the characters and length are the same, returns 0
    return 0;
  }

  public static void main(String[] args) {
    MyString test = new MyString("LetsGetThisBread");
    System.out.println(test); //LetsGetThisBread
    System.out.println(test.charAt(1)); //e
    System.out.println(test.length()); //16
    System.out.println(test.subSequence(11,test.length())); //Bread
    MyString comp = new MyString("Z");
    System.out.println(comp.compareTo(test)); //1, since Z > L
    MyString empty = new MyString("");
    System.out.println(test.compareTo(empty)); //1, since something is greater than nothing
  }
}

//Drivers used: Ethan & Tejas
