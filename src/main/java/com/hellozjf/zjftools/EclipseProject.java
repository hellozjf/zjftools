package com.hellozjf.zjftools;

import java.io.File;

import org.apache.log4j.Logger;

public class EclipseProject {
	
    private static final Logger LOGGER = Logger.getLogger(EclipseProject.class);

	public static String getProjectPath() throws Exception {
		File directory = new File("");
        String courseFile = directory.getCanonicalPath();
        return courseFile;
	}
	
}
