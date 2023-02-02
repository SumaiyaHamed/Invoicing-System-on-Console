package InvoicingSystemOnConsolePackage;

import java.sql.Date;

public class Invoice {
	
	String customer_name;
	int Phone_No;
	Date invoice_date;
	int NO_items;
	float total_amount;
	float paid_amount;
	float balance;
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public int getPhone_No() {
		return Phone_No;
	}
	public void setPhone_No(int phone_No) {
		Phone_No = phone_No;
	}
	public Date getInvoice_date() {
		return invoice_date;
	}
	public void setInvoice_date(Date invoice_date) {
		this.invoice_date = invoice_date;
	}
	public int getNO_items() {
		return NO_items;
	}
	public void setNO_items(int nO_items) {
		NO_items = nO_items;
	}
	public float getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(float total_amount) {
		this.total_amount = total_amount;
	}
	public float getPaid_amount() {
		return paid_amount;
	}
	public void setPaid_amount(float paid_amount) {
		this.paid_amount = paid_amount;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}



}
