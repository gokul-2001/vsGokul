package jdbc;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

public class InvoiceMasterDto implements Serializable {
	private int invoiceid;
	private Date invoiceDate;
	private int discount;
	public int getInvoiceid() {
		return invoiceid;
	}
	public void setInvoiceid(int invoiceid) {
		this.invoiceid = invoiceid;
		
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "InvoiceMasterDto [invoiceid=" + invoiceid + ", invoiceDate=" + invoiceDate + ", discount=" + discount
				+ "]";
		
	}
}
	
	


