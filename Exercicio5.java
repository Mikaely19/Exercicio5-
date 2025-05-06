public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[12];
        int soma = 0;

        System.out.println("Digite osnúmeros:");
        for (int i = 0; i < 12; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        double media = (double) soma / int;
        System.out.println("A média dos valores é: " + media);
        
        int countMaiorQueMedia = 0;
        for (int num : numeros) {
            if (num > media) {
                countMaiorQueMedia++;
            }
        }
        System.out.println("Quantidade de elementos maiores que a média: " + countMaiorQueMedia);
        
        scanner.close();
    }
}
