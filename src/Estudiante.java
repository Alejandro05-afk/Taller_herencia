public class Estudiante extends Persona{
    public String carrera;
    public String nivel;

    public Estudiante(String cedula, String nombre, String direccion, String correo, String telefono, String carrera, String nivel){
        super(cedula, nombre, direccion, correo, telefono);
        this.carrera = carrera;
        this.nivel = nivel;
    }

    @Override
    public void mostrarInformacionPersonal() {
        super.mostrarInformacionPersonal();
        System.out.println("Carrera: " + carrera);
        System.out.println("Nivel: " + nivel);
    }
    public int calcularEdad(int anioActual,int anioNacimineto){
        return (anioActual-anioNacimineto);
    }
}
