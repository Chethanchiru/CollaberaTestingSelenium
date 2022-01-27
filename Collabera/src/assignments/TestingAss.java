package assignments;

public class TestingAss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(AssignmentExcelLib.readStringData("Sheet1", 0, 0));// output:- Collabera
		
		System.out.println(AssignmentExcelLib.readNumberData("Sheet3", 11, 5));// output:- 7.0
		
		System.out.println(AssignmentExcelLib.readbooleanData("Sheet2", 4, 11));// output:- true
		
		System.out.println(AssignmentExcelLib.readDateData("Sheet3", 6, 10));// output:- 1996-08-05T00:00
	}

}




