 
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
 
public class Program {
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> jokes = new ArrayList<>();
        System.out.println("What a joke!");
        UserInterface userInterface = new UserInterface(new JokeManager(), scanner);
        userInterface.start();
    }
}
 