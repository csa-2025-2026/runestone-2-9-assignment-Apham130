import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word: ");
    String str = sc.nextLine();

    String mode = "";
    int numV = Integer.MIN_VALUE;
    for (int i = 0; i < str.length(); i++)
    {
      String target = str.substring(i, i+1);
      int num = 0;
      for (int j = 0; j < str.length(); j++)
      {
        String currentLetter = str.substring(j, j+1);
        if (currentLetter.equals(target))
        {
          num++;
        }
      }
      if (num > numV) {
        mode = target;
        numV = num;
      }
    }
    System.out.println("The letter " + mode + " appears the most times.");



    sc.close();
  }
}
