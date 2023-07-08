package dao;
import java.sql.*;
import ConnectionManager.ConnectionManager;
import model.Product;
public class ProductDAO {
public void addProduct(Product product) throws ClassNotFoundException,SQLException
{
ConnectionManager conn = new ConnectionManager();
Connection con = conn.establishConnection();
String sql = "insert into product (product,productname,minsell,price,quantity)values(?,?,?,?,?)";
PreparedStatement ps=con.prepareStatement(sql);
ps.setInt(1, product.getProductId());
ps.setString(2, product.getProductName());
ps.setInt(3, product.getMinSellQuantity());
ps.setInt(4, product.getprice());
ps.setInt(5, product.getQuantity());
ps.executeUpdate();
conn.closeConnection();
}
public void display() throws ClassNotFoundException,SQLException
{
ConnectionManager conn = new ConnectionManager();
Connection con = conn.establishConnection();
Statement st = con.createStatement();
ResultSet rs =st.executeQuery("select * from product");
        while(rs.next())
        {
        System.out.println("__________________________________________________________________");
        System.out.println(rs.getInt("product")+" | "+rs.getString("productname")+" | "+rs.getInt("minsell")+" | "+rs.getInt("price")+" | "+rs.getInt("quantity"));
        }
        conn.closeConnection();
}
}