package src.com.udemy.javanio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        try {
            Path sourceFile = FileSystems.getDefault().getPath("Examples", "file1.txt");
            Path copyFile = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
            Files.copy(sourceFile, copyFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
 //       Path workDirFile = FileSystems.getDefault().getPath("workingDirFile.txt");
 //       printFile(workDirFile);

 //       Path subdirFile = FileSystems.getDefault().getPath("Files", "subDirFile.txt");
 //       printFile(subdirFile);

 //       subdirFile = Paths.get("/users/macnchees/Documents/JavaMasterCourse/OutThere.txt");
 //       printFile(subdirFile);
 //   }

 //   private static void printFile(Path fileInPath) {

 //       try(BufferedReader fileReader = Files.newBufferedReader(fileInPath)){
 //            String line;
 //            while ((line = fileReader.readLine()) != null) {
 //                System.out.println(line);
 //            }
 //       } catch (IOException e) {
 //           System.out.println(e.getMessage());
 //           e.printStackTrace();
 //       }
 //   }
}
