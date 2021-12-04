package com.bank;

import java.util.Scanner;

import com.bank.model.CustomerDetails;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDetails custArray[] = new CustomerDetails[10];
		int j = 0;
		double availBalace = 0;
		long accountNo = 100;
		String name = "Branch";
		String addr = "Thakurmunda";
		long mob = 0000000;
		double depoAmnt = 0;
		CustomerDetails cust;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose any option");
		System.out.println("1.Open account");
		System.out.println("2.Check Balance");
		System.out.println("3.Deposite Amount");
		System.out.println("4.Withdraw amount");
		System.out.println("5.Search Account holder name");
		System.out.println("6.Retrive all the customer");
		System.out.println("7.Exit");
		int key = sc.nextInt();
		boolean flag = true;
		int i = 0;
		while (flag) {
			if (i > 0) {
				System.out.println("Choose any option");
				System.out.println("1.Open account");
				System.out.println("2.Check Balance");
				System.out.println("3.Deposite Amount");
				System.out.println("4.Withdraw amount");
				System.out.println("5.Search Account holder name");
				System.out.println("6.Retrive all the customer");
				System.out.println("7.Exit");
				key = sc.nextInt();
			}
			i++;
			switch (key) {
			case 1:
				accountNo = accountNo + 1;
				System.out.println("Customer Details");
				availBalace = 0;
				// System.out.println("Enter your account no.");
				// accountNo = sc.nextLong();
				System.out.println("Enter your Name");
				name = sc.next();
				System.out.println("Enter your Address");
				addr = sc.next();
				System.out.println("Enter your mobile no.");
				mob = sc.nextLong();
				System.out.println("Enter your Deposit amount");
				depoAmnt = sc.nextDouble();
				cust = new CustomerDetails(accountNo, name, addr, mob, availBalace + depoAmnt, depoAmnt);
				custArray[j] = cust;
				System.out.println("Your Account number is: " + custArray[j].getAccountNo());
				j++;
				break;
			case 2:
				System.out.println("Enter Account number");
				accountNo = sc.nextLong();
				try {
					for (int i1 = 0; i1 < custArray.length; i1++) {
						if (custArray[i1].getAccountNo() == accountNo) {
							System.out.println("Your availbale balance=" + custArray[i1].getAvailBalace());

						}

					}

				} catch (NullPointerException ex) {
					continue;
				}
				break;
			case 3:
				System.out.println("Enter Account number");
				accountNo = sc.nextLong();
				System.out.println("Enter deposit amount");
				depoAmnt = sc.nextDouble();

				try {
					for (int i1 = 0; i1 < custArray.length; i1++) {
						if (custArray[i1].getAccountNo() == accountNo) {
							availBalace = custArray[i1].getAvailBalace() + depoAmnt;
							custArray[i1].setAvailBalace(availBalace);
							System.out.println("Your availbale balance=" + custArray[i1].getAvailBalace());

						}

					}

				} catch (NullPointerException ex) {
					continue;
				}
				break;
			case 4:
				System.out.println("Enter Account number");
				accountNo = sc.nextLong();
				System.out.println("Enter withdraw amount");
				double wthdrawAmnt = sc.nextDouble();

				try {
					for (int i1 = 0; i1 < custArray.length; i1++) {
						if (custArray[i1].getAccountNo() == accountNo) {
							if (custArray[i1].getAvailBalace() > wthdrawAmnt) {
								availBalace = custArray[i1].getAvailBalace() - wthdrawAmnt;
								custArray[i1].setAvailBalace(availBalace);
								System.out.println("Your availbale balance=" + custArray[i1].getAvailBalace());
							} else {
								System.out.println("in sufficent fund");
							}

						}

					}

				} catch (NullPointerException ex) {
					continue;
				}
				break;
			case 5:
				System.out.println("Enter Account number");
				accountNo = sc.nextLong();

				try {
					for (int i1 = 0; i1 < custArray.length; i1++) {
						if (custArray[i1].getAccountNo() == accountNo) {
							System.out.println("Account holder name=" + custArray[i1].getName());
							System.out.println("Account holder name=" + custArray[i1].getAddress());
							System.out.println("Your availbale balance=" + custArray[i1].getAvailBalace());

						}

					}

				} catch (NullPointerException ex) {
					continue;
				}
				break;
			case 6:
				try {
					for (int i1 = 0; i1 < custArray.length; i1++) {

						System.out.println("Account number:" + custArray[i1].getAccountNo());
						System.out.println("Name:" + custArray[i1].getName());
						System.out.println("Address:" + custArray[i1].getAddress());
						System.out.println("Mobile:" + custArray[i1].getMob());
						System.out.println("Balance:" + custArray[i1].getAvailBalace());
					}
				} catch (NullPointerException ex) {
					continue;
				}
				break;
			case 7:
				System.exit(0);

			}

		}

	}

}
