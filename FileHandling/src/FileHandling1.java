import java.io.*;

public class FileHandling1 {
    public static void main(String[] args){
        try(FileWriter fw = new FileWriter("C:\\Users\\NITHIN SAI\\Desktop\\Test.txt")){
            fw.write("""
                    Roses are red,
                    Violets are purple,
                    You are a Loser,
                    Be Consistent to be a motivator
                    """);
            System.out.println("Succesfully wrote to the file");
        }catch (FileNotFoundException e) {
            System.out.print("Error : " + e.getMessage());
        }catch(IOException e){
            System.out.println("Some error while creating");
        }
    }
}
