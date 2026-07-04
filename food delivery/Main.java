class Chef extends Thread {
    public void run() {
        System.out.println("Chef: Cooking started...");
        try {
            Thread.sleep(3000);
            System.out.println("Chef: Food is ready.");
        } catch (InterruptedException e) {
            System.out.println("Exception"+e);
        }
        
    }
}

class Payment extends Thread {
    public void run() {
        System.out.println("Payment: Processing...");
        try {
            Thread.sleep(2000); 
            System.out.println("Payment: Successful.");
        }catch (InterruptedException e) {
            System.out.println("Exception"+e);
        }
    }
}

class Delivery extends Thread {
    public void run() {
        System.out.println("Delivery: Delivering food...");
        try {
            Thread.sleep(4000); 
             System.out.println("Delivery: Order delivered.");
        } catch (InterruptedException e) {
            System.out.println("Exception"+e);
        }
    }
}

public class Main{
    public static void main(String[] args) {
        System.out.println("ONLINE FOOD DELIVERY");
        System.out.println("Customer placed an order.");
        System.out.println();

        Chef t1 = new Chef();
        Payment t2 = new Payment();
        Delivery t3 = new Delivery();

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Exception"+e);
           
        }

        System.out.println();
        System.out.println("Order completed successfully.");
        System.out.println("Thank you for ordering!");
    }
}