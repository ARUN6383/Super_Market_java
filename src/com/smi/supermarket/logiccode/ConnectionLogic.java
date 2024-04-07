/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smi.supermarket.logiccode;

import com.smi.supermarket.design.BillingPoint;
import com.smi.supermarket.pojos.CategoryPojo;
import com.smi.supermarket.pojos.EmployeePojo;
import com.smi.supermarket.pojos.ProductPojo;
import com.smi.supermarket.pojos.SupplierPojo;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arun Hiruthik
 */
public class ConnectionLogic {

    public Connection con;
    public PreparedStatement ps;
    public ResultSet rs;
    public String disparti = "";
    public String pass = "";

    public ConnectionLogic() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/inventory_management", "root", "arun@123");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean employeeInert(EmployeePojo ep) {
        try {
               ps = con.prepareStatement("insert into staff(staff_id,stf_name,stf_phone,stf_email,stf_address,staff_role)values(?,?,?,?,?,?)");
            ps.setInt(1, ep.getStaffId());
            ps.setString(2, ep.getStaffName());
            ps.setString(3, ep.getStaffPhone());
            ps.setString(4, ep.getStaffEmail());
            ps.setString(5, ep.getStaffAddress());
            ps.setString(6, ep.getStaffRole());

            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (Exception e) {

        }
        return false;
    }

    public ResultSet viewEmployee() {
        try {
            ps = con.prepareStatement("select * from staff");
            rs = ps.executeQuery();
        } catch (Exception e) {

        }
        return rs;
    }

