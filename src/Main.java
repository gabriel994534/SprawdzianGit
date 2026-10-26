public class Main {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz nazwę swojej klasy");
        String name = scanner.nextline();
        System.out.println("Podaj poziom klasy (np. 2, bo 2BT)");
        int level = Scanner.nextInt();
        System.out.println("Witaj " + name + ". Za " + (5 - level) + " lata bede pisal mature !");
    }
}
