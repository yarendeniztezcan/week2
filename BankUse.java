package week2;
public class BankUse{
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();
         System.out.println("a1 account:"+a1.getId+","+a1.getName());

        BankAccount a2 = new BankAccount();
        System.out.println("a2 account:"+a2.getId+","+a2.getName());

        String [] names={"AYSE","ALI","AHMET"," VELI","OSMAN"};
        BankAccount [] account = new BankAccount[5];

        for (int i=0; i<account.length; i++){
            account[i] = new BankAccount(names[i]);
            System.out.println(i+".account:"+account[i].getId()+","+account[i].getName()) ;     }

        System.out.println(BankAccount.numberOfAccounts());
        System.out.println(a1.numbers_Accounts()+","+a2.numbers_Accounts());
    }
}
