package aula04poo;

public class ContaBanco5b {
    //Atributos:
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //Método construtor:
    public ContaBanco5b(){
        saldo = 0;
        status = false;
    }
    
    //Métodos Get e Set de todos os atributos:
    public int getNumConta() {
        return this.numConta;
    }
    public void setNumConta(int numCont) {
        this.numConta = numCont;
    }


    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }


    public String getDono() {
        return this.dono;
    }
    public void setDono(String d) {
        this.dono = d;
    }


    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
    this.status = status;
    }

    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float s) {
        this.saldo = s;
    }
    
    public void mostrar(){ //Método criado para mostrar o estado atual da 'conta'
        System.out.println("----------------------------");
        System.out.println("Número da conta: "+this.getNumConta());
        System.out.println("Tipo da conta: [CC] ou [CP] "+this.getTipo());
        System.out.println("Nome do dono da conta: "+this.getDono());
        System.out.println("Saldo da conta: R$"+this.getSaldo());
        System.out.println("A conta está ativa? "+this.getStatus());
    }

    public void abrirConta(String t){ //Método para abrir uma 'conta'
        this.setTipo(t);
        this.setStatus(true);
        
        if (t == "CC"){ // CC = Conta corrente
            this.setSaldo(50);}//CC ganha 50 de saldo inicial
        else{   
            if (t == "CP"){// CP = Conta poupança
            this.setSaldo(150);}//CP ganhar 150 de saldo inicial
            }
    }

    public void fecharConta(){ //Método para fechar uma 'conta'
        if (this.status == false){
            System.out.println("A conta ja está fechada.");
        }
        if (saldo >= 1){
            System.out.println("Tire todo o dinheiro para fechar a conta Sr(a) "+this.getDono());
        }
        else if(saldo < 0){
            System.out.println("Pague a fatura para fechar a conta Sr(a) "+this.getDono());
        }
        else{
            this.setStatus(false);
            System.out.println("Conta fechada.");
        }
            
    }

    public void depositar(float v){//Método para depositar em uma conta ja aberta
        if (this.status == true){
            //this.saldo+=v;
            this.setSaldo(this.getSaldo()+v);
        }
        else{
            System.out.println("Abra uma conta primeiro.");
        }
    }

    public void sacar(float v){//Método para sacar de uma conta ja aberta
        if (this.status == true){
            if(this.getSaldo()>=v){
                //this.saldo-=v;
                this.setSaldo(this.getSaldo()-v);
            }else{System.out.println("Não possui saldo suficiente.");}
        }else{System.out.println("Abra uma conta primeiro");}
        
        }
    

    public void pegarMensal(){//Método para pagar uma 'mensalidade bancaria'
        int v = 0;
        if (this.tipo == "CC"){
            v = 12;
        }else if (this.tipo == "CP"){
            v = 20;
        }
    
        if (this.status == true){
            //this.saldo-=v;
            this.setSaldo(this.getSaldo()-v);
            System.out.println("Mensalidade paga.");
        }
    }
}