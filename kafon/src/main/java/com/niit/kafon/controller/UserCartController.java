package com.niit.kafon.controller;
import java.security.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.kafon.dao.BillingAddressDAO;
import com.niit.kafon.dao.CartDAO;
import com.niit.kafon.dao.UserDAO;
import com.niit.kafon.model.BillingAddress;
import com.niit.kafon.model.UserDetails;

	@Controller
	public class UserCartController {

	    @Autowired
	    private UserDAO userDAO;
	    @Autowired
	    private CartDAO cartDAO;
	    
	    @Autowired
	    private BillingAddressDAO billingAddressDAO;
	   
	    @RequestMapping("/Cart")
	    public String getCartItems(Principal username,Model model){
	    	UserDetails userDetails = userDAO.get(username.getName());
	        int cartId = userDetails.getCart().getCartId();
	        model.addAttribute("cartId", cartId);
	        return "Cart";
	    }
	    @RequestMapping("/saveBillingAddress")
	    public String savebillingAddress(BillingAddress billingAddress){
	    billingAddressDAO.saveOrUpdate(billingAddress);
	    return "redirect:/OrderDetails";
	    }
	    @RequestMapping("/OrderDetails")
	    public String getorderdetails(Principal username,Model model){
	    	UserDetails userDetails = userDAO.get(username.getName());
	        int cartId = userDetails.getCart().getCartId();
	        model.addAttribute("cartId", cartId);
	        return "OrderDetails";
	    }
	    @RequestMapping("/confirmorder")
	    public String confirm()
	    {
	    	return "payment";
	    }
	    @RequestMapping("/cancelorder")
	    public String cancel()
	    {
	    	return "OrderCancel";
	    }
	    @RequestMapping("/placeOrder")
	    public String Order()
	    {
	    	return "Ordercomplete";
	    }
	}

