
public class Time {

	long hour;
	long minute;
	long second;
	
	Time(){			// sets time to current time
		second = (System.currentTimeMillis() / 1000) % 60;
		minute = (System.currentTimeMillis() / 1000 / 60) % 60;
		hour = (System.currentTimeMillis() / 1000 / 60 / 60) % 24;
	}
	
	Time(long time){	// sets time given a specified time since January 1, 1970 in milliseconds
		second = (time / 1000) % 60;
		minute = (time / 1000 / 60) % 60;
		hour = (time / 1000 / 60 / 60) % 24;
	}
	
	Time(long hours, long minutes, long seconds){		// sets time given a specific hour, minute and second
		second = seconds;
		minute = minutes;
		hour = hours;
	}
	
	long getSecond(){	// returns seconds
		return second;
	}
	
	long getMinute(){	// returns minutes
		return minute;
	}
	
	long getHour(){		// returns hours
		return hour;
	}
	
	void setTime(long elapseTime){		// resets time with a new time in milliseconds
		second = (elapseTime / 1000) % 60;
		minute = (elapseTime / 1000 / 60) % 60;
		hour = (elapseTime / 1000 / 60 / 60) % 24;
	}
}
