public class ClaseExterna {
    int x = 100;
    int y = 25;
    Vector miVector = new Vector(8,12);
    Vector tuVector = new Vector(4,3);
    class Vector {
        // Atributos de la clase
        int x;
        int y;
        public Vector(int x, int y) {
            this.x = x;
            this.y = y;
        }

        // Método
        public void moduloVector(Vector vec){
            System.out.println("Módulo = " + Math.sqrt(Math.pow(vec.x,2) + Math.pow(vec.y,2)));

        }

        // Clase interna

    }
}
