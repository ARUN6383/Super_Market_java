/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.smi.supermarket;

import com.smi.supermarket.design.BillingPoint;
import com.smi.supermarket.design.Catogory;
import com.smi.supermarket.design.Employee;
import com.smi.supermarket.design.Login;
import com.smi.supermarket.design.LoginAdmine;
import com.smi.supermarket.design.Product;
import com.smi.supermarket.design.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arun Hiruthik
 */
public class ComSmiSupermarket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
        Login lg = new Login();
        lg.setVisible(true);

        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(20);
                lg.getBarPrograss().setValue(i);
                lg.getProg().setText(Integer.toString(i) + "%");
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(ComSmiSupermarket.class.getName()).log(Level.SEVERE, null, ex);
        }

//     Employee em = new Employee();
        lg.dispose();
//   Catogory ca = new Catogory(); 
//   Product pt = new Product();
//   Supplier su = new Supplier();
//   BillingPoint bp = new BillingPoint();

        LoginAdmine la = new LoginAdmine();
        la.setVisible(true);

    }

}
