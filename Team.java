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

   /* @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    protected User userid;*/
   @OneToOne(mappedBy = "teamid", cascade = CascadeType.ALL)
    protected User user;

    public Team() {
    }

    public Team(int id, String team, User user) {
        this.id = id;
        this.team = team;
        this.user = user;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", team='" + team + '\'' +
                ", user=" + user +
                '}';
    }
}
