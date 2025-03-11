import java.io.*;
import java.net.*;
public class Cliente {
    public static void main(String[] args) {
        String host = "localhost";
        int porta = 10001;
        try{
            Socket cliente = new Socket(host, porta);
            InputStream entrada = cliente.getInputStream();
            BufferedReader leitor = new BufferedReader(new InputStreamReader(entrada));
            String mensagem = leitor.readLine();
            System.out.println("Mensagem do servidor: " + mensagem);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
