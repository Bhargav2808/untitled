package Oops;

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public int getAge(){
        return 2023-Integer.parseInt(birthDate);
    }
    public double collectPay(double amount){
        return amount;
    }

    public void terminate(String endDate){
        if(Integer.parseInt(endDate)<2023)
        System.out.println(this.name + " is terminated.. ");

        else System.out.println("EndDate didn't Come yet..");
    }
}
