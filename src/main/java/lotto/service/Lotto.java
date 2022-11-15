package lotto.service;

import static lotto.util.Constants.*;

import java.util.List;

public class Lotto {
	private final List<Integer> numbers;

	public Lotto(List<Integer> numbers) {
		validate(numbers);
		validateDuplicate(numbers);
		this.numbers = numbers;
	}

	private void validate(List<Integer> numbers) {
		if (numbers.size() != LOTTO_NUMBER_SIZE) {
			throw new IllegalArgumentException(ERROR_LOTTO_NUMBER_SIZE);
		}
	}

	private void validateDuplicate(List<Integer> numbers) {
		if(numbers.stream().distinct().count() != numbers.size()) {
			throw new IllegalArgumentException(ERROR_DUPLICATE);
		}
	}

	public boolean contains(Integer integer) {
		return numbers.contains(integer);
	}

	public List<Integer> getLotto() {
		return numbers;
	}

	public int size() {
		return numbers.size();
	}

	public int get(int i) {
		return numbers.get(i);
	}
}
