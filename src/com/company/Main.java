package com.company;
/*
    Adam E. Ingram
    12/12/2019
*/

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
    }

    private static String getDurationString(int minutes, int seconds) {
        if(minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println(INVALID_VALUE_MESSAGE);
        }
        int hours = minutes / 60; // this will convert the minutes to hours
        int remainingMinutes = minutes % 60; //i need to understand this ***********
        String hoursString = hours + "h";
        if(hours < 10) {
            hoursString = "0" + hoursString;
        }
        String minuteString = remainingMinutes + "m";
        if(remainingMinutes < 10) {
            minuteString = "m" + minuteString;
        }
        String secondsString = seconds + "s";
        if(seconds < 10) {
            secondsString = "0" + secondsString;
        }
        return hoursString + " " + minuteString + " " + secondsString + " ";
    }

    private static String getDurationString(int seconds) {
        if(seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
}
