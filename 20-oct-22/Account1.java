package prac20oct;
import java.util.Scanner;

public class Account1 {
	private double balance;
	private double interest;
    public Account1()
	{
		balance = 0;
		interest = 0;}
public Account1(double Balance, double Interest)
	{balance = Balance;
		interest = Interest;}
public void deposit(double amount)
	{balance = balance + amount;}
public void withdraw(double amount)
	{balance = balance - amount;}
public void addInterest()
	{balance = balance + balance * interest;}
public double getBalance()
	{
		return balance;  }}

