package org.jkiss.dbeaver.ext.mysql.ui.views;

import org.eclipse.osgi.util.NLS;


public class MySQLServerUIMessages extends NLS{
	static final String BUNDLE_NAME = "org.jkiss.dbeaver.ext.mysql.ui.views.MySQLServerUIMessages";
	
	
	public static String dialog_create_database_title; 
	public static String dialog_create_database_database_name;
	public static String dialog_create_database_charset;
	public static String dialog_create_database_collation;
	
	static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, MySQLServerUIMessages.class);
    }
	
	private MySQLServerUIMessages() {
    }
	

}
