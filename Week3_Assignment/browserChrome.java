package week3.day4;

public class browserChrome extends Browser {
	
	// Overloading example
	
	public void openURL()
	{
		super.openURL();
		System.out.println("Opening the URL in Chrome");
	}
	
	public void openIncognito()
	{
		System.out.println("Just opened");
	}
	public void clearCache()
	{
		System.out.println("Cache cleared");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		browserChrome M1 = new browserChrome();
		M1.openURL();
		M1.navigateBack();

	}

}
