/*
 * GENERATED FILE
 * Created on Mon May 20 16:18:42 CDT 2024
 *
 */
package org.nrg.xdat.model;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * @author XDAT
 *
 */
public interface FnirsFnirspipelineassessordataI extends XnatImageassessordataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the pipelineRun.
	 */
	public String getPipelinerun();

	/**
	 * Sets the value for pipelineRun.
	 * @param v Value to Set.
	 */
	public void setPipelinerun(String v);

	/**
	 * @return Returns the pipelineRunDateTime.
	 */
	public Object getPipelinerundatetime();

	/**
	 * Sets the value for pipelineRunDateTime.
	 * @param v Value to Set.
	 */
	public void setPipelinerundatetime(Object v);

	/**
	 * @return Returns the userThatRan.
	 */
	public String getUserthatran();

	/**
	 * Sets the value for userThatRan.
	 * @param v Value to Set.
	 */
	public void setUserthatran(String v);

	/**
	 * @return Returns the scanUsed.
	 */
	public String getScanused();

	/**
	 * Sets the value for scanUsed.
	 * @param v Value to Set.
	 */
	public void setScanused(String v);

	/**
	 * @return Returns the paramsUsed.
	 */
	public String getParamsused();

	/**
	 * Sets the value for paramsUsed.
	 * @param v Value to Set.
	 */
	public void setParamsused(String v);
}
