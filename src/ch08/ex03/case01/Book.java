package ch08.ex03.case01;

import java.time.LocalDate;
import java.util.Objects;

public record Book(String title, int price, LocalDate printedDate) {
	public Book {
		Objects.requireNonNull(title);
		Objects.requireNonNull(printedDate);
	}
}

//record가 생성되려며 field가 생성되어야한다.