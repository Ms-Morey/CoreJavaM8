// june 17 hw
/**/
class Population
{ 
	public static void main(String[] args) 
	{	
		long current_Pop = 312032486;

		long seconds_5_Years = (365 * 24 * 60 * 60) *5;

		long births = seconds_5_Years/7;
		long deaths = seconds_5_Years/13;
		long immigrants = seconds_5_Years/45;

		long future_Pop = current_Pop + births - deaths + immigrants;

		System.out.println("The Population after 5 yers will be : "+ future_Pop+ " people");

	}
}