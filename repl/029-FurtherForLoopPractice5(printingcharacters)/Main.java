import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String s = inp.nextLine();
    //write your code below
    for(int i = 1; i<s.length()+1; i++){
      System.out.print(s.substring(i-1,i)+" ");
    }
    
  }
}