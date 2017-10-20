import java.util.Scanner;

public class ToiletSeat {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String s = scan.nextLine();

    //Policy 1: When you leave, always leave the seat up
    //Policy 2: When you leave, always leave the seat down
    //Policy 3: When you leave, always leave the seat as you would like to find it
    //DD UU DU UD D U
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;


    for(int i = 1; i<s.length(); i++){
     if(i==1){
      if(s.charAt(i-1)=='D' && s.charAt(i)=='D'){
        count1++;
      }

      else if(s.charAt(i-1)=='U' && s.charAt(i)=='U'){
        count2+=1;
      }

      else if(s.charAt(i-1)=='D' && s.charAt(i)=='U'){
        count1++;
        count2+=2;
        count3++;
      }

      else if(s.charAt(i-1)=='U' && s.charAt(i)=='D'){
        count1+=2;
        count2++;
        count3++;
      }

      else if(s.charAt(i-1)=='D'){
        count1++;
      }

      else if(s.charAt(i-1)=='U'){
        count2++;
      }
    }

    else {
      if(s.charAt(i)=='D') count1 += 2;
      if(s.charAt(i)=='U') count2 += 2;
      if(s.charAt(i-1)!=s.charAt(i)) count3++;
    }
    }

    System.out.println(count1);
    System.out.println(count2);
    System.out.println(count3);
  }
}
