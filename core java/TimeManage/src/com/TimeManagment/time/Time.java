package com.TimeManagment.time;

public class Time {
int hours;
int minutes;
public void Settime(int hours,int minutes)
{
	this.hours=hours;
	this.minutes=minutes;
}
public void showtime()
{
	System.out.println("Your hours and minutes are"+" "+hours+" "+minutes);
}
 public Time sumtime(Time time)
{
	 Time t = new Time();

		int totalHours = this.hours + time.hours;
		int totalMinutes = this.minutes + time.minutes;

		t.Settime(totalHours, totalMinutes);

		return t;
}
}
