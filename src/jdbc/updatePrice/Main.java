package jdbc.updatePrice;
//Malaysia Singapore
//18221
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
    static boolean result=false;
    public boolean deleteFlight(int flightId) {

        try {
            Connection c = DB.getConnection();

            PreparedStatement stm=c.prepareStatement("delete from flight where flightid=?");
            stm.setInt(1,flightId);


          if( stm.executeUpdate()>0)
              result=true;
          else
              result=false;
        }
        catch (ClassNotFoundException|SQLException e){
            e.printStackTrace();
        }
        return result;
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
        Boolean result= f.deleteFlight(1);
        if(result)
        {
            System.out.println("Flight Details deleted successfully");
        }

        else
            System.out.println("Flight Not deleted. Check for the ID");
    }
}
