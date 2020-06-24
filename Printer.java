class PrintEvenTask implements Runnable{
    Printer printer;
    int max;
    PrintEvenTask(Printer printer, int max){
        this.printer = printer;
        this.max = max;
    }
    @Override
    public void run() {
        for(int i = 2; i <= max; i+=2){        
            printer.printEven(i);
        }   
    }
}
 
class PrintOddTask implements Runnable{
    Printer printer;
    int max;
    PrintOddTask(Printer printer, int max){
        this.printer = printer;
        this.max = max;
    }
    @Override
    public void run() {
        for(int i = 1; i <= max; i+=2){
            printer.printOdd(i);
        }   
    }
}
 
public class Printer {
    boolean evenFlag = false;
    public void printEven(int num){
        synchronized (this) {
            while(!evenFlag){
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("Thread Interrupted" + e.getMessage());
                }
            }
            System.out.println(Thread.currentThread().getName() + " - " + num);
            evenFlag = false;
      
            notify();
        }
    }
    
    public void printOdd(int num){
        synchronized (this) {
            while(evenFlag){
                try {                  
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("Thread Interrupted" + e.getMessage());
                }
            }
            System.out.println(Thread.currentThread().getName() + " - " + num);
            evenFlag = true;            
            notify();
        }
    }
    public static void main(String[] args) {
        Printer printer = new Printer();     
        Thread t1 = new Thread(new PrintOddTask(printer, 10), "Odd");
        Thread t2 = new Thread(new PrintEvenTask(printer, 10), "Even");
        t1.start();
        t2.start();
    }
}