package Esercizio2.model.CCExceptions;

public class CcFailedWithdrawException extends  RuntimeException{
    Double balance;
    Double withdrawl_money;
    public CcFailedWithdrawException(Double av_balance,Double money){
        this.balance = av_balance;
        this.withdrawl_money = money;
    }

    @Override
    public String getMessage() {
        String s = "Available balance isn't enought:\nBALANCE: "+balance+"\t"+"WITHDRAWL REQUEST: "+withdrawl_money;
        return s;
    }
}
