import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TESTIO {

    public static void main(String[] args) {
        String directory = "data";
        Path folder = Paths.get(directory);
        Path file = Paths.get(directory, "newFile.txt");

        if(Files.notExists(folder)){
            try {
                Files.createDirectories(folder);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
//        List<String> students = Arrays.asList("Ricky", "Josh", "Sam", "Nadia", "John");
//
////        try {
//////            Files.write(file, students);
//////        } catch (IOException e) {
//////            e.printStackTrace();
//////        }
        List<String> updatedStudents = new ArrayList<>();

        try {
            List<String> studentsFromFile = Files.readAllLines(file);
            for (String student : studentsFromFile) {
                System.out.println(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    try {
        Files.write(file, Arrays.asList("Nathanial"), StandardOpenOption.APPEND);
    } catch (IOException e){
        e.printStackTrace();
    }


    }
}
