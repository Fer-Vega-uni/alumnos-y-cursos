public class PruebaSistema {

    public static void main(String[] args) {

        // --- PASO 1: Creamos 5 objetos de tipo Alumno ---
        System.out.println("--- Creando Alumnos... ---");
        Alumno alumno1 = new Alumno("Juan", "Pérez", "2025-01", "INF");
        Alumno alumno2 = new Alumno("Ana", "Gómez", "2025-02", "ARQ");
        Alumno alumno3 = new Alumno("Luis", "Mora", "2025-03", "INF");
        Alumno alumno4 = new Alumno("Carla", "Soto", "2025-04", "DER");
        Alumno alumno5 = new Alumno("Pedro", "Lara", "2025-05", "INF");

        // Podemos probar el toString de un Alumno individual
        System.out.println("Probando toString de un alumno: " + alumno1);


        // --- PASO 2: Creamos 1 objeto de tipo Curso ---
        System.out.println("\n--- Creando el Curso de Programación... ---");
        Curso programacion = new Curso("Programación Avanzada", "PROG-AV", new java.util.ArrayList<>());

        // Probamos el toString del curso cuando está vacío
        System.out.println(programacion);


        // --- PASO 3: Agregamos los alumnos al curso y probamos los métodos ---
        System.out.println("\n--- Inscribiendo alumnos en el curso... ---");
        programacion.agregarAlumno(alumno1);
        programacion.agregarAlumno(alumno2);
        programacion.agregarAlumno(alumno3);
        programacion.agregarAlumno(alumno4);
        programacion.agregarAlumno(alumno5);

        // Intentamos agregar un alumno que ya existe para probar la validación
        System.out.println("\n--- Intentando agregar un alumno duplicado... ---");
        programacion.agregarAlumno(alumno1);

        // Mostramos el estado final del curso con todos los alumnos usando toString
        System.out.println("\n--- Estado final del curso con todos los alumnos ---");
        System.out.println(programacion);


        // --- PASO 4: Probamos búsqueda ---
        System.out.println("\n--- Probando el método de búsqueda... ---");
        String matriculaBuscada1 = "2025-03"; // Una matrícula que sí existe
        String matriculaBuscada2 = "2025-99"; // Una matrícula que no existe

        if (programacion.buscarAlumno(matriculaBuscada1)) {
            System.out.println("Resultado: El alumno con matrícula " + matriculaBuscada1 + " SÍ pertenece al curso.");
        } else {
            System.out.println("Resultado: El alumno con matrícula " + matriculaBuscada1 + " NO pertenece al curso.");
        }

        if (programacion.buscarAlumno(matriculaBuscada2)) {
            System.out.println("Resultado: El alumno con matrícula " + matriculaBuscada2 + " SÍ pertenece al curso.");
        } else {
            System.out.println("Resultado: El alumno con matrícula " + matriculaBuscada2 + " NO pertenece al curso.");
        }


        // --- PASO 5: Probamos el eliminar alumnos ---
        System.out.println("\n--- Probando el método para eliminar... ---");


        // Creamos un objeto que representa al alumno a eliminar
        Alumno alumnoAEliminar = alumno2;
        System.out.println("Intentando eliminar a: " + alumnoAEliminar.getNombre() + " " + alumnoAEliminar.getApellido());

        programacion.eliminarAlumno(alumnoAEliminar.getMatricula());

        // Mostramos el curso después de la eliminación para verificar
        System.out.println("\n--- Estado del curso después de eliminar un alumno ---");
        System.out.println(programacion);
    }
}