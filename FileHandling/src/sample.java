import java.io.*;

public class sample {
    public static void main() throws IOException {
        FileReader fr = new FileReader("demo.txt");
        BufferedReader br = new BufferedReader(fr);

        String line;
        while((line=br.readLine()) != null){
            System.out.println(line);
        }

        br.close();
        fr.close();
    }
}
