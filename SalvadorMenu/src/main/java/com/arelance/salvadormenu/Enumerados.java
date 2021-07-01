package com.arelance.salvadormenu;

//Uso de un constructor, una variable de instancia y un método.
enum Transporte{
    COCHE(60), CAMION(50), AVION(600), TREN(70), BARCO(20);
    private int velocidad; //velocidad típica de cada transporte

    //Añadir un onstructor
    Transporte(int s){velocidad=s;}
    //Añadir un método
    int getVelocidad(){return velocidad;}
}

class Enumerados {
    public static void main(String[] args) {
        Transporte tp;
       //Mostrar la velocidad de un avión
        System.out.println("La velocidad típica para un avión es: "+
        Transporte.AVION.getVelocidad()+ " millas por hora.\n");

        //Mostrar todas las velocidades y transportes
        System.out.println("Todas las velocidades de transporte: ");
        for (Transporte t:Transporte.values())
            System.out.println(t+ ": velocidad típica es "+t.getVelocidad()+" millas por hora.");
    }
}
