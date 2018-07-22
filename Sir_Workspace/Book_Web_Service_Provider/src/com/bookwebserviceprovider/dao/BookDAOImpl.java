package com.bookwebserviceprovider.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bookwebserviceprovider.constants.SQLConstants;
import com.bookwebserviceprovider.domain.Book;
import com.bookwebserviceprovider.factory.ConnectionFactory;

public class BookDAOImpl implements BookDAO {
	public Book searchBook(Integer isbn) {
		Connection con = null;
		Book book = null;
		try {
			con = ConnectionFactory.getConnection();
			PreparedStatement pst = 
		con.prepareStatement(SQLConstants.SQL_CONST_SEARCH_BOOK);
			pst.setInt(1, isbn);
			ResultSet rs = pst.executeQuery();
			// read the data from rs store that data into book
			if (rs.next()) {
				book = new Book();
				book.setBookName(rs.getString(1));
				book.setPrice(rs.getDouble(2));
				book.setAuthor(rs.getString(3));
				book.setIsbn(isbn);
			}
		} catch (SQLException se) {
			System.out.println("Exception occured while searching the Book ::"
					+ se.getMessage());
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException se) {
				System.out
						.println("Exception occured while closing the connection ::"
								+ se.getMessage());

			}
		}
		return book;
	}

}
