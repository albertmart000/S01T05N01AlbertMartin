package S01T05N01Ex04AlbertMartin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try {

            System.out.println("Introdueix la ruta del arxiu de text que vols llegir");

            Scanner pathTextFile = new Scanner(System.in);
            File file = new File(pathTextFile.nextLine());
            pathTextFile = new Scanner(file);

            while (pathTextFile.hasNextLine()){
                String line = pathTextFile.nextLine();
                System.out.println(line);
            }
            pathTextFile.close();

        } catch (Exception e){
            e.printStackTrace();
            }
    }
}
