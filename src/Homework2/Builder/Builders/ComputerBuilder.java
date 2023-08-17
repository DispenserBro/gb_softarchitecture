package Homework2.Builder.Builders;

import Homework2.Builder.Components.*;
import Homework2.Builder.Computers.Computer;
import Homework2.Builder.Computers.ComputerType;

public class ComputerBuilder implements Builder{
    private ComputerType type;
    private CPU cpu;
    private GPU gpu;
    private RAM ram;
    private ROM rom;

    @Override
    public void setComputerType(ComputerType type) {
        this.type = type;
    }

    @Override
    public void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public void setGPU(GPU gpu) {
        this.gpu = gpu;
    }

    @Override
    public void setRAM(RAM ram) {
        this.ram = ram;
    }

    @Override
    public void setROM(ROM rom) {
        this.rom = rom;
    }

    public Computer getResult() {
        return new Computer(type, cpu, gpu, ram, rom);
    }
}
