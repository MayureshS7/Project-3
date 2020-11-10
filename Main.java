import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    //Scanner 
    Scanner scan = new Scanner(System.in);

    //Seat numbers
    int[] seatNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    String[] studNames = new String[15];
    //Array for the students names.

    //Print statement for the the 15 names

    System.out.println("\nEnter 15 student names\n");
    for (int a = 0; a < 15; a++)
    {
      String namesStud = scan.next();
      studNames[a] = namesStud;
    }

    int s = 0;
    //Print statement for the student's seating.
    while (s < 15) {
      System.out.println(studNames[s] + " gets seat #  " + seatNum[s]);
      s++;
    }

    System.out.println("\nHave a Great Day!");

  }
}