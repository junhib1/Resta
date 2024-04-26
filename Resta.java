class Resta{
    int num1, num2; //Atributos
    Resta(){ //Método constructor
        System.out.println("SE ESTA CONSTRUYENDO LA RESTA");
    }

    public void MostrarResultado(){ //Método
        System.out.println("El resultado es " + (this.num1 - this.num2));
    }
        
}