import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    int x = inp.nextInt();
    //write your code below
    for(int i = x-1; i>-1; i--){
      System.out.print(i + " ");
    }
    
  }
}