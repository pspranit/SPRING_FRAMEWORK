package master;

public class Atm {

    private Printer print;

    public void setPrint(Printer print) {
        this.print = print;
    }

    void getInfo(int accNo)
    {
        print.printAccountBal(accNo);
    }
}
