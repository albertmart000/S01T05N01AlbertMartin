package S01T05N01Ex03AlbertMartin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class prueba {

    public static void main(String[] args) throws IOException {

        String directoryPath = getDirectoryPath();
        FileWriter fileWriter = new FileWriter("directoryList.txt");
        try {
            addDataFiles(directoryPath, fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
            }
        fileWriter.close();
        System.out.println("El arxiu s'he creat correctament");
    }

    public static File[] listSortedDirectoryFiles(String namePath) {
        File file = new File(namePath);
        File[] files = file.listFiles();
        Arrays.sort(files);
        return files;
    }

    public static void addDataFiles(String directoryPath, FileWriter fileWriter) throws IOException {
        File[] files = listSortedDirectoryFiles(directoryPath);
        if (files != null && files.length > 0){
            for (File file : files) {
                if(!file.isDirectory()) {
                    fileWriter.write(("(- Fitxer)" + " " + file.getName() + " " +
                            new SimpleDateFormat("dd/MM/yyyy").format(file.lastModified())) + "\n");

                } else {
                    fileWriter.write(("(Directori:)" + " " + file.getName() + " " +
                            new SimpleDateFormat("dd/MM/yyyy").format(file.lastModified())) + "\n");
                    addDataFiles(file.getAbsolutePath(), fileWriter);
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
