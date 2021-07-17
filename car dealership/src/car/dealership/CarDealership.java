/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.dealership;

/**
 *
 * @author Muneeb Riaz
 */
import java.util.ArrayList;

class Dealership
{
  private String company;
  private Manager manager;
  private ArrayList<SalesPerson> people = new ArrayList<SalesPerson>();
  private ArrayList<Car> cars = new ArrayList<Car>();

  //**********************************************************

  public Dealership(String company, Manager manager)
  {
    this.company = company;
    this.manager = manager;
  }
  public void addCar(Car car)
  {
    cars.add(car);
  }

  public void addPerson(SalesPerson person)
  {
    people.add(person);
  }

  //**********************************************************

  public void printStatus()
  {
    System.out.println(company + "\t" + manager.getName());
    for (SalesPerson person : people)
      System.out.println(person.getName());
    for (Car car : cars)
      System.out.println(car.getMake());
  } // end printStatus
} // end Dealership class
class Car
{
  private String make;

  //**********************************************************

  public Car(String make)
  {
    this.make = make;
  }

  //**********************************************************

  public String getMake()
  {
    return make;
  }
} // end Car class
class Manager
{
  private String name;

  //**********************************************************

  public Manager(String name)
  {
    this.name = name;
  }

  //**********************************************************

  public String getName()
  {
    return name;
  }
} // end Manager class
class SalesPerson
{
  private String name;
  private double sales = 0.0; // sales to date

  //**********************************************************

  public SalesPerson(String name)
  {
    this.name = name;
  }

  //**********************************************************

  public String getName()
  {
    return name;
  }
} // end SalesPerson class

public class CarDealership {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
  {
    Manager ahmed = new Manager("Ahmed Abdi");
    SalesPerson ash = new SalesPerson("Ash Lawrence");
    SalesPerson jeffrey = new SalesPerson("Jeffrey Leung");
    Dealership dealership = new Dealership("OK Used Cars", ahmed);

    dealership.addPerson(ash);
    dealership.addPerson(jeffrey);
    dealership.addCar(new Car("GMC"));
    dealership.addCar(new Car("Yugo"));
    dealership.addCar(new Car("Dodge"));
    dealership.printStatus();
  } // end main
} // end DealershipDriver class
    }
    

