package Service;

import javax.persistence.*;

@Entity
@Table(name="team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected int id;

    @Column(name = "team")
    protected String team;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    protected User userid;

    public Team() {
    }

    public Team(int id, String team, User userid) {
        this.id = id;
        this.team = team;
        this.userid = userid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public User getUserid() {
        return userid;
    }

    public void setUserid(User userid) {
        this.userid = userid;
    }


    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", team='" + team + '\'' +
                ", userid=" + userid +
                '}';
    }
}
