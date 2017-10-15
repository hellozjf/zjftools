package com.hellozjf.tools;

import java.io.File;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class EclipseProject {
	
	private static final Log LOG = LogFactory.getLog(EclipseProject.class);

	public static String getProjectPath() throws Exception {
		File directory = new File("");
        String courseFile = directory.getCanonicalPath();
        return courseFile;
	}
	
	public static void main(String[] args) throws Exception {
		LOG.debug(getProjectPath());
	}
}
