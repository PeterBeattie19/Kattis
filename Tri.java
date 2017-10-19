import java.util.Scanner;

public class Tri {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int num3 = scan.nextInt();

    //Equals sign on the left
    if(num1==(num2+num3)) System.out.println(num1 +"="+ num2 +"+"+ num3);
    else if(num1==(num2*num3)) System.out.println(num1 +"="+ num2 +"*"+ num3);
    else if(num1==(num2/num3)) System.out.println(num1 +"="+ num2 +"/"+ num3);
    else if(num1==(num2-num3)) System.out.println(num1 +"="+ num2 +"-"+ num3);

    //Equals sign on the right
    else if((num1+num2)==num3) System.out.println(num1 +"+"+ num2 +"="+ num3);
    else if((num1*num2)==num3) System.out.println(num1 +"*"+ num2 +"="+ num3);
    else if((num1/num2)==num3) System.out.println(num1 +"/"+ num2 +"="+ num3);
    else if((num1-num2)==num3) System.out.println(num1 +"-"+ num2 +"="+ num3);


  }
}
