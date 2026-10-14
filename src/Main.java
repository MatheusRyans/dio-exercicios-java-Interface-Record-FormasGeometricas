//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

private static Scanner sc = new Scanner(System.in);

void main() {


    var option = -1;


    do{
        System.out.println("Escolha uma forma geométrica: ");
        System.out.println("1- Quadrado");
        System.out.println("2- Circulo ");
        System.out.println("3- Retangulo ");
        System.out.println("4- Sair");

        option = sc.nextInt();

        GeometricForm geometricForm = null;

        switch (option){
            case 1 -> geometricForm = createSquare();

            case 2 -> geometricForm = createCircle();

            case 3 -> geometricForm = createRectangle();

            default -> System.out.println("Digite uma opção válida!");
        }

        if (geometricForm != null && option != 4) {
            System.out.println("O cálculo da área foi: " + geometricForm.getArea());
        }

    }while(option != 4);

}


private static GeometricForm createSquare(){
    System.out.println("Digite o tamanho dos lados: ");
    var side = sc.nextDouble();
    return new Square(side);
}

private static GeometricForm createRectangle(){
    System.out.println("Digite o tamanho da altura: ");
    var height = sc.nextDouble();
    System.out.println("Digite o tamanho da base: ");
    var base = sc.nextDouble();
    return new Rectangle(height,base);
}

private static GeometricForm createCircle(){
    System.out.println("Digite o tamanho do raio: ");
    var radius = sc.nextDouble();
    return new Square(radius);
}


