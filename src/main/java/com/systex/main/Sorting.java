package com.systex.main;
import java.util.Collections;
import java.util.LinkedList;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<MyDate> dates = new LinkedList<>();
		dates.add(new MyDate(13,9,2024));
		dates.add(new MyDate(11,8,2020));
		dates.add(new MyDate(5,12,2019));
		dates.add(new MyDate(8,10,2025));
		dates.add(new MyDate(25,2,2030));
		dates.add(new MyDate(30,1,2008));
		dates.add(new MyDate(22,3,2004));
		dates.add(new MyDate(17,7,2012));
		dates.add(new MyDate(19,6,2015));
		dates.add(new MyDate(18,6,2015));

		/*System.out.println("============yet sorted===========");
		dates.forEach(d->System.out.println(d));
		System.out.println("===============sorted=============");
		Collections.sort(dates);
		dates.forEach(d->System.out.println(d));*/
		System.out.println("=======sorted by month========");
		Collections.sort(dates, MyDate.MONTH_COMP);
		dates.forEach(d->System.out.println(d));
		System.out.println("=======sorted by DATE!!!!!!!!!!");
		Collections.sort(dates, MyDate.DATE_COMPARATOR);
		dates.forEach(d-> System.out.println(d));
		System.out.println("=======sorted by DATE in DESC!!!!!!!!!!");
		Collections.sort(dates, MyDate.DATE_DESC_COMPARATOR);
		dates.forEach(d-> System.out.println(d));

		/*
		System.out.println("=======sorted by day==========");
		Collections.sort(dates, MyDate.DAY_COMP);
		dates.forEach(d->System.out.println(d));
		System.out.println("=======sorted by day (Desc)==========");
		Collections.sort(dates, new DayComparator().reversed());
		dates.forEach(d->System.out.println(d));
		*/

	}

}
