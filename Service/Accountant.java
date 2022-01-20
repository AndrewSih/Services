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

    public Accountant() {
    }

    public Accountant(int id, Date date, int starttime, int stoptime, String done) {
        this.id = id;
        this.date = date;
        this.starttime = starttime;
        this.stoptime = stoptime;
        this.done = done;
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

    @Override
    public String toString() {
        return "Accountant{" +
                "id=" + id +
                ", date=" + date +
                ", starttime=" + starttime +
                ", stoptime=" + stoptime +
                ", done='" + done + '\'' +
                '}';
    }
}
