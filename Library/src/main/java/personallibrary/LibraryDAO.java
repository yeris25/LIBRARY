package personallibrary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface LibraryDAO {

    public static void registerBookDB(LibraryModel libMo) {

        Conexion data_connect = new Conexion();

        try (Connection conexion = data_connect.get_connection()) {

            PreparedStatement prepStat = null;

            try {
                String query = "INSERT INTO book (book_name, author, isbn, pages, category";

                prepStat = conexion.prepareStatement(query);
                prepStat.setString(1, libMo.getBookName());
                prepStat.setString(2, libMo.getAuthor());
                prepStat.setString(3, libMo.getIsbn());
                prepStat.setInt(4, libMo.getPages());
                prepStat.setString(5, libMo.getCategory());
                prepStat.execute();
                System.out.println("Registro Exitoso");

            } catch (SQLException e) {
                System.out.println(e);
            }

        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }


    public static void updateBook() {

    }

    public static void deleteBookDB() {

    }

    public static void listBook() {
    }

    Conexion data_connect = new Conexion();

    PreparedStatement prepStat = null;

    ResultSet resultSet = null;

    try (Connection conexion = data_connect.get_connection()){

        String query
    }

}