package model;

public class Specs {
	String CPU, RAM, GPU;

	public String getCPU() {
		return CPU;
	}

	public void setCPU(String cPU) {
		CPU = cPU;
	}

	public String getRAM() {
		return RAM;
	}

	public void setRAM(String rAM) {
		RAM = rAM;
	}

	public String getGPU() {
		return GPU;
	}

	public void setGPU(String gPU) {
		GPU = gPU;
	}

	@Override
	public String toString() {
		return "Specs [CPU=" + CPU + ", RAM=" + RAM + ", GPU=" + GPU + "]";
	}
}
