package udemy.directories;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Objects;

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

        System.out.println("---Copy di2 to dir4/dir2copy---");

        Path copyPath = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir4" + File.separator + "Dir2Copy");
        // FileTree/Dir4/Dir2Copy

        try {
            Files.walkFileTree(dir2Path, new CopyFiles(dir2Path, copyPath));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        File file = new File("/Examples/file.txt");
        Path converterPath = file.toPath();
        System.out.println("Converted path = " +   converterPath);

        File partent = new File("/Examples");
        File resolvedPath = new File(partent, "dir/file.txt");
        System.out.println(resolvedPath.toPath());

        resolvedPath = new File(File.separator + "Examples", "dir" + File.separator + "file.txt");
        System.out.println(resolvedPath.toPath());

        File workingDir = new File("").getAbsoluteFile();
        System.out.println("workingDir = " + workingDir.getAbsolutePath());

        System.out.println("************* Dir1 contents using list************");

        File dir2file =  new File(workingDir, "/FileTree/Dir2");
        String[] dir2Contents = dir2file.list();
        for (String dir2Content : dir2Contents) {
            System.out.println(dir2Content);
        }

        System.out.println("Print dir2 context using list files");
        File[] files = dir2file.listFiles();
        for (int i = 0; i < Objects.requireNonNull(files).length; i++) {
            System.out.println("Files = " + files[i].getName());
        }
    }
}
