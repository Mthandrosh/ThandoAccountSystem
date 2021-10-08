package za.ac.nwu.as.logic.config.flow;

import za.ac.nwu.as.domain.persistence.AccountTypeDto;

public interface CreateAccountTypeFlow {
    AccountTypeDto create(AccountTypeDto accountType);
}
