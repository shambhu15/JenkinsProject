package com.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void JVMReportGeneration(String jsonLoc) {
		Configuration con = new Configuration(
				new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Resources\\Reports\\"),
				"Gurru99 Demo Site");
		con.addClassifications("Browser", "Chrome");
		con.addClassifications("Version", "79");
		con.addClassifications("OS","Windows10");
		con.addClassifications("Sprint", "10");
		
		List<String> jsonFile=new ArrayList<String>();
		jsonFile.add(jsonLoc);
		ReportBuilder builder=new ReportBuilder(jsonFile, con);
		builder.generateReports();
		

	}

}
