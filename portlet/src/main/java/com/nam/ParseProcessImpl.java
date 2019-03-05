package com.nam;

import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.service.ServiceContext;
import com.nam.parser.ParseProcess;
import com.nam.parser.ParseReader;
import com.nam.srv42.service.RecordLocalServiceUtil;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.lang.Math.max;

import java.text.SimpleDateFormat;

public class ParseProcessImpl implements ParseProcess {
    private static Logger log = LoggerFactory.getLogger(ParseProcessImpl.class);

    private static int i;

    private ServiceContext serviceContext;
    
    public ParseProcessImpl(ServiceContext serviceContext) {
    	this.serviceContext = serviceContext;
    }
    
    @Override
    public void process(ParseReader parseReader){
    	log.info("{} Store to DataBase", ++i);
    	
    	int salary = max(parseReader.getSalaryFrom(), parseReader.getSalaryTo());
    	
    	//SimpleDateFromat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");//2019-03-05 15:55:11.419
    	//Calendar
    	log.info("Date {}", new Date(parseReader.getPublishedAt()));
    	
    	SimpleDateFormat format = new SimpleDateFromat("yyyy-MM-dd HH:mm:ss:SSS");
    	
		try {
			log.info(parseReader.toString());
			
			RecordLocalServiceUtil.addRecord(serviceContext.getUserId(),
					parseReader.getName(),
					new Date(),
					parseReader.getEmployerName(),
					salary, serviceContext);
			
			//SessionMessages.add(request, "recordAdded");
			
		}catch(Exception ex) {
			ex.printStackTrace();
			//SessionErrors.add(request, ex.getClass().getName());
			
		}
    }
}