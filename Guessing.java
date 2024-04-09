public class Main 
{
  
  public static void main(String[] args) {
    Guessing.display();
    Guessing one = new Guessing(1);
    System.out.println("You guessed the number " + one.getPickNum()+ " and the number was " + one.getGuessNum());
    one.Guess();
  }
}
  public class Guessing
  {
    private int pickNum;
    private int guessNum = (int)(Math.random() * 10 + 1);
    public Guessing(int pickNum)
    {
      this.pickNum = pickNum;
    }
    public int getPickNum()
    {
      return pickNum;
    }
    public int getGuessNum()
    {
      return guessNum;
    }
    public void Guess()
    {
      if(pickNum == guessNum)
      {
        System.out.println("You got it!");
      }
      else
      {
        System.out.println("Sorry, that's not it.");
      }
    }
    public static void display()
    {
      System.out.println("Guessing Game");
      System.out.println("=============");
      System.out.println("I'm thinking of a number from 1 and 10.");
      System.out.println("Try to guess it.");
    }
    
  
  }
