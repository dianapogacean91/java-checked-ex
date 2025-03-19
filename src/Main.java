import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //NIO - new Input Output
        //TODO - daca se preda manipularea fisierelor - daca da, ce se foloseste
        //1. java IO
        //2. java NIO - Files, Paths (File, Path)
        //3. BufferedReader/BufferedWritter

        //   on mac:  /Users/rb96ih/IdeaProjects/java-checked-ex
        // on windows:  C:/Users/Diana/....


        Scanner scanner = new Scanner(System.in);

        boolean fileReadSuccessfully = false;

        while (!fileReadSuccessfully) {
            System.out.println("Please enter file name: ");
            String filename = scanner.nextLine();



            try {
                System.out.println("BEGINNING OF TRY BLOCK");
                //exceptiile de tip checked vor aparea la compilare - compile time issues
                String content = readFile(filename);
                System.out.println("Content: " + content);
                fileReadSuccessfully = true;
            }
            catch (IOException e) {
                System.out.println("EXCETION OCCURED. catch block");
                System.out.println(e.getMessage());
            } catch(InvalidFilenameException e){
                System.out.println("Error code is: "+e.getErrorCode());
            }

            System.out.println("ENDING OF TRY BLOCK");
        }
    }

    // ..it THROWS an exception
    private static String readFile(String filename) throws IOException, InvalidFilenameException {

        if (!filename.contains("_") ){
            //I'm gonna THROW an exception
            throw new InvalidFilenameException(ErrorCodes.NO_UNDERSCORE);
        }

        if (!filename.endsWith(".txt")) {
            throw new InvalidFilenameException(ErrorCodes.INVALID_EXTENSION);
        }

        //TODO - next time - talk about strings

        Path path = Paths.get("./resourcesfolder/" + filename);
        String content = Files.readString(path);
        return content;
    }
}