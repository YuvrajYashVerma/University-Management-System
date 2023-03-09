package university.managment.system;
import java.sql.*;
public class Conn {
    
    Connection c;
    Statement s;
    Conn(){
        try{
            //FIVE STEPS OF JDBC CONNECTIVITY 
            //1->Register The Driver Class
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2->Creating Connection String
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem","root","6264184604");
            //3->Creating Stetement
            s = c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

//4->Executing MySQL Queries
//5->Closing The Connection