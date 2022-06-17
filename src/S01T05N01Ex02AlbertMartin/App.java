package S01T05N01Ex02AlbertMartin;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        //Demanem la ruta del directori i creem l'arxiu per poder extreure la llista d'arxius del directori
        String directoryPath = getDirectoryPath();
        File folder = new File(directoryPath);

        //Mostrem la llista d'arxius del directori i de tots els seus subdirectoris en ordre alfabètic.
        showFolder(folder);
    }

    private static void showFolder(File folder) {

        if (folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files == null || files.length == 0) {
                System.out.println("No n'hi ha elements per mostrar dintre del Directori");
            } else {
                Arrays.sort(files);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                for (File file : files) {
                    System.out.printf("%s %s  %s%n",
                            file.isDirectory() ? "Directori:" : "- Fitxer",
                            file.getName(),
                            simpleDateFormat.format(file.lastModified()));

                    //Tornem a cridar el mètode showFolder per llistar els arxius dels subdirectoris recursivament.
                   if (file.isDirectory()) {
                        showFolder(file);
                        }
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
