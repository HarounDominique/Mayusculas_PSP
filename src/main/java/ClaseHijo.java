import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClaseHijo {
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        String mayus;

        try{
            String line = null;
            while((line = br.readLine())!=null){
                System.out.println(mayus = br.readLine().toUpperCase());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
