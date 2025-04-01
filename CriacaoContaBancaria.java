import java.util.Scanner;

public class CriacaoContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo!");
        System.out.println("Siga os passos abaixo para criar sua conta:");

        // Passo 1: Solicitar nome completo
        System.out.println("\nPasso 1: Informe seu nome completo:");
        String nomeCompleto = scanner.nextLine();

        // Passo 2: Solicitar CPF
        System.out.println("\nPasso 2: Informe seu CPF (somente números):");
        String cpf = scanner.nextLine();

        // Passo 3: Solicitar data de nascimento
        System.out.println("\nPasso 3: Informe sua data de nascimento (dd/mm/aaaa):");
        String dataNascimento = scanner.nextLine();

        // Passo 4: Solicitar endereço
        System.out.println("\nPasso 4: Informe seu endereço completo:");
        String endereco = scanner.nextLine();

        // Passo 5: Escolher tipo de conta
        System.out.println("\nPasso 5: Escolha o tipo de conta:");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Poupança");
        int tipoConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        String tipoContaEscolhida = (tipoConta == 1) ? "Conta Corrente" : "Conta Poupança";

        // Passo 6: Confirmar criação da conta
        System.out.println("\nPasso 6: Confirme os dados fornecidos:");
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Endereço: " + endereco);
        System.out.println("Tipo de Conta: " + tipoContaEscolhida);

        System.out.println("\nDeseja confirmar a criação da conta? (sim/não)");
        String confirmacao = scanner.nextLine();

        if (confirmacao.equalsIgnoreCase("sim")) {
            System.out.println("\nConta criada com sucesso! Obrigado por utilizar nosso sistema.");
        } else {
            System.out.println("\nCriação de conta cancelada. Caso precise, reinicie o processo.");
        }

        scanner.close();
    }
}
