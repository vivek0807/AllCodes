package hibernate.Mapping;
import javax.persistence.Entity;// from hibernate jar file
import javax.persistence.*;// from hibernate jar file
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.*;


@Entity
class CricketMacth{

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int matchId;
    private String matchName;
    private Date matchDate;

    @ManyToMany
    private List<Player> players=new ArrayList<Player>();

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getMatchId() {
        return matchId;
    }
    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }
    public String getMatchName() {
        return matchName;
    }
    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }
    public Date getMatchDate() {
        return matchDate;
    }
    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }
}

@Embeddable
class MatchAllocation implements Serializable {
    @ManyToOne
    private Player player;
    @ManyToOne
    private CricketMacth cricketMacth;

    public Player getPlayer() {
        return player;
    }

    public CricketMacth getCricketMacth() {
        return cricketMacth;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setCricketMacth(CricketMacth cricketMacth) {
        this.cricketMacth = cricketMacth;
    }
}


class CricketMatch_Player{
    @EmbeddedId
    private MatchAllocation matchAllocation=new MatchAllocation();
    private int cricketmatch_matchId;
     private int  players_playerid;

    public MatchAllocation getMatchAllocation() {
        return matchAllocation;
    }

    public void setMatchAllocation(MatchAllocation matchAllocation) {
        this.matchAllocation = matchAllocation;
    }

    public int getCricketmatch_matchId() {
        return cricketmatch_matchId;
    }

    public void setCricketmatch_matchId(int cricketmatch_matchId) {
        this.cricketmatch_matchId = cricketmatch_matchId;
    }

    public int getPlayers_playerid() {
        return players_playerid;
    }

    public void setPlayers_playerid(int players_playerid) {
        this.players_playerid = players_playerid;
    }
}

@Entity
class Player{
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int playerId;
    private String playerName;
    private int runsScored;


    public int getPlayerId() {
        return playerId;
    }
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public int getRunsScored() {
        return runsScored;
    }
    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }
}
class CricketDAO {

    private Session session;

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public void allocatePlayertoMatch(int matchId,int playerId)
    {

    }

}



public class Many2Many {
    public static void main(String[] args) {
        SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session=sf.openSession();

        CricketDAO cd= new CricketDAO();
        cd.setSession(session);
    }
}
