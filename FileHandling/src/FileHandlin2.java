import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileHandlin2 {
    static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("Test.txt"))) {
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
