package com.product;
import java.sql.*;
import com.connectivity.*;

public class Billing {
	
	
	public void generateBill() {
		
		Connection con = null;
		PreparedStatement statement = null;
		DatabaseCon dbc = new DatabaseCon();
		
		
		try {
			
			con = dbc.getConnection();
			
			//statement = con.prepareStatement("select u_name ,u_email_id, mobile,p_id,p_name,price,o_id, items from user inner join )
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
