package org.apache.fineract.portfolio.loanaccount.exception;

import org.apache.fineract.infrastructure.core.exception.AbstractPlatformResourceNotFoundException;

public class NumberOfChequesExceededLoanTermException extends AbstractPlatformResourceNotFoundException {

    public NumberOfChequesExceededLoanTermException(final Long NumberOfCheques) {
        super("err.msg.numberOfCheques.exceeded.LoanTerm", "Number Of Cheques " + NumberOfCheques + "exceeded Loan Term", NumberOfCheques);
    }
    
    

}
