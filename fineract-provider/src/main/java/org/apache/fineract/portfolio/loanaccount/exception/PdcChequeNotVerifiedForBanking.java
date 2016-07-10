package org.apache.fineract.portfolio.loanaccount.exception;

import org.apache.fineract.infrastructure.core.exception.AbstractPlatformResourceNotFoundException;

public class PdcChequeNotVerifiedForBanking extends AbstractPlatformResourceNotFoundException {

	public PdcChequeNotVerifiedForBanking(final String chequeNo) {
		super("error.msg.paymentinventorypdc.cheque.not.verified.for.banking", "PDC cheque: " + chequeNo + " please verify the status ",
				chequeNo);
	}
	

}
