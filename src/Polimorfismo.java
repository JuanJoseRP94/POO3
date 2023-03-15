public class Polimorfismo {
    public static void main(String[] args) {

        Animal miAnimal = new Animal();
        miAnimal.sonido();
        Perro miPerro = new Perro();
        miPerro.sonido();
        Cerdo miCerdo = new Cerdo();
        miCerdo.sonido();
        Dalmata miDalmata = new Dalmata();
        miDalmata.sonido(4);
    }
}

class Animal{//Superclase = clase padre
    String descripcion = "Soy un animal";
    public void sonido(){ //Overrides
        System.out.println("El animal emite un sonido");
    }
}

class Perro extends Animal{// Subclase = clase hija
     public void sonido(){// Overrides
         descripcion = "Soy un perro";
         System.out.println("Guau Guauu!!!");
     }
}

class Dalmata extends Perro{
    public void sonido(int repeticiones){ // Sobrecarga el método Perro
        descripcion = "Soy un dálmata";
        System.out.println("Ladro " + repeticiones + " veces");
    }
}

class Cerdo extends Animal{// Subclase = clase hija
    public void sonido(){
        descripcion = "Soy un cerdo";
        System.out.println("Hola, me llamo Pepa Pig!");
    }
}
