package javanewio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class Program {
    public static void main(String[] args) throws IOException {

        Files.copy(Paths.get("skad"), Paths.get("dokad"), StandardCopyOption.ATOMIC_MOVE);

    }
}
