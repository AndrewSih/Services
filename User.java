package Service;

import javax.persistence.*;


@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    protected int id;

    @Column(name="user")
    protected String user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "team_id")
    protected Team teamid;

    @OneToOne(mappedBy = "userid", cascade = CascadeType.ALL)
    protected Accountant accountant;

    public User() {
    }

    public User(int id, String user, Team teamid, Accountant accountant) {
        this.id = id;
        this.user = user;
        this.teamid = teamid;
        this.accountant = accountant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Team getTeamid() {
        return teamid;
    }

    public void setTeamid(Team teamid) {
        this.teamid = teamid;
    }

    public Accountant getAccountant() {
        return accountant;
    }

    public void setAccountant(Accountant accountant) {
        this.accountant = accountant;
    }
}