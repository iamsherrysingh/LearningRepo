package model.shopdb.collections;

public class Specs {
	String cpu, ram, gpu;

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	@Override
	public String toString() {
		return "Specs [cpu=" + cpu + ", ram=" + ram + ", gpu=" + gpu + "]";
	}
	
}
