package comparison;

import java.util.Comparator;

public class NameComparator implements Comparator<Trainee> {

	@Override
	public int compare(Trainee s1, Trainee s2) {
		
		return s1.getName().compareTo(s2.getName());
	}

}
