public class Docente_linea extends Docente{
    public String tipo_contrato;

    public Docente_linea(String cedula, String nombre, String direccion, String correo,String facultadPertenece, int horasAsignadaClases,String tipo_contrato){
        super(cedula,nombre,direccion,correo,facultadPertenece, horasAsignadaClases);
        this.tipo_contrato = tipo_contrato;
    }

    @Override
    public void mostrarInformacionPersonal() {
        super.mostrarInformacionPersonal();
        System.out.println("Tipo de contrato: " + tipo_contrato);
    }
}
