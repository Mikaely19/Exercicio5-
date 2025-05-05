public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[12];
        int soma = 0;

        // Recebe os 12 números do usuário
        System.out.println("Digite 12 números:");
        for (int i = 0; i < 12; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        // Calcula a média
        double media = (double) soma / 12;
        System.out.println("A média dos valores é: " + media);

        // Conta quantos elementos são maiores que a média
        int countMaiorQueMedia = 0;
        for (int num : numeros) {
            if (num > media) {
                countMaiorQueMedia++;
            }
        }

        // Exibe o resultado
        System.out.println("Quantidade de elementos maiores que a média: " + countMaiorQueMedia);
        
        scanner.close();
    }
}
