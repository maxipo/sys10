package com.systex.main;
import java.util.Comparator;
import java.util.Objects;

public class MyDate implements Comparable<MyDate> {
    private int day;
    private int month;
    private int year;

    public static final Comparator<MyDate> MONTH_COMP = new Comparator<MyDate>() {
        @Override
        public int compare(MyDate o1, MyDate o2) {
            return o1.getMonth() - o2.getMonth();
        }
    };
    public static final Comparator<MyDate> DAY_COMP = new Comparator<MyDate>() {
        @Override
        public int compare(MyDate o1, MyDate o2) {
            return o1.getDay() - o2.getDay();
        }
    };

    public static final Comparator<MyDate> DATE_COMPARATOR = new Comparator<MyDate>() {
        @Override
        public int compare(MyDate o1, MyDate o2) {
            if (o1.getYear() - o2.getYear() == 0) {
                if (o1.getMonth() - o2.getMonth() == 0) {
                    return o1.getDay() - o2.getDay();
                }
                return o1.getMonth() - o2.getMonth();
            }
            return o1.getYear() - o2.getYear();
            }
    };

    public static final Comparator<MyDate> DATE_DESC_COMPARATOR = new Comparator<MyDate>() {
        @Override
        public int compare(MyDate o1, MyDate o2) {
            if (o2.getYear() - o1.getYear() == 0) {
                if (o2.getMonth() - o1.getMonth() == 0) {
                    return o2.getDay() - o1.getDay();
                }
                return o2.getMonth() - o1.getMonth();
            }
            return o2.getYear() - o1.getYear();
            }
    };
    public MyDate() {

    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay() {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth() {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear() {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate [day =" + day + ", month=" + month + ", year=" + year + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        MyDate other = (MyDate) obj;
        return day == other.day && month == other.month && year == other.year;
    }

    @Override
    public int compareTo(MyDate o) {
        return this.year - o.year;
    }
}
