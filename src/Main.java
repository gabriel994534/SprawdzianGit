public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Wpisz nazwe swojej klasy");
    String name = scanner.nextLine();
    System.out.println("Podaj poziom klasy (np. 2, bo 2BT)");
    int age = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Witaj " + name + ". Za " + (5 - level) + "bede pisal mature ! ");

    System.out.println("Co chcesz robić po zakończeniu szkoły średniej");
    String plan = scanner.nextLine();
    System.out.println(plan);
}
