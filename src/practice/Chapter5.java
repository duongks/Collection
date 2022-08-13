package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Chapter5 {
	public static void main(String[] args) {

		LocalDate d1 = LocalDate.of(2021, 10, 21);
		LocalDate d2 = LocalDate.of(2021, 9, 15);
		LocalDate d3 = LocalDate.of(2021, 12, 4);
		LocalDate d4 = LocalDate.of(2021, 8, 10);
		LocalDate d5 = LocalDate.of(2021, 11, 9);

		String s1 = "牛乳を買う";
		String s2 = "○○社面談";
		String s3 = "手帳を買う";
		String s4 = "散髪に行く";
		String s5 = "スクールの課題を解く";

		Task task1 = new Task(d1, s1);
		Task task2 = new Task(d2, s2);
		Task task3 = new Task(d3, s3);
		Task task4 = new Task(d4, s4);
		Task task5 = new Task(d5, s5);

		List<Task> listTasks = new ArrayList<>();

		listTasks.add(task1);
		listTasks.add(task2);
		listTasks.add(task3);
		listTasks.add(task4);
		listTasks.add(task5);

		Collections.sort(listTasks, new Comparator<Task>() {

			@Override
			public int compare(Task o1, Task o2) {
				// TODO 自動生成されたメソッド・スタブ
				return o1.getDate().compareTo(o2.getDate());
			}

		});
		for (Task tasks : listTasks) {
			System.out.println(tasks.toString());
		}
	}
}
