import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<String> arrayList = new ArrayList<>();
		FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);
    int numChecker = 1;
    Scanner keyboard = new Scanner(System.in);
    
    
    while(fileScanner.hasNextLine()){
      String currentWord = fileScanner.nextLine();
      arrayList.add(currentWord);
    }
  
    
    while(numChecker != 5){
    System.out.println("Press 1 to learn about salary");
    System.out.println("Press 2 to learn about the job");
    System.out.println("Press 3 to learn about demand");
    System.out.println("Press 4 to learn about view current students");
    System.out.println("Press 5 to quit");  
      numChecker = keyboard.nextInt();

      if(numChecker == 1){
        System.out.println("$98,345 average salary in South Florida!");
      }
      if(numChecker == 2){
        System.out.println("US News - 100 Best Jobs!");
      }
      if(numChecker == 3){
        System.out.println("Top 10 Forbes In-Demand Jobs!");
      }
      if(numChecker == 4){
        for (String str : arrayList){
          System.out.println(str);
        }
      }
        if(numChecker == 5){
          break;
        }
      
    }
    
	}
}