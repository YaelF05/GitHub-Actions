package mate;

public class Operacion {

    public int num1;
    public int num2;

    public Operacion(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int suma(){
        return num1 + num2;
    }

    public int resta(){
        return num1 - num2;
    }

    public int multiplicacion(){
        return num1 * num2;
    }

    public int division(){
        return num1 / num2;
    }
}
