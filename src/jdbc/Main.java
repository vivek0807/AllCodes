package jdbc;
import java.util.*;
import java.io.*;
import java.sql.*;

class Flight{
private int flightId;
private String source;
private String destination;
private int noOfSeats;
private double flightFare;

    public Flight(int flightId, String source, String destination, int noOfSeats, double flightFare) {
        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.noOfSeats = noOfSeats;
        this.flightFare = flightFare;
    }

    public int getFlightId() {
        return flightId;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public double getFlightFare() {
        return flightFare;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public void setFlightFare(double flightFare) {
        this.flightFare = flightFare;
    }
}

class FlightManagement extends DB{
    static  boolean ret =false;
    public  boolean addFlight(Flight flightObj){
        try {
            Connection c = DB.getConnection();
            int id=flightObj.getFlightId();
            String source=flightObj.getSource();
            String dest=flightObj.getDestination();
            int seats=flightObj.getNoOfSeats();
            double price=flightObj.getFlightFare();
           /* String query="insert into flight values("+id+",'"+source+"','"+dest+"',"+seats+","+price+");";
            Statement stm=c.createStatement();*/
         // FlightManagement.ret=stm.execute(query);// returns boolean
            PreparedStatement stm=c.prepareStatement("insert into flight (flightid,source,destination,seats,price) values(?,?,?,?,?)");
            stm.setInt(1,id);
            stm.setInt(4,seats);
            stm.setDouble(5,price);
            stm.setString(2,source);
            stm.setString(3,dest);
            if(stm.executeUpdate()>0)
            { FlightManagement.ret=true;
            }
            else
                FlightManagement.ret=false;


           // c.close();
        }
        catch (ClassNotFoundException|SQLException e){
            e.printStackTrace();
        }
        return FlightManagement.ret;
    }
}
class DB{
    private static Connection con=null;
    private static Properties props= new Properties();
    public static Connection getConnection() throws ClassNotFoundException,SQLException {

        try{
                FileInputStream fis=null;
               // fis=new FileInputStream("D:\\Documents\\Java\\LearnJava\\DsUsingJava\\src\\jdbc\\database.properties");
             //   props.load(fis);
                Class.forName("com.mysql.jdbc.Driver");
                //con=DriverManager.getConnection(props.getProperty("DB_URL"),props.getProperty("DB_USERNAME"),props.getProperty("DB_PASSWORD"));
        con=DriverManager.getConnection("jdbc:mysql://localhost/w3schools? user=system&password=7410");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }

}

public class Main {
    public static void main(String[] args) {
        FlightManagement f= new FlightManagement();
        Flight fly=new Flight(1234,"Bengaluru","Patna",140,4345.45);
        if(f.addFlight(fly))
            System.out.println("Flight details added successfully");
        else
            System.out.println("Addition not done");

    }
}
