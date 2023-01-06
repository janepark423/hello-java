package core.ch02;

import java.util.Random;

public class Employee {

    private static final Random generator = new Random();
    private static int lastId = 0;
  private int id;
    private String name;
    private double salary;

  public Employee(){
      // lastId++;
      id = 1 + generator.nextInt(1_000_000);
  }
}
