package edu.pitt.dbmi.daquery.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class URLFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		String url = ((HttpServletRequest)request).getRequestURL().toString();
		if(!url.contains("/ws/") && !url.matches(".*\\.js$|.*\\.css$|.*\\.txt$|.*\\.jpg$|.*\\.ico$|.*\\.eot$|.*\\.svg$|.*\\.woff2$|.*\\.ttf$|.*\\.woff$|.*\\.html$")) {
			request.getRequestDispatcher("/index.html").forward(request, response);
		} else {
			chain.doFilter(request, response);
		}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
