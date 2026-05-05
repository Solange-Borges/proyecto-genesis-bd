import java.sql.*;

public class RecursoDAO {

    public void mostrarRecursos() {
        try (Connection con = ConexionBD.conectar()) {

            String sql = "SELECT * FROM recursos";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                System.out.println(
                        rs.getString("titulo") + " - " +
                                rs.getString("edad")
                );
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void insertarRecurso(Recurso r) {
        try (Connection con = ConexionBD.conectar()) {

            String sql = "INSERT INTO recursos (titulo, edad) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, r.getTitulo());
            ps.setString(2, r.getEdad());

            ps.executeUpdate();

            System.out.println("Recurso añadido");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // 👇 ESTE VA DENTRO DE LA CLASE
    public void buscarPorEdad(String edad) {
        try (Connection con = ConexionBD.conectar()) {

            String sql = "SELECT * FROM recursos WHERE edad = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, edad);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getString("titulo") + " - " +
                                rs.getString("edad")
                );
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
