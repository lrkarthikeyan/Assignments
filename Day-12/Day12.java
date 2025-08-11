import java.util.Scanner;

/* Qn - 1 1. Write a Java program to demonstrate multithreading by extending the Thread class.
--->Create a class MyThread that extends Thread.
--->Override the run() method to display the thread name and a message five times with a delay of 500 milliseconds between prints.
--->In the main() method, create two objects of MyThread and start them.
--->Each thread prints its message independently, showing concurrent execution.
‌*/

class MyThread extends Thread{

    @Override
    public void run(){
        try {
            for (int i = 0;i< 5;i++){
                Thread.sleep(500);
                System.out.println(getName());
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("First Thread");
        t1.start();
        t2.setName("Second Thread");
        t2.start();
    }

}

/* Qn - 2 2. Write a Java program to create a thread using the Runnable interface.
--->Create a class TaskRunner that implements Runnable.
--->Inside the run() method, print the current thread name and a task-specific message 10 times with a delay of 1000ms.
--->In the main() method, create two Thread objects passing different TaskRunner instances and start both threads.
--->The console should reflect the concurrent execution of both tasks.
‌*/

class TaskRunner implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(Thread.currentThread().getName().equals("Code")){
                System.out.println("Running the first thread : "+Thread.currentThread().getName());
            }
            else{
                System.out.println("Running the second thread : "+Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new TaskRunner(),"Code");
        Thread t2 = new Thread(new TaskRunner(),"Sleep");
        t1.start();
        t2.start();
    }

}

/*Qn - 3 Write a Java program where one thread prints only even numbers and another prints only odd numbers from 1 to 20. Synchronize the threads so that they print alternately (i.e., 1 2 3 4 ...).
*/

class OddPrint implements Runnable{
    UsingTheSynchronize printer;
    public OddPrint(UsingTheSynchronize printer){
        this.printer = printer;
    }
    @Override
    public void run(){
        printer.printOdd();
    }
}

class EvenPrint implements Runnable{
    UsingTheSynchronize printer;
    public EvenPrint(UsingTheSynchronize printer){
        this.printer = printer;
    }
    @Override
    public void run(){
        printer.printEven();
    }
}

class UsingTheSynchronize{
    int current = 1;
    int max = 20;
    public static void main(String[] args) {
        UsingTheSynchronize printer = new UsingTheSynchronize();
        Thread t1 = new Thread( new OddPrint(printer),"First thread");
        Thread t2 = new Thread( new EvenPrint(printer),"Second thread");
        t1.start();
        t2.start();
    }

    public synchronized void printOdd() {
        while (current <= max) {
            while (current % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (current <= max) {
                System.out.print(current + " ");
                current++;
                notifyAll();
            }
        }
    }

    public synchronized void printEven() {
        while (current <= max) {
            while (current % 2 == 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (current <= max) {
                System.out.print(current + " ");
                current++;
                notifyAll();
            }
        }
    }
}

/*Qn - 4 Create a Java program with a shared counter. Spawn 3 threads, where each thread increments the counter 1000 times. Use synchronization to avoid race conditions and display the final value.
 */

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class SharedCounter{
    public static void main(String[] args) {
        Counter counter = new Counter();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final counter value: " + counter.getCount());
    }
}

/*Qn - 5 5. Implement a basic producer-consumer problem using wait() and notify().
--->Producer thread should add items to a shared buffer.
--->Consumer thread should remove items.
Ensure the buffer size is limited to 5 items.. Use Threads to implement the ATM machine, 
where create thread to check the PIN number, another thread to perform the cash withdrawal, 
another one to check the balance amount and print the receipt.*/

class ATM {
    private final int PIN = 5678;
    private boolean isPin = false;
    private double balance;

    ATM(double balance) {
        this.balance = balance;
    }

    public synchronized void pinCheck(int num) {
        if (PIN == num) {
            isPin = true;
            System.out.println("Correct PIN");
        } else {
            isPin = false;
            System.out.println("Incorrect PIN.");
        }
    }

    public synchronized void cashWithdraw(double amount) {
        if (!isPin) {
            System.out.println("Please enter the correct PIN first.");
            return;
        }
        if (amount <= 0) {
            System.out.println("Enter a value greater than 0.");
            return;
        }
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Please collect your cash.");
            System.out.println("Updated Balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public synchronized void checkAmount() {
        if (!isPin) {
            System.out.println("Please enter the correct PIN.");
            return;
        }
        System.out.println("Current Balance: " + balance);
    }

    public synchronized void printReceipt() {
        if (!isPin) {
            System.out.println("Please enter the correct PIN.");
            return;
        }
        System.out.println("----- RECEIPT -----");
        System.out.println("Account Status: OK");
        System.out.println("Available Balance: " + balance);
        System.out.println("-------------------");
    }

}


class MainForATM {
    public static void main(String[] args) throws InterruptedException {
        ATM atm = new ATM(250000.00);
        boolean running = true;
        Scanner scan = new Scanner(System.in);
        while (running) {
            System.out.println("\nWelcome to PrimeBank ATM");
            System.out.println("1) Withdraw Cash");
            System.out.println("2) Check Balance");
            System.out.println("3) Exit");
            System.out.print("Enter your choice: ");

            int choice;
            if (scan.hasNextInt()) {
                choice = scan.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scan.next();
                continue;
            }

            if (choice == 1 || choice == 2) {
                System.out.print("Enter your 4-digit PIN: ");
                int pinNum;
                if (scan.hasNextInt()) {
                    pinNum = scan.nextInt();
                } else {
                    System.out.println("Invalid PIN input. Try again.");
                    scan.next();
                    continue;
                }

                Thread pin = new Thread(() -> atm.pinCheck(pinNum));
                pin.start();
                pin.join();
            }

            switch (choice) {
                case 1: {
                    System.out.print("Enter withdrawal amount: ");
                    double amount;
                    if (scan.hasNextDouble()) {
                        amount = scan.nextDouble();
                    } else {
                        System.out.println("Invalid amount input. Try again.");
                        scan.next();
                        break;
                    }

                    Thread withdrawThread = new Thread(() -> atm.cashWithdraw(amount));
                    withdrawThread.start();
                    withdrawThread.join();

                    Thread receiptThread = new Thread(atm::printReceipt);
                    receiptThread.start();
                    receiptThread.join();
                    break;
                }
                case 2: {
                    Thread checkBalThread = new Thread(atm::checkAmount);
                    checkBalThread.start();
                    checkBalThread.join();

                    Thread receiptThread = new Thread(atm::printReceipt);
                    receiptThread.start();
                    receiptThread.join();
                    break;
                }
                case 3: {
                    running = false;
                    System.out.println("Thank you for using PrimeBank ATM. Goodbye!");
                    break;
                }
                default: {
                    System.out.println("Please enter a valid choice (1-3).");
                    break;
                }
            }
        }

        scan.close();
    }

}
