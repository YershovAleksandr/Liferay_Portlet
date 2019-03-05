package com.nam.parser;

public class ParseReader {
    private String name;
    private int salaryFrom;
    private int salaryTo;
    private String salaryCurrency;
    private boolean salaryGross;
    private String publishedAt;
    private String employerName;

    private ParseProcess parseProcess;

    public ParseReader(ParseProcess parseProcess){
        this.parseProcess = parseProcess;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
    	return name;
    }

    public void setSalaryFrom(int salaryFrom) {
        this.salaryFrom = salaryFrom;
    }
    
    public int getSalaryFrom() {
    	return salaryFrom;
    }

    public void setSalaryTo(int salaryTo) {
        this.salaryTo = salaryTo;
    }
    
    public int getSalaryTo() {
    	return salaryTo;
    }

    public void setSalaryCurrency(String salaryCurrency) {
        this.salaryCurrency = salaryCurrency;
    }

    public void setSalaryGross(boolean salaryGross) {
        this.salaryGross = salaryGross;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }
    
    public String getPublishedAt() {
    	return publishedAt;
    } 

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }
    
    public String getEmployerName() {
    	return employerName;
    }

    public void process(){
        parseProcess.process(this);
    }

    @Override
    public String toString() {
        return "ParseReader{" +
                "name='" + name + '\'' +
                ", salaryFrom=" + salaryFrom +
                ", salaryTo=" + salaryTo +
                ", salaryCurrency=" + salaryCurrency +
                ", salaryGross=" + salaryGross +
                ", publishedAt='" + publishedAt + '\'' +
                ", employerName='" + employerName + '\'' +
                '}';
    }
}