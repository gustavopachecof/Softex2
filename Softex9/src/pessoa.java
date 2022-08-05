public class pessoa {
    String nome;
    int idade;

    void mostrardados() {
        System.out.printf("%s tem %d anos de idade. \n", this.nome, this.idade);
    }

    pessoa() {
        this.nome = "Nome";
        this.idade = 0;
    }

}
