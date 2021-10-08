package za.ac.nwu.as.logic.config.flow;

import za.ac.nwu.as.domain.persistence.AccountTypeDto;

import java.util.List;

public interface FetchAccountTypeFlow {
    List<AccountTypeDto> getAllAccountTypes();

    AccountTypeDto getAccountTypeByMnemonic(String mnemonic);
}
