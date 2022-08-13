package practice;

import java.time.LocalDate;

public class Task {
	LocalDate date;
	String str;

	public Task(LocalDate date, String str) {
		this.date = date;
		this.str = str;
	}

	public LocalDate getDate() {
		return date;
	}

	public String toString() {
		return date + ":" + str;
	}
}
