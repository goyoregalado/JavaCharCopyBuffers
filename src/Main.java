import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    FileReader archivoLectura = new FileReader(args[0]);
        FileWriter archivoEscritura = new FileWriter(args[1]);

        BufferedReader lectorConBuffer = new BufferedReader(archivoLectura);
        BufferedWriter escritorConBuffer = new BufferedWriter(archivoEscritura);

        int c = lectorConBuffer.read();

        while (c != -1) {
            escritorConBuffer.write(c);
            c = lectorConBuffer.read();
        }

        lectorConBuffer.close();
        escritorConBuffer.close();

        archivoEscritura.close();
        archivoLectura.close();
    }
}
