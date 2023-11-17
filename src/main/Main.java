package main;

import bank.BankAccount;
import inventory.Inventory;
import inventory.Product;
import inventory.Warehouse;

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
    }
}