import java.sql.*;


public class main {
    public static void main(String[] args) throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.jdbc.DriverManager");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }


        String url="jdbc:mysql://127.0.0.1:3306/hospital";

        String username="root";
        String password="Prajwal@4561";

        try(Connection connection= DriverManager.getConnection(url,username,password)){
                System.out.println("Connected to database");
            System.out.println(connection);
            }
            catch(SQLException e){
                System.out.println("Connection failed: "+e.getMessage());
            }




    }
}
