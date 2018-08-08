package demo.investment.domain;

import java.time.LocalDate;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class MultidayInvest extends AbstractInvest {

	private final CashflowList cashflowList = new CashflowList();
	private double interest;
	private LocalDate end = LocalDate.now();

	@Override
	public double getPrincipal() {
		return cashflowList.getPrincipal();
	}

	@Override
	public double getAvgDays() {
		return cashflowList.getAvgDays(end);
	}

}