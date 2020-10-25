package pl.sda.model;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "hires")
public class Hires {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "hiresSeq")
    @GenericGenerator(name = "hiresSeq", strategy = "increment")
    private int id;

    @Column(name = "hire_date")
    private Date hireDate;

    @Column(name = "planned_return_date")
    private Date plannedReturnDate;

    @Column(name = "return_date")
    private Date returnDate;

    @ManyToOne(targetEntity = Cars.class)
    private Cars cars;

    @ManyToOne(targetEntity = Clients.class)
    private Clients clients;

    public Hires(Date hireDate, Date plannedReturnDate, Date returnDate, Cars cars, Clients clients) {
        this.hireDate = hireDate;
        this.plannedReturnDate = plannedReturnDate;
        this.returnDate = returnDate;
        this.cars = cars;
        this.clients = clients;
    }

    public Hires() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date getPlannedReturnDate() {
        return plannedReturnDate;
    }

    public void setPlannedReturnDate(Date plannedReturnDate) {
        this.plannedReturnDate = plannedReturnDate;
    }

    public Date getReturnDateDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Cars getCars() {
        return cars;
    }

    public void setCars(Cars cars) {
        this.cars = cars;
    }

    public Clients getClients() {
        return clients;
    }

    public void setClients(Clients clients) {
        this.clients = clients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hires hires = (Hires) o;
        return id == hires.id &&
                Objects.equals(hireDate, hires.hireDate) &&
                Objects.equals(plannedReturnDate, hires.plannedReturnDate) &&
                Objects.equals(returnDate, hires.returnDate) &&
                Objects.equals(cars, hires.cars) &&
                Objects.equals(clients, hires.clients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hireDate, plannedReturnDate, returnDate, cars, clients);
    }

    @Override
    public String toString() {
        return "Hires{" +
                "id =" + id +
                ", hireDate ='" + hireDate + '\'' +
                ", plannedReturnDate ='" + plannedReturnDate + '\'' +
                ", returnDate ='" + returnDate + '\'' +
                ", cars = '" + cars + '\'' +
                ", clients = '" + clients + '\'' +
                '}';
    }

}
