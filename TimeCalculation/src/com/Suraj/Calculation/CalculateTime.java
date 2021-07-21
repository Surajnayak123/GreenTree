package com.Suraj.Calculation;

public class CalculateTime {
	public String getDurationString(int minutes, int seconds) {
        String string = "";
        int secondsSum = minutes * 60 + seconds;
        if (minutes >= 0 && seconds >= 0 && seconds <=59) {
            string = ((int) (secondsSum / 3600) + "h " + ((secondsSum % 3600) / 60) + "m " + (secondsSum % 60) + "s");
        } else {
           return "Invalid value";
        }
        return string;
    }

    public String getDurationString(int seconds) {
        String string = "";
        if (seconds >= 0) {
            string = getDurationString(seconds/60, seconds % 60);
        }else {
        	return "Invalid value";
        }
        return string;
    }
	
}

