package jdbc;

import java.sql.Date;
import java.util.List;

public class InvoiceMasterMain {
	public static void main(String[] args) throws Exception {
		InvoiceMasterDAO idao = new InvoiceMasterDAOImpl(ConnectionUtility.getConnection());
		InvoiceMasterDto im =idao.findById(1);
		System.out.println(im);
		idao = new InvoiceMasterDAOImpl(ConnectionUtility.getConnection());
		im = idao.findByDate(Date.valueOf("2023-09-02"));
		idao = new InvoiceMasterDAOImpl(ConnectionUtility.getConnection());
		List<InvoiceMasterDto> list = idao.findAll();
		System.out.println(list);
		idao = new InvoiceMasterDAOImpl(ConnectionUtility.getConnection());
		InvoiceMasterDto im1 = new InvoiceMasterDto();
		im1.setInvoiceid(1);
		im1.setInvoiceDate(Date.valueOf("2023-09-02"));
		im1.setDiscount(30);
		int i=idao.createCustomerByInvoice(im1);
		System.out.println(i==1?"record inserted..":"not inserted...");
		idao=new InvoiceMasterDAOImpl(ConnectionUtility.getConnection());
		idao.deleteCustomerByInvoiceId(1);
		
	}
	

}
