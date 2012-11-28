package com.demo.spring.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.jdmk.comm.HtmlAdaptorServer;

public class SpringJmxAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
    private HtmlAdaptorServer httpJDMKAdaptor  ;
   
	@Override
    public String execute() throws Exception {
        return SUCCESS;
    }


    public String JDMKstart() throws Exception {
    	System.out.println("JDMKstart!!!");
    	if(httpJDMKAdaptor!= null)
    		httpJDMKAdaptor.start();
    	else
    		System.out.println("httpJDMKAdaptor is null");
        return SUCCESS;
    }
   
    public String JDMKstop() throws Exception {
        httpJDMKAdaptor.stop();
        return SUCCESS;
    }
}
