package org.apache.fineract.portfolio.loanaccount.handler;

import org.apache.fineract.commands.annotation.CommandType;
import org.apache.fineract.commands.handler.NewCommandSourceHandler;
import org.apache.fineract.infrastructure.core.api.JsonCommand;
import org.apache.fineract.infrastructure.core.data.CommandProcessingResult;
import org.apache.fineract.portfolio.loanaccount.service.LoanWritePlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@CommandType(entity = "PAYMENTINVENTORY", action = "UPDATE")
public class UpdatePaymentInventoryCommandHandler implements NewCommandSourceHandler {
    
    private final LoanWritePlatformService writePlatformService;

    @Autowired 
    public UpdatePaymentInventoryCommandHandler(final LoanWritePlatformService writePlatformService) {
        this.writePlatformService = writePlatformService;
    }
    
    @Transactional
    @Override
    public CommandProcessingResult processCommand(JsonCommand command) {
        return this.writePlatformService.updatePaymentInventory(command.getLoanId(), command.entityId(), command);
    }

}
