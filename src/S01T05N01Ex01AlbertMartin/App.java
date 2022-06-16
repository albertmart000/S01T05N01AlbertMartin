package Ex0102;

import java.io.File;
import java.util.Arrays;

public class App {
    public static void main(String[] args){

        final String DIRECTORY_NAME = "/home/albert";

        File folder = new File(DIRECTORY_NAME);
        String[] filesList = folder.list();
        Arrays.sort(filesList, String.CASE_INSENSITIVE_ORDER);
        if (filesList == null || filesList.length == 0){
            System.out.println("No n'hi ha elements per mostrar dintre del Directori");
         }
        else {
            for (String s : filesList) {
                System.out.println(s);
            }
        }
    }

}
