public class Docente extends Persona{
    public String facultadPertenece;
    public int horasAsignadaClases;

    public Docente(String cedula, String nombre, String direccion, String correo, String telefono, String facultadPertenece, int horasAsignadaClases){
        super(cedula, nombre, direccion, correo, telefono);
        this.facultadPertenece = facultadPertenece;
        this.horasAsignadaClases = horasAsignadaClases;
    }

    @Override
    public void mostrarInformacionPersonal() {
        super.mostrarInformacionPersonal();
        System.out.println("Facultad a la que pertenece: " + facultadPertenece);
        System.out.println("Horas de clase asignadas: " + horasAsignadaClases);
    }
}
