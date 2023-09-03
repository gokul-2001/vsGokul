package jdbc;

import java.sql.Date;
import java.util.List;

public interface InvoiceMasterDAO {
	public InvoiceMasterDto findById(int invoiceId)throws Exception;
	public InvoiceMasterDto findByDate(Date date) throws Exception;
	public List<InvoiceMasterDto> findAll() throws Exception;
	public int createCustomerByInvoice(InvoiceMasterDto im);
	public int deleteCustomerByInvoiceId(int invoiceId);
	

}
