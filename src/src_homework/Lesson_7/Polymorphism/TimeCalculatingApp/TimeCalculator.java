package src_homework.Lesson_7.Polymorphism.TimeCalculatingApp;

public class TimeCalculator {
    public boolean isValidTimeFormat(String time) {
        return time.matches("([01]\\d|2[0-3]):[0-5]\\d");
    }

    public String calculateDifference(int hour1, int minute1, int hour2, int minute2) {
        if (hour1 < 0 || hour1 > 23 || hour2 < 0 || hour2 > 23 || minute1 < 0 || minute1 > 59 || minute2 < 0 || minute2 > 59) {
            return "Invalid time values. Hours should be 0-23 and minutes 0-59.";
        }
        int minuteDif = minute2 - minute1;
        return getString(minuteDif, hour2, hour1);
    }

    public String calculateDifference(String time1, String time2) {
        if (isValidTimeFormat(time1) && isValidTimeFormat(time2)) {
            int minuteDif = Integer.parseInt(time2.substring(3, 5)) - Integer.parseInt(time1.substring(3, 5));
            int hour2 = Integer.parseInt(time2.substring(0, 2));
            int hour1 = Integer.parseInt(time1.substring(0, 2));
            return getString(minuteDif, hour2, hour1);
        }
        return "Invalid time format. Please use HH:mm format (00:00 to 23:59).";
    }

    private String getString(int minuteDif, int hour2, int hour1) {

        if (minuteDif < 0) {
            minuteDif = 60 + minuteDif;
            hour2--;
        }
        int hourDif = hour2 - hour1;

        if (hourDif < 0) {
            hourDif = 24 + hourDif;
        }
        return "There is " + hourDif + " hour " + minuteDif + " minutes difference.";
    }
}
