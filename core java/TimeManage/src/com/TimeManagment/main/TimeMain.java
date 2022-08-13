package com.TimeManagment.main;

import com.TimeManagment.time.Time;

public class TimeMain {
	public static void main(String[] args) {
		Time t1 = new Time();
		t1.Settime(1, 20);
		
		Time t2 = new Time();
		t2.Settime(1, 30);
		
		Time t3 = t2.sumtime(t1);
		
		t3.showtime();
	}
}
