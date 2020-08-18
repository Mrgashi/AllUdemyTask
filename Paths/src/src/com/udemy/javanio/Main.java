package src.com.udemy.javanio;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        try {

            Path pathForFile = FileSystems.getDefault().getPath("Examples/dir1", "file1.txt");
            long sizeOfFile = Files.size(pathForFile);
            System.out.println("Size = " + sizeOfFile);
            System.out.println("Last modified = " + Files.getLastModifiedTime(pathForFile));


            BasicFileAttributes attributesOfFile = Files.readAttributes(pathForFile, BasicFileAttributes.class);
            System.out.println("Size = " + attributesOfFile.size());
            System.out.println("Last modified = " + attributesOfFile.lastModifiedTime());

                /*
                Renaming a file
                 */
//            Path fileToCreate = FileSystems.getDefault().getPath("Examples", "file2.txt");
//            Files.createFile(fileToCreate);
                /*
                Making a directory
                 */
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples","dir4");
//            Files.createDirectory(dirToCreate);

                /*
                Making a dir tree.
                 */
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "dir2/dir3/dir4/dir5/dir6/dir7");
//            Files.createDirectories(dirToCreate);

                /*
                Deleting a file
                */
//            Path fileToDelete = FileSystems.getDefault().getPath("Examples", "dir1", "file1copy.txt");
//            Files.deleteIfExists(fileToDelete);

                /*
                Copy a file
                 */
//            Path sourceFile = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Path copyFile = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
//
                /*
                Moving a dir
                 */
//            sourceFile = FileSystems.getDefault().getPath("Examples", "dir1");
//            copyFile = FileSystems.getDefault().getPath("Examples", "dir4");
//            Files.move(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);

                /*
                Moving file to another dir.
                 */
//            Path fileToMove = FileSystems.getDefault().getPath("Examples/dir2", "file1copy.txt");
//            Path fileDestination = FileSystems.getDefault().getPath("Examples", "dir1", "file1copy.txt");
//            Files.move(fileToMove, fileDestination);

                /*
                Changing name of a file.
                 */
//            Path fileToMove = FileSystems.getDefault().getPath("Examples", "newnamedfile.txt");
//            Path fileDestination = FileSystems.getDefault().getPath("Examples", "file2.txt");
//            Files.move(fileToMove, fileDestination);

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
