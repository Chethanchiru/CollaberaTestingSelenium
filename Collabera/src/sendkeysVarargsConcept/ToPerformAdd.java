package sendkeysVarargsConcept;

public class ToPerformAdd  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cr=new RemoteCalculator();
		
		System.out.println(cr.add(10,20,30));
		
		System.out.println(cr.add(23,43));
		
		System.out.println(cr.add(15,25,33,10,20,30));
	}

}
