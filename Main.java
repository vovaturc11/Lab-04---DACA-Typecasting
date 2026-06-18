// YOUR NAME: Volodymyr Turchanskyi
// COLLABORATORS:  
// DATE: 06/18/2026

public class Main
{
	public static void main(String[] args)
	{
		// DECLARATION SECTION
		int dacaRecipients;
		long totalFederalTaxes;
		double averageDacaContribution;
		int roundedDownTaxContribution;
		String stateName;
		// INITIALIZATION SECTION
		char characterFirst = 'c';
		char characterSecond = 'a';
		dacaRecipients = 700000;
		totalFederalTaxes = 60000000000L;
		// INPUT SECTION
		// N/A (no input for this lab)
		
		// CALCULATION & PROCESSING SECTION
		averageDacaContribution = (double) totalFederalTaxes/dacaRecipients;
		roundedDownTaxContribution = (int) averageDacaContribution;
		stateName = "" + (char) (characterFirst - 32) + (char) (characterSecond - 32);
		// OUTPUT SECTION
		System.out.println("Average DACA-recipient Tax Contribution: " + averageDacaContribution);
		System.out.println("Rounded down to nearest whole dollar: $" + roundedDownTaxContribution);
		System.out.println("State with most DACA recipients: " + stateName);

	}
}