import java.util.ArrayList;

public class Curso {
    private String nombreCurso;
    private String codigoCurso;
    private ArrayList<Alumno> listaAlumnos;
    //de nuevo atributos privados ya que no queremos que se editen desde fuera

    public Curso(){
        this.nombreCurso="NO Asignado";
        this.codigoCurso="NOAsignado000";
        this.listaAlumnos = new ArrayList<>();
    }

    public Curso(String nombre, String codigo, ArrayList<Alumno> alumnos){
        this.nombreCurso=nombre;
        this.codigoCurso=codigo;
        this.listaAlumnos=new ArrayList<>(alumnos);
    }

    //getter/setters

    public String getNombreCurso() {return nombreCurso;}
    public void setNombreCurso(String nombreNuevo){ this.nombreCurso=nombreNuevo;}

    public String getCodigoCurso() {return codigoCurso;}
    public void setCodigoCurso(String codigoNuevo){this.codigoCurso=codigoNuevo;}

    //aañadir y eliminar alumnos

    public void agregarAlumno(Alumno alumno){
        if (!buscarAlumno(alumno.getMatricula())) {
            listaAlumnos.add(alumno);
        } else {System.out.println("Alumno ya en el curso");}
    }

    public void eliminarAlumno(String matricula){
            for (int i = 0; i < listaAlumnos.size(); i++){
                if (listaAlumnos.get(i).getMatricula().equals(matricula)) {
                    listaAlumnos.remove(i);
                    return;}
            }
            System.out.println("No se puede eliminar el alumno");

    }

    public Boolean buscarAlumno(String matricula){
        for (Alumno a:listaAlumnos){
            if (a.getMatricula().equals(matricula)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String texto = this.nombreCurso+"("+ codigoCurso+"):\n";
        if (listaAlumnos.isEmpty()){
            return texto + "No hay alumnos registrados en el curso";
        }
        int contador=0;
        for (Alumno a:listaAlumnos){
            contador++;
            texto+="Alumno "+contador+": "+ a.getNombre() +" "+ a.getApellido()+"("+ a.getMatricula()+")\n";
        }
        return texto;
    }
}
