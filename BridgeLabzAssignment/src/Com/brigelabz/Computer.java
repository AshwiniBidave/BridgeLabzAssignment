
package Com.brigelabz;
public class Computer {
    private String processor;
    private int RAM;
    private int storage;

    public Computer(String processor, int RAM, int storage) {
        this.processor = processor;
        this.RAM = RAM;
        this.storage = storage;
    }

    public void printSpecs() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + RAM + "GB");
        System.out.println("Storage: " + storage + "GB");
    }

    public double calculatePrice() {
        // Calculate the price based on the processor, RAM, and storage capacity
        double basePrice = 500.0;
        double processorPrice = 0.0;
        double RAMPrice = 0.0;
        double storagePrice = 0.0;

        // Calculate processor price
        if (processor.equals("i3")) {
            processorPrice = 100.0;
        } else if (processor.equals("i5")) {
            processorPrice = 200.0;
        } else if (processor.equals("i7")) {
            processorPrice = 300.0;
        }

        // Calculate RAM price
        if (RAM == 4) {
            RAMPrice = 50.0;
        } else if (RAM == 8) {
            RAMPrice = 100.0;
        } else if (RAM == 16) {
            RAMPrice = 200.0;
        }

        // Calculate storage price
        if (storage == 256) {
            storagePrice = 50.0;
        } else if (storage == 512) {
            storagePrice = 100.0;
        } else if (storage == 1024) {
            storagePrice = 200.0;
        }

        return basePrice + processorPrice + RAMPrice + storagePrice;
    }

    public static void main(String[] args) {
    	//computer object

        Computer myComputer = new Computer("i5", 8, 512);

        // Print the computer's specifications
        myComputer.printSpecs();

        // Calculate and print the computer's price
        double totalPrice = myComputer.calculatePrice();
        System.out.println("Price: $" + totalPrice);
    }
}
