package za.ac.nwu.as.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Table(name = "DEMO_ACCOUNT_TX", schema = "VITRSA_SANDBOX")
public class AccountTransaction implements Serializable{

    private static final long serialVersionUID = -1420294317019175746L;
    private long transactionId;
    private long accountTypeId;
    private long memberId;
    private long amount;
    private LocalDate transactionDate;

    public AccountTransaction(){
    }

    public AccountTransaction(Long transactionId, Long accountTypeId, Long memeberId, Long amount, LocalDate transactionDate){
        this.transactionId = transactionId;
        this.accountTypeId = accountTypeId;
        this.memberId = memeberId;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }
    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC_SEQ", sequenceName = "VITRSA_SANDBOX>VIT_RSA_GENEIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")
    @Column(name = "TX_ID")
    public long getTransactionId(){
        return transactionId;
    }

    @Column(name = "ACCOUNT_TYPE_ID")
    public long getAccountTypeId(){
        return accountTypeId;
    }

    @Column(name = "MEMBER_ID")
    public long getMemberId(){
        return memberId;
    }

    @Column(name = "AMOUNT")
    public long getAmount(){
        return amount;
    }

    @Column(name = "TX_DATE")
    public LocalDate getTransactionDate(){
        return transactionDate;
    }

    public void setTransactionId(Long transactionId){
        this.transactionId = transactionId;
    }

    public void setAccountTypeId(Long accountTypeId){
        this.accountTypeId = accountTypeId;
    }

    public void setMemberId(Long memberId){
        this.memberId = memberId;
    }

    public void setAmount(Long amount){
        this.amount = amount;
    }

    public void setTransactionDate(LocalDate transactionDate){
        this.transactionDate = transactionDate;
    }
}
