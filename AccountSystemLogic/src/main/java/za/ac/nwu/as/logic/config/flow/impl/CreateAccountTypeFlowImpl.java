package za.ac.nwu.as.logic.config.flow.impl;

import org.springframework.stereotype.Component;
import translator.AccountTypeTranslator;
import za.ac.nwu.as.domain.persistence.AccountTypeDto;
import za.ac.nwu.as.logic.config.flow.CreateAccountTypeFlow;

import javax.transaction.Transactional;
import java.time.LocalDate;

@Transactional
@Component("createAccountTypeName")
public class CreateAccountTypeFlowImpl implements CreateAccountTypeFlow {

    private final AccountTypeTranslator accountTypeTranslator;

    public CreateAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator){
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
    public AccountTypeDto create(AccountTypeDto accountType){
        if (null == accountType.getCreationDate()){
            accountType.setCreationDate(LocalDate.now());
        }
        return accountTypeTranslator.create(accountType);
    }

    public boolean methodToTest() {
        return  true;
    }
}
