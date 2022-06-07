package com.itvdn.javastarter.test.simple_dao;

import com.itvdn.javastarter.test.simple_dao.dao.ClientDAO;
import com.itvdn.javastarter.test.simple_dao.dao.impl.DAOFactory;
import com.itvdn.javastarter.test.simple_dao.dao.IDAOFactory;
import com.itvdn.javastarter.test.simple_dao.entity.Address;
import com.itvdn.javastarter.test.simple_dao.entity.Status;
import com.itvdn.javastarter.test.simple_dao.entity.User;

import java.util.ArrayList;
import java.util.List;

public class  Main {

    public static void main(String[] args) {
        IDAOFactory factory = DAOFactory.getInstance();

        ClientDAO clientDAO = factory.getClientDAO();

       /* User client = new User();
        client.setAge(10);
        client.setName("JJ");
        client.setStreet("HUNN");

        clientDAO.add(client);*/

        User user1 = new User();
        user1.setUserAge(4444);
        user1.setUserName("DDDD");
        user1.setStatus(Status.ACTIVE);
        user1.setAddress(new Address("Miras", 22));
        List<String> phones = new ArrayList<>();
        phones.add("333");
        phones.add("444");
        user1.setUserPhone(phones);


        clientDAO.add(user1);

        System.out.println(user1);


//        CarDAO carDAO = factory.getCarDAO();
//
//        carDAO.updatePrice(70000, 9);
//
//                carDAO.remove("Chevrolet");

//        System.out.println(car.getId() + " " + car.getMark()
//                    + " " + car.getModel() + " " + car.getPrice());

//       Car car = new Car();
//       car.setMark("AUDI");
//       car.setModel("A8");
//       car.setPrice(150_000);
//       carDAO.add(car);

//        Car car2 = new Car();
//        car2.setMark("Mersedes");
//        car2.setModel("S500");
//        car2.setPrice(160_000);
//        carDAO.add(car);


//        List<Car> cars = carDAO.getAll();
//        for (Car car : cars) {
//            System.out.println(car.getId() + " " + car.getPrice() + " " + car.getMark() + " " + car.getModel());
//        }

//        Car car1 = carDAO.getById(9);
//        System.out.println(car1.getId() + " " + car1.getPrice() + " " + car1.getMark() + " " + car1.getModel());

    }

}
