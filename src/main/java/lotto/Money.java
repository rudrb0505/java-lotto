package lotto;

import camp.nextstep.edu.missionutils.Console;

public class Money {
	public Money() {
	}

	public static void inputMoney() {
		System.out.println("구입금액을 입력해 주세요.");
		String userInput = Console.readLine();
		checkMoneyInput(userInput);
	}

	public static void checkMoneyInput(String input) {
		throw new IllegalArgumentException();
	}
}
