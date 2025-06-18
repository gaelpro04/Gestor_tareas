import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilesLW {

    public Tasks getAllData() {
        Tasks myTasks = null;

        try {
            FileReader fileReader = new FileReader("data.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while (line != null) {

            }


        } catch (IOException e) {
            System.out.println("NOT FOUND");
        }


        return myTasks;
    }

    public void writeAllData() {

    }
}
