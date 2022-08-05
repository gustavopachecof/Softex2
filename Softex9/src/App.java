import java.io.IOException;

public class App {

    public static void limpartela() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static void main(String[] args) throws Exception {
        limpartela();

        pessoa p1 = new pessoa();
        pessoa p2 = new pessoa();
        pessoa p3 = new pessoa();

        p1.nome = "fulano";
        p1.idade = 19;
        p2.nome = "Gustavo";
        p2.idade = 29;

        p1.mostrardados();
        p2.mostrardados();
        p3.mostrardados();
    }
}