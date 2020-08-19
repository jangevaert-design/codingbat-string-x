public class stringX {
  public String stringX(String str) {
    String substr = "";
    for (int i = 0; i < str.length(); i++) {
      char temp = str.charAt(i);
      if (!(i >0 && i < str.length() -1 && temp == 'x'))
        substr += temp;
    }

    return substr;
  }
}
