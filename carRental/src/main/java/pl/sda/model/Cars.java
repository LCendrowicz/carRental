package pl.sda.model;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cars")
public class Cars {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "carsSeq")
    @GenericGenerator(name = "carsSeq", strategy = "increment")
    private int id;

    @Column(name = "mark")
    private String mark;

    @Column(name = "model")
    private String model;

    @Column(name = "colour")
    private String colour;

    @Column(name = "registration_number")
    private String registrationNumber;

    @Column(name = "vehicle_condition")
    private String vehicleCondition;

    public Cars(String mark, String model, String colour, String registrationNumber, String vehicleCondition) {
        this.mark = mark;
        this.model = model;
        this.colour = colour;
        this.registrationNumber = registrationNumber;
        this.vehicleCondition = vehicleCondition;
    }

    public Cars() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getVehicleCondition() {
        return vehicleCondition;
    }

    public void setVehicleCondition(String vehicleCondition) {
        this.vehicleCondition = vehicleCondition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return id == cars.id &&
                Objects.equals(mark, cars.mark) &&
                Objects.equals(model, cars.model) &&
                Objects.equals(colour, cars.colour) &&
                Objects.equals(registrationNumber, cars.registrationNumber) &&
                Objects.equals(vehicleCondition, cars.vehicleCondition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mark, model, colour, registrationNumber, vehicleCondition);
    }

    @Override
    public String toString() {
        return "Cars{" +
                "id =" + id +
                ", mark ='" + mark + '\'' +
                ", model ='" + model + '\'' +
                ", colour ='" + colour + '\'' +
                ", registrationNumber ='" + registrationNumber + '\'' +
                ", vehicleCondition ='" + vehicleCondition + '\'' +
                '}';
    }
}

