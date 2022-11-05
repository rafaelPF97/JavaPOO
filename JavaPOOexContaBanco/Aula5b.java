package aula04poo;

public class Aula5b {
    public static void main(String[] args) {
        ContaBanco5b c1 = new ContaBanco5b();
        c1.setNumConta(1111);
        c1.setDono("Jubileu");
        c1.abrirConta("CC");
        c1.depositar(300);
        
        ContaBanco5b c2 = new ContaBanco5b();
        c2.setNumConta(2222);
        c2.setDono("Creuza");
        c2.abrirConta("CP");
        c2.depositar(500);
        c2.sacar(100);
        c2.fecharConta();

        c1.mostrar();
        c2.mostrar();
    }
}
