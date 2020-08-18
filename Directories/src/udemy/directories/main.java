package udemy.directories;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class main {
    public static void main(String[] args) {


        DirectoryStream.Filter<Path> filter = Files::isRegularFile;

        Path directory = FileSystems.getDefault().getPath("FileTree" + File.separator + "dir2");
        try (DirectoryStream<Path> contentsOfDirecotry = Files.newDirectoryStream(directory, filter)) {
            for (Path file : contentsOfDirecotry) {
                System.out.println(file.getFileName());
            }
        } catch (IOException | DirectoryIteratorException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        String separetor = File.separator;
        System.out.println(separetor);
        separetor = FileSystems.getDefault().getSeparator();
        System.out.println(separetor);


        try {

            Path tempFile = Files.createTempFile("myApp", ".appext");
            System.out.println("Temporary file path = " + tempFile.toAbsolutePath());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();
        for (FileStore store : stores) {
            System.out.println(store.name());
            System.out.println(store);
        }

        System.out.println("Walking tree for Dir2");
        Path dir2Path = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir2");
        try {
            Files.walkFileTree(dir2Path, new Printnames());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
