package arrayInJavaQs;

class Computer{
    public void shutDown(){
        System.out.println("Computer is shutting down....");
    }
}


interface Phone{
    public void call();
}

public class AnonymousClass {
    public static void main(String[] args) {
        Computer computer1 = new Computer() {
            //we can overWrite out shutDown Mtehod here....like
            //System.out.println("Macbok is shutting down....");
            public void shutDown() {
                System.out.println("Macbook is shutting down....");
            }
        };
        computer1.shutDown();

        //OVERRIDE ...THE PHONE INTERFACE....
        Phone phone1 = new Phone(){
            public void call(){
                System.out.println("I am from interface overirde...");
            }
        };
        phone1.call();
    }
}
