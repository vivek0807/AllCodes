package jdbc.srcdest;
//Malaysia Singapore
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
    static  ArrayList<Flight>  ret=new ArrayList<>();
    public ArrayList<Flight> viewFlightBySourceDestination(String source,String destination) {

        try {
            Connection c = DB.getConnection();

            PreparedStatement stm=c.prepareStatement("select * from flight where source =? and destination= ? ");
            stm.setString(1,source);
            stm.setString(2,destination);
            ResultSet r=stm.executeQuery();
                    boolean set=false;
                while (r.next())
                { set=true;
                ret.add(new Flight(r.getInt(1),r.getString(2),r.getString(3),r.getInt(4),r.getDouble(5)));
                }

           if(set==true)
               return ret;
           else
               return ret=null;
        }
        catch (ClassNotFoundException|SQLException e){
            e.printStackTrace();
        }
        return ret;
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
       ArrayList<Flight> fly= f.viewFlightBySourceDestination("Malaysia","Singapore");
      // ArrayList<Flight> fly= f.viewFlightBySourceDestination("Pune","Kolkata");
        if(fly!=null)
        {   Iterator <Flight>  flyer=fly.iterator();
            while (flyer.hasNext()) {
                Flight gets=flyer.next();
                System.out.println("Flight ID:" + gets.getFlightId());
                System.out.println("Source:" + gets.getSource());
                System.out.println("Destination:" + gets.getDestination());
                System.out.println("No of seats:" + gets.getNoOfSeats());
                System.out.println("Flight Fare:" + gets.getFlightFare());
            }
        }
        else
            System.out.println("No flights available for the given source and destination");
    }
}
