package com.nam;

import com.liferay.portal.service.ServiceContext;
import com.nam.parser.ParseProcess;
import com.nam.parser.ParseReader;
import com.nam.srv42.service.RecordLocalServiceUtil;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.lang.Math.max;

import java.text.DateFormat;
import java.text.ParseException;
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

		try {
			log.info(parseReader.toString());

			DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
			Date date = new Date();

			try{
	            date = df.parse(parseReader.getPublishedAt());
	        }catch (ParseException e){
	            log.error("Error", e);
	        }
	    	
			RecordLocalServiceUtil.addRecord(serviceContext.getUserId(),
					parseReader.getName(),
					date,
					parseReader.getEmployerName(),
					salary, serviceContext);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
    }
}