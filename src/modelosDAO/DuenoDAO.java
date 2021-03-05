package modelosDAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DuenoDAO {

    private static SessionFactory factory;
    private static ServiceRegistry serviceRegistry;

    public DuenoDAO() {
        System.err.println("Iniciando conexionn");
        try {
            Configuration configuration = new Configuration();
            System.err.println("Leyendo configuracion.");
            configuration.configure();
            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            factory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            System.err.println("No se puede crear la Sesion" + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public void GuardarDatos(String Nombre, String Direccion, String Telefono){
        Session session = factory.openSession();
        session.beginTransaction();

        Dueno userRegister = new Dueno(Nombre, Direccion, Telefono);
        session.save(userRegister);

        session.getTransaction().commit();
    }



    public List<Dueno> getAll() throws SQLException {
        Session session = factory.openSession();
        List<Dueno> lista = new ArrayList<>();

Dueno d = null;
        ResultSet rs = (ResultSet) session.createQuery("SELECT Nombre, Direccion, Telefono " +
                "FROM db201269.dueño "
        );

        while(rs.next()){
d = new Dueno();

d.setNombre(rs.getString("Nombre").trim());
d.setDireccion(rs.getString("Direccion").trim());
d.setTelefono(rs.getString("Telefono").trim());
            System.out.println(d.getNombre()+d.getDireccion()+d.getTelefono());
lista.add(d);



        }

        return lista;
    }



}
