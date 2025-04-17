class Cricket
{
	public static void main(String[] args)
{	
	String tournamentName = "T20WorldCup2024";
	byte tournamentEdition = 8;
	short noMatches = 40;
	int averageViewership = 1250000;
	int totalOTTViewership = 4500000;
	long totalViewership = 50000000;
	char ticketClass = 'S';
	
	System.out.println("*** T20 World Cup 2024 ***");
	System.out.println("Name of Tournament :"+ tournamentName);
	System.out.println("Tournament Edition is :" + tournamentEdition +"th Edition");
	System.out.println("Number of Matches :"+ noMatches);
	System.out.println("Average Viewership of a match :"+ averageViewership);
	System.out.println("OTT Viewership Total : " +totalOTTViewership);
	System.out.println(" Total Viewership of the Tournament : " +totalViewership);
	System.out.println("Ticket class is : " +ticketClass);
}
}