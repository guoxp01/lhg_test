package gxp;

import java.text.NumberFormat;

public class FormatAmt {
	public String amount(int dollars, int cents){
		NumberFormat format = NumberFormat.getInstance();
		format.setMinimumFractionDigits(2);
		format.setMaximumFractionDigits(2);
		format.setMaximumIntegerDigits(40);
		format.setMinimumIntegerDigits(1);
		return "$"+format.format(dollars+0.01*cents);
	}
}
