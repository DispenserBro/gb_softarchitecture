package Homework2.Builder;

import Homework2.Builder.Builders.ComputerBuilder;
import Homework2.Builder.Computers.Computer;
import Homework2.Builder.Managers.Manager;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        ComputerBuilder builder = new ComputerBuilder();
        manager.createGamingPC(builder);

        Computer comp1 = builder.getResult();
        System.out.println(comp1);

        manager.createOfficePC(builder);

        Computer comp2 = builder.getResult();
        System.out.println(comp2);

        manager.createProfessionalPC(builder);

        Computer comp3 = builder.getResult();
        System.out.println(comp3);
    }
}
