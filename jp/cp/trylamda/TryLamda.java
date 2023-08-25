package jp.cp.trylamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TryLamda {
	public static void main(String[] args) {
		Runnable runner = () -> { System.out.println("Lamda2"); };
		runner.run();
		
		// Function
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		Function<List<Integer>,String> functionLamda = (i) -> {int b = 0; for(Integer aa : i) {b+=aa;}; return b+"やで。";};
		String result = functionLamda.apply(list);
		System.out.println(result);
		
		// Consumer
		Consumer<String> buyer = (goods) -> { System.out.println(goods + "を購入しました。"); };
		buyer.accept("おにぎり");
		
		// Predicate
		Predicate<String> checker = (s) -> {return s.equals("Java");};
		boolean resultPre = checker.test("Java");
		System.out.println(resultPre);
		
		// StreamAPI
		list.stream().forEach(i -> {System.out.println(i+" ");});
		
	}
}
