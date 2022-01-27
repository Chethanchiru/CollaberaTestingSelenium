package basics;

public class String {

	public static void main(java.lang.String[] args) {
			java.lang.String priceString = "₹64,999";
			int price = 0;
			
			for(int i=0; i<priceString.length(); i++)
			{
				if(priceString.charAt(i) > 47 && priceString.charAt(i) < 58) 
				{
					price  = price * 10 + (int)(priceString.charAt(i)-48);
				}
			}		
			System.out.println(price);
		}
	}


