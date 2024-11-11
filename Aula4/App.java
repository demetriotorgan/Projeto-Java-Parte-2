import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Inicializar os dados do cliente
        String nome = "Clarck Kent";
        String tipoConta = "Corrente";
        double saldo = 1500;
        int opcao = 0;

        System.out.println("*********************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("\n*********************************");

        //Menu do CLiente        
        String menu = """
        ** Digite sua opção: **
        1 - Consultar Saldo
        2 - Transferir Valor
        3 - Receber Valor
        4 - Sair
                """;
                
        Scanner leitura = new Scanner(System.in);
        while(opcao !=4 ){
            System.out.println(menu);
            opcao = leitura.nextInt();
                if(opcao == 1){
                    System.out.println("O saldo é: " + saldo);
                } else if(opcao == 2){
                    System.out.println("Qual valor que deseja transferir?");
                    double valor = leitura.nextDouble();
                        if(valor > saldo){
                            System.out.println("Saldo insuficiente");
                        } else{
                            saldo -= valor;
                            System.out.println("Novo Saldo: " + saldo);
                        }
                } else if(opcao == 3){
                    System.out.println("Valor Recebido: ");
                    double valor = leitura.nextDouble();
                    saldo += valor;
                    System.out.println("Novo Saldo: " + saldo);
                } else if(opcao !=4){
                    System.out.println("Opção Inválida");
                }
        }
        leitura.close();
    }
}
