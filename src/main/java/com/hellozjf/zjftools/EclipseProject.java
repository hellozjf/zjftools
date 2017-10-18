package com.hellozjf.zjftools;

import java.io.File;


public class EclipseProject {
	
	public static String getProjectPath() throws Exception {
		File directory = new File("");
        String courseFile = directory.getCanonicalPath();
        return courseFile;
	}
	
}
