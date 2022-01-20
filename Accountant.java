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
        @Temporal(TemporalType.TIME)
        protected Date starttime;

        @Column(name = "stoptime")
        @Temporal(TemporalType.TIME)
        private Date stoptime;


        @Column(name = "done")
        protected String done;

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "user_id")
        protected User userid;

    public Accountant() {
    }

    public Accountant(int id, Date date, Date starttime, Date stoptime, String done, User userid) {
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

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getStoptime() {
        return stoptime;
    }

    public void setStoptime(Date stoptime) {
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

    @Override
    public String toString() {
        return "Accountant{" +
                "id=" + id +
                ", date=" + date +
                ", starttime=" + starttime +
                ", stoptime=" + stoptime +
                ", done='" + done + '\'' +
                ", userid=" + userid +
                '}';
    }
}

