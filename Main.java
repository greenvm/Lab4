/*
Lab4 
Victoria Green
Date: 9/21/21
*/

import java.util.Random;

class Main {
  public static void main(String[] args) {
  Random r = new Random();

  int randomNum = r.nextInt(50) + 1; 
  System.out.println("The random number is: " + randomNum);
  
  int randNum = randomNum; 
  //needed in order to count down and print the correct words

  while (randNum >0){
    randNum--; 
    System.out.println(randNum);
  }
  if (randomNum <=5){
    System.out.println("Ahoy mateys!");
  }
  else if (randomNum >25 && randomNum <42){
    System.out.println("Cannonball!");
  }
  else {
    System.out.println("Blast Off!");
  }
}
}