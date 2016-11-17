package Filters;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyFilter implements Filter {

	FilterConfig filterConfig = null;

	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
	}

	public void destroy() {
	}
    
	
        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
                HttpServletResponse response = (HttpServletResponse)servletResponse;
		try{
		System.out.println("INSIDE FILTER CALSS");
		String initValue = filterConfig.getInitParameter("my-param");
                
                HttpServletRequest request = (HttpServletRequest)servletRequest;
                HttpSession session = request.getSession();
                String tracker = (String)session.getAttribute("tracker");
                if (tracker.equals(""))
                    response.sendRedirect("login.jsp");
                else
                    filterChain.doFilter(servletRequest, servletResponse);
                }
                catch(Exception e){
                    response.sendRedirect("login.jsp");
                }

	}
   

}

/*
public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain,HttpServletResponse rs)
			throws IOException, ServletException {
		
		String initValue = filterConfig.getInitParameter("my-param");
                if (!initValue.equals("verified"))
                    rs.sendRedirect("login.jsp");

	}

*/