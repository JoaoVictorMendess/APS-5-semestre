import java.io.*;
import java.net.*;

public class Servidor {
    public static void main(String[] args) {
        try {
            int porta = 10001;
            ServerSocket servidor = new ServerSocket(porta);
            System.out.println("Servidor ouvindo na porta " + porta);
            Socket cliente = servidor.accept();
            System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());
            OutputStream saida = cliente.getOutputStream();
            PrintWriter escritor = new PrintWriter(saida, true);
            escritor.println("Olá, cliente!");
            servidor.close();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}