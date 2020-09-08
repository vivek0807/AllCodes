package hibernate.Mapping;
import javax.persistence.Entity;// from hibernate jar file
import javax.persistence.*;// from hibernate jar file
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;
@Entity
class Country{
    //primary key
    @Id
    private String countryName;
    private String currency;
    private String capital;

    @OneToMany(mappedBy = "country",cascade = CascadeType.ALL)//@JoinColumn(name=passport)
    private List<State> statelist=new ArrayList<State>();

    public List<State> getStatelist() {
        return statelist;
    }

    public void setStatelist(List<State> statelist) {
        this.statelist = statelist;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCurrency() {
        return currency;
    }

    public String getCapital() {
        return capital;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}

@Entity
class State{
    //primarykey
    @Id
    private String stateName;
    private String language;
    private long population;

    @ManyToOne
    private Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getStateName() {
        return stateName;
    }

    public String getLanguage() {
        return language;
    }

    public long getPopulation() {
        return population;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setPopulation(long population) {
        this.population = population;
    }


}

class CountryDAO{
    private Session session;

    public void setSession(Session session) {
        this.session = session;
    }

    public Session getSession() {
        return session;
    }
    public void addCountry(Country country){
        Transaction trans= session.beginTransaction();
        session.save(country);
        trans.commit();
    }

    public void addStatetoCountry(String countryName,State state ){

                Transaction trans =session.beginTransaction();
                Country cont=(Country)session.get(Country.class,countryName);
                List <State> statelist =cont.getStatelist();
                statelist.add(state);
                cont.setStatelist(statelist);
                if(cont.getCountryName().equals(countryName)){
                    session.save(state);
                    session.saveOrUpdate(cont);
                    trans.commit();
                }
                else {
                    System.out.println("No such country name");
                }

    }

    public  List<State> stateWithMaxPopulation(String countryName){
            Transaction transaction=session.beginTransaction();
            Country c=(Country) session.get(Country.class,countryName);
            List<State> li=c.getStatelist();
            List<State> maxpop=new ArrayList<State>() ;
            long max=Long.MIN_VALUE;
        for (State s:li) {
            if(s.getPopulation()>max)
                max=s.getPopulation();
        }
        for (State s: li  ) {
            if(s.getPopulation()==max)
                maxpop.add(s);
        }
        transaction.commit();
        return maxpop;
    }

    public  void removeCountry(String countryName){
        Transaction trans=session.beginTransaction();
        Country c=(Country) session.get(Country.class,countryName);
        session.delete(c);
        trans.commit();
    }

}

public class ManytoOne {
    public static void main(String[] args) {

        SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session=sf.openSession();
       CountryDAO cd= new CountryDAO();
        cd.setSession(session);

        Country country=new Country();
        country.setCountryName("India");
        country.setCurrency("Rupees");
        country.setCapital("New Delhi");

        cd.addCountry(country);

        State state= new State();
        state.setCountry(country);
        state.setLanguage("Marathi");
        state.setStateName("Maharshtra");
        state.setPopulation(500000);
        cd.addStatetoCountry("India",state);

        State state1= new State();
        state1.setCountry(country);
        state1.setLanguage("Kannada");
        state1.setStateName("Karanataka");
        state1.setPopulation(500000);
        cd.addStatetoCountry("India",state1);


        List<State> li=cd.stateWithMaxPopulation("India");
        for (State s:li ) {
            System.out.println(s.getStateName());
            System.out.println(s.getPopulation());
        }

        cd.removeCountry("India");
        System.exit(0);

    }
}
