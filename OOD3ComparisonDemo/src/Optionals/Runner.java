package Optionals;

public class Runner {

	public static void main(String[] args) {
		
		Computer computer = new Computer("HP");
		Motherboard motherboard = new Motherboard("Gigabyte") ;
		computer.setMotherboard(motherboard);
		
		System.out.println(computer.getModel().getMotherboard().getModel());
		
//		Defensive coding to prevent null pointer exception without Optional
//		Computer computer = new Computer("HP");
//		
//		Motherboard motherboard = computer.getMotherboard();
//
//		if (motherboard != null) {
//			Memory memoryChip = motherboard.getMemory();
//
//			if (memoryChip != null) {
//				memoryChip.accessData();
//			}
//		}


	}

}
