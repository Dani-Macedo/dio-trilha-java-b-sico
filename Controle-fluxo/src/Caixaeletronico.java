public class Caixaeletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if(valorSolicitado < saldo) 
                saldo = saldo - valorSolicitado;
        else
        
        System.out.println("saldo insuficiente");

        System.out.println(saldo);        
    }
}
