package jdbc.retrive;
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

class FlightManagementSystem  {
    static  Flight  ret =null;
    public Flight viewFlightById(int flightId) {
        try {
            Connection c = DB.getConnection();

            PreparedStatement stm=c.prepareStatement("select * from flight ");
           // stm.setInt(1,flightId);
            ResultSet r=stm.executeQuery();
            if(r.next()==true){
                FlightManagementSystem.ret=new Flight(r.getInt(1),r.getString(2),r.getNString(3),r.getInt(4),r.getDouble(5));
            }


            // c.close();
        }
        catch (ClassNotFoundException|SQLException e){
            e.printStackTrace();
        }
       return FlightManagementSystem.ret;
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
        FlightManagementSystem f= new FlightManagementSystem();
        Flight fly= f.viewFlightById(1234);
    if(fly!=null)
    {System.out.println("Flight ID:"+fly.getFlightId());
    System.out.println("Source:"+fly.getSource());
    System.out.println("Destination:"+fly.getDestination());
    System.out.println("No of seats:"+fly.getNoOfSeats());
    System.out.println("Flight Fare:"+fly.getFlightFare());
    }
    else
        System.out.println("Invalid Flight ID");
    }
}