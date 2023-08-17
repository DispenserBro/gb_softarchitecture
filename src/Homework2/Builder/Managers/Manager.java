package Homework2.Builder.Managers;

import Homework2.Builder.Builders.Builder;
import Homework2.Builder.Components.*;
import Homework2.Builder.Computers.ComputerType;

public class Manager {
    public void createOfficePC(Builder builder) {
        builder.setComputerType(ComputerType.OFFICE);
        builder.setCPU(new CPU("1.5 GHz Dual Core"));
        builder.setGPU(new GPU("Integrated"));
        builder.setRAM(new RAM("1 x 8 GB"));
        builder.setROM(new ROM("500 GB"));
    }

    public void createGamingPC(Builder builder) {
        builder.setComputerType(ComputerType.GAMING);
        builder.setCPU(new CPU("3.5 GHz Octa Core"));
        builder.setGPU(new GPU("8 GB with Ray Tracing"));
        builder.setRAM(new RAM("4 x 8 GB"));
        builder.setROM(new ROM("3 TB"));
    }

    public void createProfessionalPC(Builder builder) {
        builder.setComputerType(ComputerType.PROFESSIONAL);
        builder.setCPU(new CPU("3.0 GHz Quad Core"));
        builder.setGPU(new GPU("16 GB with Ray Tracing"));
        builder.setRAM(new RAM("4 x 16 GB"));
        builder.setROM(new ROM("10 TB"));
    }
}
