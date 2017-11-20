import java.util.*;
import java.io.*;

public class PigLatin {



  public static void main(String[] args) throws IOException {

    // Use a StringBuilder since we have lots of output
    StringBuilder sb = new StringBuilder();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // Process each line of input
    String line;
    while ((line = br.readLine()) != null) {

      // Convert each word on the line to pig latin
      String[] split = line.split(" ");
      for (int i = 0; i < split.length; i++) {
        sb.append(toPigLatin(split[i]));
        if (i != split.length - 1)
          sb.append(" ");
      }

      sb.append("\n");

    }

    // Output all of the pig latin
    System.out.print(sb);

  }

  public static String toPigLatin(String str) {
    if (isVowel(str.charAt(0)))
      return str + "yay";
    else {
      int pos = firstVowel(str);
      return str.substring(pos) + str.substring(0, pos) + "ay";
    }
  }

  public static int firstVowel(String str) {
    for (int i = 0; true; i++)
      if (isVowel(str.charAt(i)))
        return i;
  }

  public static boolean isVowel(char ch) {
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y';
  }

}