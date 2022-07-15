package Optionals;

import java.util.Optional;

public class Motherboard {
	
	private String model;
	private Memory memory;
	
	public Motherboard(String model) {
		this.model = model;
	}

	public Optional<String> getModel() {
		return Optional.ofNullable(model);
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Optional<Memory> getMemory() {
		return Optional.ofNullable(memory);
	}

	public void setMemory(Memory memory) {
		this.memory = memory;
	}

}
