package structure.main;

import structure.bank.BankAccount;
import structure.inventory.Inventory;
import structure.inventory.Product;
import structure.inventory.Warehouse;
import structure.university.Course;
import structure.university.Enrollment;
import structure.university.Student;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(2345);
        bankAccount.setAccountHolder("Deya Bakheet");
        bankAccount.setBalance(9000.00);
        System.out.println("------------------------------------");
        System.out.println(bankAccount);
        System.out.println("------------------------------------");

        Product product = new Product();
        Inventory inventory = new Inventory();
        Warehouse warehouse = new Warehouse();

        product.setProductId(15634);
        product.setProductName("Dell Server");
        product.setPrice(3000.00);
        System.out.println(product);
        System.out.println("------------------------------------");
        inventory.setProduct(product);
        inventory.setQuantity(500);
        System.out.println(inventory);
        System.out.println("------------------------------------");
        warehouse.setWarehouseId(8865);
        warehouse.setWarehouseName("DXB");
        warehouse.setInventories("JOR");
        System.out.println(warehouse);
        System.out.println("------------------------------------");

        Student student = new Student();
        Course course = new Course();
        Enrollment enrollment = new Enrollment();
        student.setStudentId(5445);
        student.setStudentName("Deya Bakheet");
        course.setCourseId(489);
        course.setCourseName("Java EE");
        enrollment.setCourse(course);
        enrollment.setStudent(student);
        System.out.println(student);
        System.out.println("------------------------------------");
        System.out.println(course);
        System.out.println("------------------------------------");
        System.out.println(enrollment);
        System.out.println("------------------------------------");


    }
}