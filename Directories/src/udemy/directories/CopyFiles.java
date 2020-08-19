package udemy.directories;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;




public class CopyFiles extends SimpleFileVisitor<Path> {

    private Path sourceRoot;
    private Path targetRoot;

    public CopyFiles(Path sourceRoot, Path targetRoot) {
        this.sourceRoot = sourceRoot;
        this.targetRoot = targetRoot;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) {
        System.out.println("Error accessing file " + file.toAbsolutePath() + " " +exc.getMessage());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {

        return getFileVisitResult(dir);
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {

        return getFileVisitResult(file);
    }

    private FileVisitResult getFileVisitResult(Path file) {
        Path relativized = sourceRoot.relativize(file);
        System.out.println("Relativized: " + relativized);
        Path copyDir = targetRoot.resolve(relativized);
        System.out.println("Resolved path: " + copyDir);

        try {
            Files.copy(file, copyDir);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return FileVisitResult.SKIP_SUBTREE;
        }
        return FileVisitResult.CONTINUE;
    }
}

