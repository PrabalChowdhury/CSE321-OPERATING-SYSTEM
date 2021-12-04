class myThread extends Thread {

    public myThread (String name) {
        super (name);
    }
    public void run () {
        if(getName().equals("House Stark")){
            System.out.println("The house is: " + getName());
        }
        else if(getName().equals("House Targaryen")){
            System.out.println("The house is: " + getName());
        }
        else if(getName().equals("House Lannister")){
            System.out.println("The house is: " + getName());
        }
        else if(getName().equals("House Bolton")){
            System.out.println("The house is: " + getName());
        }
        else if(getName().equals("House Tyrell")){
            System.out.println("The house is: " + getName());
        }
    }
}

public class threadTest2 {
    public static void main (String [] args) {

    myThread Thread1 = new myThread ("House Stark");
    myThread Thread2 = new myThread ("House Targaryen");
    myThread Thread3 = new myThread ("House Lannister");
    myThread Thread4 = new myThread ("House Bolton");
    myThread Thread5 = new myThread ("House Tyrell");

    Thread1.setPriority(Thread.MAX_PRIORITY);
    Thread4.setPriority(Thread.MIN_PRIORITY);

    Thread1.start();
    Thread2.start();
    Thread3.start();
    Thread4.start();
    Thread5.start();

    }
}
