import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPrac {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		list.stream().filter(e -> e % 2 == 0).forEach(System.out::println);

		List<Integer> even = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		System.out.println(even);

		even.stream().map(e -> e * e).forEach(System.out::println);
		
		List<Integer> odd = list.stream().filter(e->e % 2!=0).map(e -> e*e).collect(Collectors.toList());
		System.out.println(odd);
		
		
		
	}

}
