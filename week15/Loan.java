package test14;

import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private double loanAmount;
    private int numberOfYears;
    private Date loanDate;

    public Loan(){
        this(2.5,1,1000);
    }
    public Loan(double annualInterestRate, double loanAmount, int numberOfYears) {
        this.annualInterestRate = annualInterestRate;
        this.loanAmount = loanAmount;
        this.numberOfYears = numberOfYears;
        this.loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public double getLoanAmount() {
        return loanAmount;
    }
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    public int getNumberOfYears() {
        return numberOfYears;
    }
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }


    public Date getLoanDate() {
        return loanDate;
    }
    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate/(12*100);
        double f =(1-(1/Math.pow(1+monthlyInterestRate,numberOfYears*12)));
        double monthlyPayment = loanAmount*monthlyInterestRate/f;
        return monthlyPayment;
    }

    public double getTotalPayment(){
        double totalPayment =getMonthlyPayment()*numberOfYears*12;
        return totalPayment;
    }


}
