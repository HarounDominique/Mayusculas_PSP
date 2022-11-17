import java.io.*;

public class ClasePadre {
    public static void main(String[] args) {

        try {
            File directorio = new File("D:\\IntelliJ_Projects\\Mayusculas\\target\\classes");
            ProcessBuilder pb = new ProcessBuilder("java", "ClaseHijo");
            pb.directory(directorio);
            Process proceso = pb.start();

            BufferedReader br = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            PrintStream ps = new PrintStream(proceso.getOutputStream());

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            String linea;

            while((linea = in.readLine()).compareTo("")!=0){

                //System.out.println(linea);
                ps.println(linea);
                ps.flush();

                System.out.println(br.readLine());
            }
            System.out.println("Finalizado.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
