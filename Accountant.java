package Service;

import javax.persistence.*;
import java.util.Date;
@Entity
    @Table(name="accountant")
    public class Accountant {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        protected int id;

        @Column(name = "date")
        @Temporal(TemporalType.DATE)
        private Date date;

        @Column(name = "starttime")
        protected int starttime;

        @Column(name = "stoptime")
        protected int stoptime;

        @Column(name = "done")
        protected String done;

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "user_id")
        protected User userid;

    public Accountant() {
    }

    public Accountant(int id, Date date, int starttime, int stoptime, String done, User userid) {
        this.id = id;
        this.date = date;
        this.starttime = starttime;
        this.stoptime = stoptime;
        this.done = done;
        this.userid = userid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getStarttime() {
        return starttime;
    }

    public void setStarttime(int starttime) {
        this.starttime = starttime;
    }

    public int getStoptime() {
        return stoptime;
    }

    public void setStoptime(int stoptime) {
        this.stoptime = stoptime;
    }

    public String getDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = done;
    }

    public User getUserid() {
        return userid;
    }

    public void setUserid(User userid) {
        this.userid = userid;
    }
}
