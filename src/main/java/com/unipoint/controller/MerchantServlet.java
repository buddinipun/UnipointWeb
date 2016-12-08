package com.unipoint.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.unipoint.model.Merchant;
import com.unipoint.service.MerchantService;

/**
 * Servlet implementation class MerchantServlet
 */
@Controller
@WebServlet("/MerchantServlet")
public class MerchantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Autowired
	MerchantService merchantService;
	
	private WebApplicationContext springContext;
	
	@Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        WebApplicationContext ac = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
        ac.getAutowireCapableBeanFactory().autowireBean(this);
    }
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MerchantServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(merchantService.getAllMerchant().size());
		request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
