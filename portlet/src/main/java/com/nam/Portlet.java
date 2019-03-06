package com.nam;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.nam.parser.ParseProcess;
import com.nam.parser.ParseReader;
import com.nam.parser.Parser;
import com.nam.srv42.model.Record;
import com.nam.srv42.service.RecordLocalServiceUtil;

/**
 * Portlet implementation class Portlet
 */

public class Portlet extends MVCPortlet {
	private static Logger log = LoggerFactory.getLogger(Portlet.class);
	
	public void addRecords(ActionRequest request, ActionResponse response) throws PortalException, SystemException{	
		log.info("Add records!!!");
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Record.class.getName(), request);
		
        ParseProcess parseProcess = new ParseProcessImpl(serviceContext);
        ParseReader parseReader = new ParseReader(parseProcess);
        Parser parser = new Parser(parseReader,1202, 1);

        parser.parse();

        log.info("Found {}", parser.getFound());
	}
	
	public void removeRecords(ActionRequest request, ActionResponse response) throws PortalException, SystemException{
		log.info("Remove records!!!");
		
		RecordLocalServiceUtil.removeRecords();
	}
}
