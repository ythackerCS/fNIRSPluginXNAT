/*
 * GENERATED FILE
 * Created on Mon Apr 15 13:19:11 CDT 2024
 *
 */
package org.nrg.xdat.model;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * @author XDAT
 *
 */
public interface FnirsFnirsscandataI extends XnatImagescandataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the task.
	 */
	public String getTask();

	/**
	 * Sets the value for task.
	 * @param v Value to Set.
	 */
	public void setTask(String v);
}
