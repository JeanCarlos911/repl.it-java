import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  	Scanner inp = new Scanner(System.in);
  	System.out.print("In:");
  	String word = inp.nextLine();
  	//DO NOT CHANGE ABOVE CODE!  Write your code below
  	if(word.substring(word.length()-2, word.length()).equals("ey")){
  	  System.out.println("-eys");
  	}else if(word.substring(word.length()-1, word.length()).equals("y")){
  	  System.out.println("-ies");
  	}else if(word.substring(word.length()-3, word.length()).equals("ife")){
  	  System.out.println("-ives");
  	}else{
  	  System.out.println("-s");
  	}
  	
  }
}