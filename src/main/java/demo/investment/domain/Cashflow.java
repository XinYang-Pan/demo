package demo.investment.domain;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cashflow {

	private double principal;
	private LocalDate date;

	public double getDayMoney(LocalDate end) {
		long days = ChronoUnit.DAYS.between(date, end);
		return days * principal;
	}

}
