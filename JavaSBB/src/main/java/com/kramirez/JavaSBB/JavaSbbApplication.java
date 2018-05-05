package com.kramirez.JavaSBB;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kramirez.JavaSBB.models.Course;
import com.kramirez.JavaSBB.models.Semester;

@SpringBootApplication
public class JavaSbbApplication {
	static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

	public static void main(String[] args) {
		SpringApplication.run(JavaSbbApplication.class, args);
		
		DayOfWeek m = DayOfWeek.MONDAY;
		DayOfWeek t = DayOfWeek.TUESDAY;
		DayOfWeek w = DayOfWeek.WEDNESDAY;
		DayOfWeek r = DayOfWeek.THURSDAY;
		DayOfWeek f = DayOfWeek.FRIDAY;
		ArrayList<DayOfWeek> mw = new ArrayList<DayOfWeek>();
		ArrayList<DayOfWeek> tr = new ArrayList<DayOfWeek>();
		mw.add(m);
		mw.add(w);
		tr.add(t);
		tr.add(r);
		Calendar eightAM = Calendar.getInstance();
		Calendar nine = Calendar.getInstance();
		Calendar ten = Calendar.getInstance();
		Calendar eleven = Calendar.getInstance();
		Calendar noon = Calendar.getInstance();
		Calendar one = Calendar.getInstance();
		eightAM.set(Calendar.HOUR_OF_DAY, 8);
		nine.set(Calendar.HOUR_OF_DAY, 8);
		ten.set(Calendar.HOUR_OF_DAY, 9);
		eleven.set(Calendar.HOUR_OF_DAY, 11);
		noon.set(Calendar.HOUR_OF_DAY, 12);
		one.set(Calendar.HOUR_OF_DAY, 13);
		Semester winter = new Semester("Winter 2017");
		Semester fall = new Semester("Fall 2016");
		Semester spring = new Semester("Spring 2017");
	

		Course algos = new Course(eightAM, mw, fall, "Algorithms", "Jeff");
		Course java = new Course(nine, tr, fall, "Java", "Jack");
		Course ruby = new Course(ten, mw, fall, "Ruby On Rails", "Chris");
		Course data = new Course(eleven, tr, fall, "Data Structures", "Lucy");
		Course mean = new Course(noon, mw, fall, "MEAN", "Ray");
		Course python = new Course(one, tr, fall, "Python", "Noelle");
		Course git = new Course(eightAM, tr, winter, "GitHub", "Donovan");
		Course csharp = new Course(nine, mw, winter, "C#", "Noelle");
		Course algo2 = new Course(ten, tr, winter, "Algorithms", "Michelle");
		Course sql = new Course(eleven, mw, winter, "SQL", "Winthrop");
		Course linux = new Course(noon, tr, winter, "Algorithms", "Jeff");
		Course java2 = new Course(one, mw, winter, "Java", "Tim");
		Course algos3 = new Course(eightAM, tr, spring, "Algorithms", "Jeff");
		
	}
}
