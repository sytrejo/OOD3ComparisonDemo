package comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		
		Trainee t1 = new Trainee( 1, "Lisa", "1111111", 31);
		Trainee t2 = new Trainee( 22, "Kerry", "2222222", 42);
		Trainee t3 = new Trainee( 3, "Kim", "1313131", 33);
		Trainee t4 = new Trainee( 4, "Mark", "6666666", 16);
		
		List<Trainee> trainees = new ArrayList<>();
		
		trainees.add(t1);
		trainees.add(t2);
		trainees.add(t3);
		trainees.add(t4);
		
		System.out.println(trainees);
		
		for(int i = 0; i< trainees.size(); i++) {
			System.out.println(trainees.get(i));
		}
		
		for(Trainee trainee : trainees) {
			System.out.println(trainee);
		}
		
		
		Collections.sort(trainees);
		
		System.out.println(trainees);
		
		
		
		System.out.println("**************Sorted by name ***********");
		Collections.sort(trainees, new NameComparator());
		for(Trainee trainee : trainees) {
			System.out.println(trainee);
		}
		
		System.out.println("**************Sorted by Age ***********");
		Collections.sort(trainees, new AgeComperator());
//		for(Trainee trainee : trainees) {
//			System.out.println(trainee);
//		}
		printList(trainees);

		

	}
	
	public static void printList(List<Trainee> trainees){
		for(Trainee trainee : trainees) {
			System.out.println(trainee);
		}
		
	}

}
