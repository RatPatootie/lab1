package Customer;


public class Customer {
    protected int customerId;
    protected String lastname;
    protected String firstname;
    protected String patronymic;
    protected String adress;
    protected long cardNum;
    protected int amount;

    public Customer(int customerId, String lastname, String firstname, String patronymic, String adress, long cardNum, int amount) {
        this.customerId = customerId;
        this.lastname = lastname;
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.adress = adress;
        this.cardNum = cardNum;
        this.amount = amount;
    }

    public int getCustomerId() {
        return customerId;
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

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customerId +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", adress='" + adress + '\'' +
                ", cardNum=" + cardNum +
                ", amount=" + amount +
                '}';
    }
}

