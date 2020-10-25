package pl.sda;

import pl.sda.dao.CarsDao;
import pl.sda.dao.ClientsDao;
import pl.sda.dao.HiresDao;
import pl.sda.model.Cars;
import pl.sda.model.Clients;
import pl.sda.model.Hires;

public class App {
    public static void main(String[] args) {
        CarsDao carsDao = new CarsDao();
        ClientsDao clientsDao = new ClientsDao();
        HiresDao hiresDao = new HiresDao();

        Cars car1 = new Cars("Tesla", "S", "blue", "PL-0001", "good");
        Cars car2 = new Cars("Dodge", "Demon", "black", "PL-0002", "good");
        Cars car3 = new Cars("Nysa", "501", "red", "PL-0003", "damaged");
        Cars car4 = new Cars("Hyundai", "Kona", "green", "PL-0004", "good");
        Cars car5 = new Cars("Porsche", "Panamera GTS", "yellow", "PL-0005", "good");
        Cars car6 = new Cars("Opel", "Astra", "white", "PL-0006", "good");
        Cars car7 = new Cars("Toyota", "Camry", "pink", "PL-0007", "good");
        Cars car8 = new Cars("Volvo", "XC90", "silver", "PL-0008", "good");
        Cars car9 = new Cars("Fiat", "Panda", "grey", "PL-0009", "good");
        Cars car10 = new Cars("Ford", "Mondeo", "orange", "PL-0010", "good");

        carsDao.add(car1);
        carsDao.add(car2);
        carsDao.add(car3);
        carsDao.add(car4);
        carsDao.add(car5);
        carsDao.add(car6);
        carsDao.add(car7);
        carsDao.add(car8);
        carsDao.add(car9);
        carsDao.add(car10);

        Clients client1 = new Clients("Piotr", "Malinowski");
        Clients client2 = new Clients("Magdalena", "Gruszka");
        Clients client3 = new Clients("Damian", "Sosnowy");
        Clients client4 = new Clients("Iwona", "Porzeczka");
        Clients client5 = new Clients("Robert", "Wiśniewski");

        clientsDao.add(client1);
        clientsDao.add(client2);
        clientsDao.add(client3);
        clientsDao.add(client4);
        clientsDao.add(client5);


    }

}
