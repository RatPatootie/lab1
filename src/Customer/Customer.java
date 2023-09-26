package Customer;


public class Customer {
    protected int customer_id;
    protected String lastname;
    protected String firstname;
    protected String patronymic;
    protected String adress;
    protected long cardNum;
    protected int amount;
public Customer (int customer_id,String lastname,String firstname,String patronymic,String adress,long cardNum,int amount){
    this.customer_id=customer_id;
    this.lastname=lastname;
    this.firstname=firstname;
    this.patronymic=patronymic;
    this.adress=adress;
    this.cardNum=cardNum;
    this.amount=amount;
}

    public int getCustomer_id() {
        return customer_id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAdress() {
        return adress;
    }

    public long getCardNum() {
        return cardNum;
    }

    public int getAmount() {
        return amount;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setCardNum(long cardNum) {
        this.cardNum = cardNum;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    //  @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", adress='" + adress + '\'' +
                ", cardNum=" + cardNum +
                ", amount=" + amount +
                '}';
    }
}

