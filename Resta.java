class Resta{// Clase que define operaciones de resta entre dos números
    int num1, num2;
    // Constructor que muestra un mensaje al iniciar
    Resta(){
        System.out.println("SE ESTA CONSTRUYENDO LA RESTA");
    }
    // Método para mostrar el resultado de la resta
    public void MostrarResultado(){
        System.out.println("El resultado es " + (this.num1 - this.num2));
    }
    // Métodos getter y setter para num1
    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    // Métodos getter y setter para num2
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    // Método para obtener una representación en cadena de la clase
    @Override
    public String toString() {
        return "Resta [num1=" + num1 + ", num2=" + num2 + "]";
    }
}