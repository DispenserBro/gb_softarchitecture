package Homework2.Builder.Builders;

import Homework2.Builder.Components.*;
import Homework2.Builder.Computers.ComputerType;

public interface Builder {
    void setComputerType(ComputerType type);
    void setCPU(CPU cpu);
    void setGPU(GPU gpu);
    void setRAM(RAM ram);
    void setROM(ROM rom);
}
