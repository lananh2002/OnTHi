package De2;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Manager manager = new Manager("ACD", "Lan Anh", LocalDate.of(2023,8,8), 40, 50);
		System.out.println(manager );
		System.out.println("thah tien cua manager: "+manager.tinhTien());
		
		Programer programer = new Programer("DASS", "Hoang", LocalDate.of(2023,8,6), 30, 40, 40);
		System.out.println(programer);
		System.out.println("thanh tien cua programer: "+programer.tinhTien()+"\n");
		
		Designer designer = new Designer("DFG", "Nguyen A", LocalDate.of(2022,6,8), 05, 40, 60);
		System.out.println(designer);
		System.out.println("thanh tien cua designer: "+designer.tinhTien());
		
		
		Tester tester = new Tester("FDGS", "Le B", LocalDate.of(2002,7,8), 30, 40, 340);
		System.out.println(tester);
		System.out.println("thanh tien cua tester: "+tester.tinhTien());
		
		
		
	}
}
