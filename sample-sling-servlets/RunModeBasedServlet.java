package com.sample.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.ServletResolverConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.propertytypes.ServiceDescription;

//http://localhost:4503/bin/demopathbasedservlet

@Component(service = Servlet.class, configurationPolicy = ConfigurationPolicy.REQUIRE,
property = { ServletResolverConstants.SLING_SERVLET_NAME + "=" + "Run Mode Based Servlet",
		     ServletResolverConstants.SLING_SERVLET_METHODS + "=" + HttpConstants.METHOD_GET,
		     ServletResolverConstants.SLING_SERVLET_PATHS + "=" + "/bin/runmodebasedservlet" })
@ServiceDescription("RunModeBasedServlet")
public class RunModeBasedServlet extends SlingSafeMethodsServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(final SlingHttpServletRequest req, final SlingHttpServletResponse resp)
			throws ServletException, IOException {

		
		resp.getWriter().println("Inside RunModeBasedServlet");

	}	


}
