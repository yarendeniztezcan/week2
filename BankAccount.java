package week2;
public class BankAccount {
    private static int objectCount = 0;
  public String getId; //********

    private String name;
    private int id;

    public BankAccount() {
        objectCount ++;
        id=objectCount;}

    public BankAccount(String a_name){
        objectCount ++;
        id=objectCount;
        name = a_name;}  
        
    public  int getId(){
        return id;}
        
    public String getName(){
        return name;}
        
    public static int numberOfAccounts(){
        return objectCount;}
        
    public int numbers_Accounts(){
        return objectCount;}    
}
