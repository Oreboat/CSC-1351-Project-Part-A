import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog01_aOrderedList {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter input file name: ");
        Scanner fileReader = GetInputFile(in.nextLine());
        ArrayList<Car> cars = new ArrayList<Car>();
        while(fileReader.hasNextLine()) {
            String values[] = fileReader.nextLine().split(",");
            cars.add(new Car(values[1], Integer.parseInt(values[2]), Integer.parseInt(values[3])));
        }

        in.close();
        // public Scanner GetInputFile(UserPrompt) throws FileNotFoundExcpetion
    }

    public static Scanner GetInputFile(String UserPrompt) throws FileNotFoundException {
        File file = new File(UserPrompt);
        try {
            return new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out
                    .println("File specified <" + UserPrompt + "> does not exist. Would you like to continue? <Y/N>");
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            switch (input) {
                case "Y":
                    System.out.println("Enter input file name: ");
                    String newPromt = in.nextLine();
                    in.close();
                    return GetInputFile(newPromt);
                case "N":
                    in.close();
                    throw e;
            }
            in.close();
            return null;
        }
    }

}
