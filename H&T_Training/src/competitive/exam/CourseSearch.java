package competitive.exam;

import java.util.ArrayList;
import java.util.List;

public class CourseSearch {

	public static void main(String[] args) {
		
		List<Course> courseList = new ArrayList<>();
		courseList.add(new Course(1, "JEE", "Mr.A", 3, 5000));
		courseList.add(new Course(2, "CAT", "Mr.A", 2.5, 3000));
		courseList.add(new Course(3, "NEET", "Mr.A", 5, 1500));
		courseList.add(new Course(4, "UPSC", "Mr.A", 6.3, 1250));
		courseList.add(new Course(5, "XAT", "Mr.A", 7, 2500));
		courseList.add(new Course(6, "IES", "Mr.A", 8.5, 7000));
		courseList.add(new Course(7, "SSC", "Mr.A", 4.5, 3000));
		courseList.add(new Course(8, "CLAT", "Mr.A", 6, 3500));
		courseList.add(new Course(9, "CDS", "Mr.A", 2.5, 8000));
		courseList.add(new Course(10, "LSAT", "Mr.A", 7.4, 8000));
		courseList.add(new Course(11, "NDA", "Mr.A", 1.5, 1500));
		courseList.add(new Course(12, "FCI", "Mr.A", 11, 8500));
		courseList.add(new Course(13, "CEED", "Mr.A", 4.8, 4250));
		courseList.add(new Course(14, "GATE", "Mr.A", 2, 2800));
		courseList.add(new Course(15, "IBPS", "Mr.A", 6.8, 6000));
		
		
		courseList.sort((c1, c2) -> {
			if(c1.getTotalFees() > c2.getTotalFees())
				return -1;
			else if(c1.getTotalFees() < c2.getTotalFees())
				return 1;
			else {
				
				if(c1.getCourseDuration() > c2.getCourseDuration()) {
					return 1;
				}
				else if(c1.getCourseDuration() < c2.getCourseDuration()) {
					return -1;
				}
				return 0;
			}
		});
		
		//courseList.forEach(c -> System.out.println(c.getTotalFees()+"--- "+c.getCourseDuration()));
		//courseList.forEach(System.out::println);
		
		List<Integer> num = new ArrayList<Integer>();
		List<Integer> num1 = new ArrayList<Integer>();
		num.add(10535);
		num1.add(10535);
		
		System.out.println( (long)num.get(0) ==  (long)num1.get(0));

	}

}
