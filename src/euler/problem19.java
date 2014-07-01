package euler;

public class problem19 {
//	1 Jan 1900 was a Monday.
//	Thirty days has September,
//	April, June and November.
//	All the rest have thirty-one,
//	Saving February alone,
//	Which has twenty-eight, rain or shine.
//	And on leap years, twenty-nine.
//	A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
//	How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?

	public static void main(String[] args){
		int numberOfSundays = 0;
		int dayOfTheWeek = 1; //Sunday is 0, Monday is 1, etc
		for(int year=1900;year<=2000;year++){
			for(int month=1;month<=12;month++){
				switch(month){
				case 1:
					dayOfTheWeek+=31;
					break;
				case 2:
					if(year%4==0){
						if(year%100==0){
							if(year%400==0){
								dayOfTheWeek+=29;
								break;
							}
							dayOfTheWeek+=28;
							break;
						}
						dayOfTheWeek+=29;
						break;
					}
					dayOfTheWeek+=28;
					break;
				case 3:
					dayOfTheWeek+=31;
					break;
				case 4:
					dayOfTheWeek+=30;
					break;
				case 5:
					dayOfTheWeek+=31;
					break;
				case 6:
					dayOfTheWeek+=30;
					break;
				case 7:
					dayOfTheWeek+=31;
					break;
				case 8:
					dayOfTheWeek+=31;
					break;
				case 9:
					dayOfTheWeek+=30;
					break;
				case 10:
					dayOfTheWeek+=31;
					break;
				case 11:
					dayOfTheWeek+=30;
					break;
				case 12:
					dayOfTheWeek+=31;
					break;
				}
				dayOfTheWeek = dayOfTheWeek%7;
				if(dayOfTheWeek==0){
					if(year!=1900){
						numberOfSundays++;
					}
				}
			}
		}
		System.out.println("There are "+numberOfSundays);
	}
}
