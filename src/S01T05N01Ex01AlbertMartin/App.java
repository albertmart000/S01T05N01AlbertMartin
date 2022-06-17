package S01T05N01Ex01AlbertMartin;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //Demanem la ruta del directori i creem l'arxiu per poder extreure la llista d'arxius del directori
        String directoryPath = getDirectoryPath();
        File folder = new File(directoryPath);

        //Mostrem la llista d'arxius a la consola
        showFileList(folder);
    }

    private static void showFileList(File folder) {
        if (!(folder.exists() && folder.isDirectory())){
        System.out.println("Aquest directori no existeix o es un arxiu.");
        }

        else {
            String[] filesList = folder.list();
            Arrays.sort(filesList, String.CASE_INSENSITIVE_ORDER);
            if (filesList.length == 0){
                System.out.println("No n'hi ha elements per mostrar dintre del Directori");
                }
                else {
                    for (String s : filesList) {
                    System.out.println(s);
                }
            }
        }
    }

    private static String getDirectoryPath() {
        System.out.println("Escriu la ruta del directori que vols llistar");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}