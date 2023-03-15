public class Herencia {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo();
        miVehiculo.claxon();

        Coche miCoche = new Coche();
        miCoche.abrirMaletero();

        // Persona -> Alumno -> AlumnoIngenieria
        Persona juan = new Persona();
        juan.caminar();
        //juan.estudiar(); Método de la subclase

        Alumno juanPerez = new Alumno();
        juanPerez.caminar();// Método de la superclase
        juanPerez.estudiar(); // Método del Alumno.

        AlumnoIngenieria JuanPerezLopez = new AlumnoIngenieria();
        JuanPerezLopez.caminar();
        JuanPerezLopez.estudiar();
        JuanPerezLopez.practicas();
    }

}
