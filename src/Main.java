import mate.Operacion;

void main() {

    int num1 = 10;
    int num2 = 5;

    Operacion op1 = new Operacion(num1, num2);

    System.out.println(op1.suma());
    System.out.println(op1.resta());
    System.out.println(op1.multiplicacion());
    System.out.println(op1.division());
}
