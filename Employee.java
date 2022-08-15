//This display console app will allow you create a list of employee name, id, and salary. 
//This will allow you Insert, Display, Search, Update and Delete operations over the data input. 

import java.util.*;

class Employee{

  private String employeeName;
  private int employeeNumber;
  private int employeeSalary;

  Employee(String employeeName, int employeeNumber, int employeeSalary){
    this.employeeName = employeeName;
    this.employeeNumber = employeeNumber;
    this.employeeSalary = employeeSalary;
  }
  //getters

  public String getEmployeeName(){
    return employeeName;
  }
  public int getEmployeeNumber(){
    return employeeNumber;
  }
  public int getEmployeeSalary(){
    return employeeSalary;
  }

  public String toString(){
    return employeeName + " " + employeeNumber + " " + employeeSalary;
  }

}

class CRUDDemo{
  public static void main(String[] args) {
    int ch;
    List<Employee> c = new ArrayList<Employee>();
    Scanner scanner = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);
    do{
      System.out.println("1. Insert");
      System.out.println("2. Display");
      System.out.println("3. Search");
      System.out.println("4. Delete");
      System.out.println("5. Update");
      System.out.println("Please enter your choice: ");

      ch = scanner.nextInt();
      switch (ch){
        //Insert
        case 1:
          System.out.print("Enter Empolee Number: ");
          int employeeNumber = scanner.nextInt();
          System.out.print("Enter Empolee Name: ");
          String employeeName = scanner1.nextLine();
          System.out.print("Enter Empolee Salary: ");
          int employeeSalary = scanner.nextInt();

          c.add(new Employee(employeeName, employeeNumber, employeeSalary));
        break;
        //Display
        case 2:
          Iterator<Employee> i = c.iterator();
          System.out.println("\n------------------------");
          
          while (i.hasNext()){
            Employee e = i.next();
            System.out.print(e + "\n");
          }
          System.out.println("------------------------");
        break;
        //Search
        case 3:
          boolean found = false;
          System.out.println("------------------------");
          System.out.print("Enter your employee number to search: ");
          int empNumber = scanner.nextInt();
          i = c.iterator();
          while (i.hasNext()){
            Employee e = i.next();
            if (e.getEmployeeNumber() == empNumber){
              found = true;
              System.out.println(e);
            }
          }
          if(!found){
            System.out.println("Not found.");
          }
          System.out.println("------------------------");
        break;

        case 4:
          found = false;
          System.out.println("------------------------");
          System.out.println("Enter your employee number to delete: ");
           empNumber = scanner.nextInt();
          i = c.iterator();
          while (i.hasNext()){
            Employee e = i.next();
            if (e.getEmployeeNumber() == empNumber){
              found = true;
              i.remove();
            }
          }
          if(!found){
            System.out.println("Not found.");
          } else {
            System.out.println("Record has been deleted successfully! ");
          }
          System.out.println("------------------------");
        break;

        case 5:
          found = false;
          System.out.println("------------------------");
          System.out.println("Enter your employee number to update: ");
          empNumber = scanner.nextInt();
          ListIterator<Employee>li = c.listIterator();
          while (li.hasNext()){
            Employee e = li.next();
            if (e.getEmployeeNumber() == empNumber){
              System.out.println("Enter your employee name to update: ");
              employeeName = scanner1.nextLine();

              System.out.println("Enter your employee salary to update: ");
              employeeSalary = scanner.nextInt();

              li.set(new Employee(employeeName, empNumber, employeeSalary));
              found = true;
            }
          }
          if(!found){
            System.out.println("Not found.");
          } else {
            System.out.println("Record has been updated successfully! ");
          }
          System.out.println("------------------------");
        break;
      }
    }while(ch!=0);
  }
}