    public boolean deleteEmployee(EmployeePojo ep) {
        int eId = ep.getStaffId();
        try {

            ps = con.prepareStatement("delete from staff where staff_id =" + eId);
            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionLogic.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    public boolean employeeUpdate(EmployeePojo ep) {
        int Eid = ep.getStaffId();
        String Ename = ep.getStaffName();
        String Ephone = ep.getStaffPhone();
        String Eemail = ep.getStaffEmail();
        String Eadd = ep.getStaffAddress();
        String Etype = ep.getStaffRole();
        try {
            ps = con.prepareStatement("update staff set staff_id='" + Eid + "'" + ",stf_name='" + Ename + "'" + ",stf_phone='" + Ephone + "'" + ",stf_email='" + Eemail + "'" + ",stf_address='" + Eadd + "'" + ",staff_role='" + Etype + "'" + "where Staff_id=" + Eid);
            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionLogic.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //Category Code
    public boolean insertCategory(CategoryPojo cp) {
        try {
            ps = con.prepareStatement("insert into category(cat_name,cat_description)values(?,?)");

            ps.setString(1, cp.getCategoryName());
            ps.setString(2, cp.getCategoryDescription());

            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (SQLException e) {

        }
        return false;
    }

    //----------------
    public ResultSet viewCategory() {
        try {
            ps = con.prepareStatement("select * from category");
            rs = ps.executeQuery();
        } catch (SQLException e) {

        }
        return rs;
    }

    //-----------------
    public boolean editCategory(CategoryPojo cp) {
        int Cids = cp.getCategoryId();
        String Cnames = cp.getCategoryName();
        String Cabouts = cp.getCategoryDescription();
        System.out.println(Cnames + "   " + Cabouts);

        try {
            ps = con.prepareStatement("update category set cat_name='" + Cnames + "'" + ",cat_description='" + Cabouts + "' " + "where cat_id=" + Cids);
            int res = ps.executeUpdate();

            if (res > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    //---------------------
    public boolean deleteCategory(CategoryPojo cp) {
        int Cid = cp.getCategoryId();
        try {

            ps = con.prepareStatement("delete from category where cat_id =" + Cid);
            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionLogic.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //Product Logical Code
    
    
    
    
    public boolean insertProduct(ProductPojo pp) {
        try {

            ps = con.prepareStatement("insert into product(pro_id,pro_name,pro_description,pro_unit,pro_price,pro_quantity,pro_status,supp_id,cat_id,categoryItems)values(?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, pp.getId());
            ps.setString(2, pp.getName());
            ps.setString(3, pp.getDesc());
            ps.setString(4, pp.getUnit());
            ps.setInt(5, pp.getPrice());
            ps.setInt(6, pp.getQuantity());
            ps.setString(7, pp.getStatus());
            ps.setInt(8, pp.getSupp_id());
            ps.setInt(9, pp.getCat_id());
            ps.setString(10, pp.getOption());

            System.out.println(pp.getOption());
            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    //---------------------
    public ResultSet viewProduct() {
        try {
            ps = con.prepareStatement("select * from product");
            rs = ps.executeQuery();
        } catch (SQLException e) {

        }
        return rs;
    }
    
    
    
 public int fetchAndDisplayValues(String selectedCategory) {
     int catId = 0;
     try {
       

        try {
            ps = con.prepareStatement("SELECT cat_id FROM category WHERE cat_name = ?");
            ps.setString(1, selectedCategory);
            rs = ps.executeQuery();
        } catch (Exception e) {
            // Handle exceptions appropriately (e.g., log or throw)
            e.printStackTrace();
        }

        if (rs.next()) {
            catId = rs.getInt("cat_id");
            System.out.println("Category ID for " + selectedCategory + ": " + catId);
        } else {
            System.out.println("No category found for " + selectedCategory);
        }

    } catch (SQLException ex) {
        Logger.getLogger(ConnectionLogic.class.getName()).log(Level.SEVERE, null, ex);
    }

    return catId;
}

 
  public int  fetchAndDisplayValuesSupplier(String selectedCategory)
 {
     int catId = 0;
     try { 

        try {
            ps = con.prepareStatement("SELECT supp_id FROM supplier WHERE sup_name = ?");
            ps.setString(1, selectedCategory);
            rs = ps.executeQuery();
        } catch (Exception e) {
            // Handle exceptions appropriately (e.g., log or throw)
            e.printStackTrace();
        }

        if (rs.next()) {
            catId = rs.getInt("supp_id");
            System.out.println("Category ID for " + selectedCategory + ": " + catId);
        } else {
            System.out.println("No category found for " + selectedCategory);
        }

    } catch (SQLException ex) {
        Logger.getLogger(ConnectionLogic.class.getName()).log(Level.SEVERE, null, ex);
    }

    return catId;
}

    //------------------
    public boolean deleteProduct(ProductPojo ppp) {
        int Pid = ppp.getId();
        try {

            ps = con.prepareStatement("delete from product where pro_id =" + Pid);
            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionLogic.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //---------------------
    public boolean updateProduct(ProductPojo pp) {
        int id = pp.getId();
        String name = pp.getName();
        String desc = pp.getDesc();
        String unit = pp.getUnit();
        int price = pp.getPrice();
        int quantity = pp.getQuantity();
        String status = pp.getStatus();
        int supp_id = pp.getSupp_id();
        int cat_id = pp.getCat_id();
        String option = pp.getOption();

        try {
            ps = con.prepareStatement("update product set pro_id='" + id + "'" + ",pro_name='" + name + "'" + ",pro_description='" + desc + "'" + ",pro_unit='" + unit + "'" + ",pro_price='" + price + "'" + ",pro_quantity='" + quantity + "'" + ",pro_status='" + status + "'" + ",supp_id='" + supp_id + "'" + ",cat_id='" + cat_id + "'" + "where pro_id=" + id);
            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionLogic.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //Supplier Code
    public ResultSet viewSupplier() {
        try {
            ps = con.prepareStatement("select * from supplier");
            rs = ps.executeQuery();
        } catch (SQLException e) {

        }
        return rs;
    }

    //--------------------------
    public boolean insertSuplier(SupplierPojo sp) {
        try {
            ps = con.prepareStatement("insert into Supplier(supp_id,sup_name,sup_address,sup_phone,sup_email,sup_other_detail)values(?,?,?,?,?,?)");
            ps.setInt(1, sp.getSid());
            ps.setString(2, sp.getSname());
            ps.setString(3, sp.getSadd());
            ps.setString(4, sp.getSphone());
            ps.setString(5, sp.getSemail());
            ps.setString(6, sp.getSother());
            System.out.println(sp.getSemail());
            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (SQLException e) {

        }
        return false;
    }

    //------------------
    public boolean updateSuplier(SupplierPojo sp) {
        int Sid = sp.getSid();
        String Sname = sp.getSname();
        String Sphone = sp.getSphone();
        String Semail = sp.getSemail();
        String Sadd = sp.getSadd();
        String Sother = sp.getSother();
        try {
            ps = con.prepareStatement("update supplier set supp_id='" + Sid + "'" + ",sup_name='" + Sname + "'" + ",sup_address='" + Sadd + "'" + ",sup_phone='" + Sphone + "'" + ",sup_email='" + Semail + "'" + ",sup_other_detail='" + Sother + "'" + "where supp_id=" + Sid);
            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionLogic.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //-----------------------
    public boolean deleteSupplier(SupplierPojo sp) {

        int Sid = sp.getSid();
        try {

            ps = con.prepareStatement("delete from supplier where supp_id =" + Sid);
            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionLogic.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    //Billing code
    public ResultSet viewbiling() {
        try {
            ps = con.prepareStatement("select pro_id,pro_name,pro_price,pro_quantity,pro_status,categoryItems from product");
            rs = ps.executeQuery();
        } catch (SQLException e) {

        }
        return rs;
    }

    public void update(int id, int newquan) {
        System.out.println(id + newquan);
        try {
            ps = con.prepareStatement("update product set pro_quantity='" + newquan + "'" + "where pro_id=" + id);
            int res = ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionLogic.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Vector disCatgorys() {
        Vector vec = null;
        try {
            ps = con.prepareStatement("select * from category");
            rs = ps.executeQuery();
            vec = new Vector();
            String temp = "";
            while (rs.next()) {
                temp = rs.getString("cat_name");
                vec.add(temp);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionLogic.class.getName()).log(Level.SEVERE, null, ex);
        }

        return vec;
    }
    
    public Vector disSupplier()
    {
         Vector vec = null;
        try {
            ps = con.prepareStatement("select * from supplier");
            rs = ps.executeQuery();
            vec = new Vector();
            String temp = "";
            while (rs.next()) {
                temp = rs.getString("sup_name");
                vec.add(temp);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionLogic.class.getName()).log(Level.SEVERE, null, ex);
        }

        return vec;
    }

    public ResultSet viewcatbilling() {
        BillingPoint Bp = new BillingPoint();

        System.out.println(Bp.temp);
        try {
            ps = con.prepareStatement("select pro_id,pro_name,pro_price,pro_quantity,pro_status,categoryItems from product where categoryItems='" + Bp.poptionbillmethod() + "'");
            rs = ps.executeQuery();
        } catch (SQLException e) {

        }
        return rs;
    }

    //login code
    public boolean userLogin(String name, String pass) {
        try {
            ps = con.prepareStatement("select * from loginoption where name = ? and password = ?");
            ps.setString(1, name);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
        }
        return false;
    }

    //order deatils
    public void order_deatils(String cus_phone, String cus_name, double tota) {

        try {
            ps = con.prepareStatement("insert into order_details(total,cus_phone,cus_name)values(?,?,?)");
            ps.setDouble(1, tota);
            ps.setString(2, cus_phone);
            ps.setString(3, cus_name);
            System.out.println(cus_phone + cus_name + tota);
            int res = ps.executeUpdate();
        } catch (Exception e) {

        }
    }

    //to pass order_id to billing table
    public ResultSet billingAddOrderId(String ph) {
        try {
            int ch = 0;
            try {
                ps = con.prepareStatement("select order_detail_id from order_details where cus_phone ='" + ph + "'");
                rs = ps.executeQuery();
            } catch (Exception e) {

            }

            if (rs.next()) {
                ch = rs.getInt("order_detail_id");
            }

            System.out.println(ch + "");

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionLogic.class.getName()).log(Level.SEVERE, null, ex);

        }
        return rs;
    }

    public ResultSet viewReport() {
        try {
            ps = con.prepareStatement("select * from order_details");
            rs = ps.executeQuery();
        } catch (Exception e) {

        }
        return rs;
    }

    public ResultSet viewReportParti(String str1) {
        try {
            ps = con.prepareStatement("select * from order_details where order_date='" + str1 + "'");
            rs = ps.executeQuery();
        } catch (Exception e) {

        }
        return rs;
    }

    public ResultSet viewReportbilling(String str1) {
        try {
            ps = con.prepareStatement("select * from billing_details where bill_date='" + str1 + "'");
            rs = ps.executeQuery();
        } catch (Exception e) {

        }
        return rs;
    }

    public ResultSet viewReportBetween(String str1, String str2) {
        System.out.println(str1 + str2);
        try {
            ps = con.prepareStatement("select * from order_details where order_date between '" + str1 + "'and'" + str2 + "'");
            rs = ps.executeQuery();
        } catch (Exception e) {

        }
        return rs;
    }

    public ResultSet viewReportBillingBetween(String str1, String str2) {
        System.out.println(str1 + str2);
        try {
            ps = con.prepareStatement("select * from billing_details where bill_date between '" + str1 + "'and'" + str2 + "'");
            rs = ps.executeQuery();
        } catch (Exception e) {

        }
        return rs;
    }

    public ResultSet viewReportBilling(String str1) {
        try {
            ps = con.prepareStatement("select * from billing_details where cus_phone='" + str1 + "'");
            rs = ps.executeQuery();
        } catch (Exception e) {

        }
        return rs;
    }

    public ResultSet viewReportBilling2(String str1) {
        try {
            ps = con.prepareStatement("select * from order_details where cus_phone='" + str1 + "'");
            rs = ps.executeQuery();
        } catch (Exception e) {

        }
        return rs;
    }

    public ResultSet getProductDetail(String search) {
        try {
            ps = con.prepareStatement("select pro_id,categoryItems,pro_price,pro_quantity from product where pro_name='" + search + "'");
            rs = ps.executeQuery();
        } catch (Exception e) {

        }
        return rs;
    }

//    public ResultSet getProductDetail2(String search)
//    {
//        try
//        {
//            ps = con.prepareStatement("select product_total from billing_details where pro_name='"+search+"'");
//            rs = ps.executeQuery();
//        }
//        catch(Exception e)
//        {
//            
//        }
//       return rs;
//    }
    public ResultSet viewTotalQuan(String str1, String str2, String str3) {
        try {
            ps = con.prepareStatement("select sum(product_total) as prod,sum(product_quantity) as prod2 from billing_details where product_name='" + str1 + "' and bill_date between '" + str2 + "' and '" + str3 + "'");
            rs = ps.executeQuery();
        } catch (Exception e) {

        }
        return rs;
    }

    public ResultSet getProductDetail2(String searchProduct) {
        try {
            ps = con.prepareStatement("select sum(product_total) as prod,sum(product_quantity) as prod2 from billing_details where product_name='" + searchProduct + "'");
            rs = ps.executeQuery();
        } catch (Exception e) {

        }
        return rs;
    }

    public ResultSet viewBilling() {
        try {
            ps = con.prepareStatement("select * from billing_details");
            rs = ps.executeQuery();
        } catch (Exception e) {

        }
        return rs;
    }

    //calculate the total cost
    public ResultSet calculateTotal(String str) {
        try {
            ps = con.prepareStatement("select sum(product_total) as prod from billing_details where bill_date='" + str + "'");
            rs = ps.executeQuery();
        } catch (Exception e) {

        }
        return rs;
    }

    public ResultSet calculateProTot(String st1, String st2) {
        try {
            ps = con.prepareStatement("select sum(product_total) as prod from billing_details where bill_date between '" + st1 + "' and '" + st2 + "'");
            rs = ps.executeQuery();
        } catch (Exception e) {

        }
        return rs;
    }

}
