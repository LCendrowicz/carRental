package pl.sda.dao;

import pl.sda.model.Cars;

public class CarsDao extends AbstractDao<Cars> {

    public CarsDao() {
        super(Cars.class);
    }
}