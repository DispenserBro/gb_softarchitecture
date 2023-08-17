package Homework2.Builder.Computers;

import Homework2.Builder.Components.*;

public class Computer {
    private final ComputerType type;
    private final CPU cpu;
    private final GPU gpu;
    private final RAM ram;
    private final ROM rom;

    public Computer(ComputerType type, CPU cpu, GPU gpu, RAM ram, ROM rom) {
        this.type = type;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.rom = rom;
    }

    @Override
    public String toString() {
        return "-------------\n" + type.toString() + "\nCPU: " + cpu.model + "\nGPU: " +
                gpu.model + "\nRAM: " + ram.model + "\nROM: " + rom.model + "\n";
    }
}
