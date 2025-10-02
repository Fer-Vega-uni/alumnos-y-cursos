

public class Alumno {
    private static int numeroNoIdentificados=0;
    private String nombre;
    private String apellido;
    private String matricula;
    private String codigoCarrera;
    //todos los atributos los puse cómo privados, ya que no tendría sentido que desde fuera se fueran cambiando estos datos


    //constructores
    public Alumno(){
        numeroNoIdentificados++;
        this.nombre= "Alumno";
        this.apellido="NN";
        this.codigoCarrera="NULL";
        this.matricula= ""+numeroNoIdentificados;
    }

    public Alumno(String nombreAlumno,String apellidoAlumno,String matriculaAlumno,String codigoCarreraAlumno){
        this.nombre=nombreAlumno;
        this.apellido=apellidoAlumno;
        this.codigoCarrera=codigoCarreraAlumno;
        this.matricula=matriculaAlumno;
    }

    //getters y setters

    public String getNombre(){return this.nombre;}
    public void setNombre(String nombreNuevo) {this.nombre=nombreNuevo;}

    public String getApellido(){return this.apellido;}
    public void  setApellido(String apellidoNuevo){this.apellido=apellidoNuevo;}

    public String getMatricula(){return this.matricula;}
    //no setter, no se debería poder cambiar la matrícula

    public String getCodigoCarrera(){return this.codigoCarrera;}
    public void setCodigoCarrera(String codigoCarreraNuevo){this.codigoCarrera=codigoCarreraNuevo;}

    @Override
    public String toString() {
        return "Alumno[" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", matricula='" + matricula + '\'' +
                ", codigoCarrera='" + codigoCarrera + '\'' +
                ']';
    }
}
