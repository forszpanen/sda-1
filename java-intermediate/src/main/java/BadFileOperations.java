import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BadFileOperations {

    private BufferedReader bufferedReader;

    private String path;

    public BadFileOperations(String path) {
        this.path = path;


    }


    public String readFile() {
        StringBuilder result = new StringBuilder();
        String line = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));

            while ((line = bufferedReader.readLine()) != null) {
                result.append(line);
            }


        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return result.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }

    }
}
