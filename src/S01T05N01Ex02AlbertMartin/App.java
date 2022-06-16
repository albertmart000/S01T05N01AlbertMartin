package S01T05N01Ex01AlbertMartin;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        final String DIRECTORY_NAME = "/home/albert/Escritorio/Biblioteca de Contenidos";
        //añadir excepcion
        File folder = new File(DIRECTORY_NAME);
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
                    System.out.printf("(%s) %s - %s%n",
                            file.isDirectory() ? "Directori" : "Fitxer",
                            file.getName(),
                            simpleDateFormat.format(file.lastModified()));

                    if (file.isDirectory()) {
                        showFolder(file);
                        }
                    }
                }
        }
    }
}
