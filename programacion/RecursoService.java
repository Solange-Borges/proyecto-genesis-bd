public class RecursoService {

    private RecursoDAO dao = new RecursoDAO();

    public void verRecursos() {
        dao.mostrarRecursos();
    }

    public void añadirRecurso(String titulo, String edad) {

        if (titulo.isEmpty() || edad.isEmpty()) {
            System.out.println("Los datos no pueden estar vacíos");
            return;
        }

        Recurso r = new Recurso(titulo, edad);
        dao.insertarRecurso(r);
    }

    public void buscarPorEdad(String edad) {
        dao.buscarPorEdad(edad);
    }
}