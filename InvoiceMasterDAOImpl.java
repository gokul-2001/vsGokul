package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java.sql.ResultSet;


public class InvoiceMasterDAOImpl implements InvoiceMasterDAO{
     ResultSet rs;
	 Connection con;
	 PreparedStatement ps;

	public InvoiceMasterDAOImpl(Connection con) {
		this.con =con;
	}

	@Override
	public InvoiceMasterDto findById(int invoiceId) throws Exception {
		ps=con.prepareStatement("select from invoice_master where invoice_id=?");
		ps.setInt(1,invoiceId);
		rs=ps.executeQuery();
		InvoiceMasterDto im = new InvoiceMasterDto();
		if(rs.next()) {
			im.setInvoiceid(rs.getInt(1));
			im.setInvoiceDate(rs.getDate(2));
			im.setDiscount(rs.getInt(3));
			
		}
		ps.close();
		rs.close();
		return im;
	}

	@Override
	public InvoiceMasterDto findByDate(Date date) throws Exception {
		ps=con.prepareStatement("select from invoice_master where invoice_date=?");
		ps.setDate(1,date);
		rs=ps.executeQuery();
		InvoiceMasterDto im = new InvoiceMasterDto();
		if(rs.next()) {
			im.setInvoiceid(rs.getInt(1));
			im.setInvoiceDate(rs.getDate(2));
			im.setDiscount(rs.getInt(3));
			
		}
		ps.close();
		rs.close();
		return im;
	}

	@Override
	public List<InvoiceMasterDto> findAll() throws Exception {
		ps=con.prepareStatement("select * from Invoice_master");
		rs =ps.executeQuery();
		ArrayList<InvoiceMasterDto>list =new ArrayList<InvoiceMasterDto>();
		
		while(rs.next()) {
			InvoiceMasterDto im = new InvoiceMasterDto();
			im.setInvoiceid(rs.getInt(1));
			im.setInvoiceDate(rs.getDate(2));
			im.setDiscount(rs.getInt(3));
			list.add(im);
			ps.close();
			rs.close();
		}
			ConnectionUtility.closeConnection(null, null);
			return list;
			
		
	
	}

	@Override
	public int createCustomerByInvoice(InvoiceMasterDto im) {
		try {
			ps=con.prepareStatement("insert into invoice_master values(?,?,?)");
			ps.setInt(1, im.getInvoiceid());
			ps.setDate(2,im.getInvoiceDate());
			ps.setInt(3, im.getDiscount());
			int i = ps.executeUpdate();
			ConnectionUtility.closeConnection(null, null);
			return i;
		}
		catch(Exception e) {
			try {
				ps.close();
				rs.close();
				
			}catch(Exception ex) {}
			ConnectionUtility.closeConnection(e, null);
			return 0;
		}
		
	}

	@Override
	public int deleteCustomerByInvoiceId(int invoiceId) {
		
		try {
			ps=con.prepareStatement("delete from invoice_master where invoicwe_id=?");
			ps.setInt(1, invoiceId);
			
			int i=ps.executeUpdate();
			ConnectionUtility.closeConnection(null, null);
			return i;
		}catch(Exception e) {
			try{ps.close();rs.close();}catch(Exception ee) {}
			ConnectionUtility.closeConnection(e, null);
			return 0;
		}
	}
	
	
	}


