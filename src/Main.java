public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("1725576423","Alejandro Guanoluisa","Reino de quito","alejo@epn.edu.ec", "0993630096","Software","Tercero");
        System.out.println("--Informacion Estudiante--");
        e1.mostrarInformacionPersonal();

        Docente d1 = new Docente("1725576432","Yadira Lopez","Solanda","yadi@epn.edu.ec","0999999999","ESFOT",20);
        System.out.println("--Informacion Docente--");
        d1.mostrarInformacionPersonal();

        Estudiante_Presencial p1 = new Estudiante_Presencial("1725576435","Pepe Perez","La J","pepe@epn.edu.ec","0888888888","Telecomunicaciones","Terecero",3,"7:00 - 10:00");
        System.out.println("--Informacion Estudiante_Presencial--");
        p1.mostrarInformacionPersonal();

        Estudiante_virtual v1 = new Estudiante_virtual("1725576346","Maria Gutierrez","La Mena 2","mari@gmail.com","0274563125","Agua y saniemiento","Segundo","Teems","Lorena chulde");
        System.out.println("--Informacion Estudiante_virtual--");
        v1.mostrarInformacionPersonal();
        System.out.print("Edad: " + v1.calcularEdad(2025,2005));

        Docente_linea l1 = new Docente_linea("1725576432","Yadira Lopez","Solanda","yadi@epn.edu.ec","Tiempo completo");
        System.out.println("--Informacion Docente_linea--");
        l1.mostrarInformacionPersonal();
    }
}