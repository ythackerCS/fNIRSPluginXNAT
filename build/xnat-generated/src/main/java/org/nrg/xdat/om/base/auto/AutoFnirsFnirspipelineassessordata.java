/*
 * GENERATED FILE
 *
 */
package org.nrg.xdat.om.base.auto;
import org.apache.log4j.Logger;
import org.nrg.xft.*;
import org.nrg.xft.security.UserI;
import org.nrg.xdat.om.*;
import org.nrg.xft.utils.ResourceFile;
import org.nrg.xft.exception.*;

import java.util.*;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * @author XDAT
 *
 *//*
 ******************************** 
 * DO NOT MODIFY THIS FILE
 *
 ********************************/
@SuppressWarnings({"unchecked","rawtypes"})
public abstract class AutoFnirsFnirspipelineassessordata extends XnatImageassessordata implements org.nrg.xdat.model.FnirsFnirspipelineassessordataI {
	public static final Logger logger = Logger.getLogger(AutoFnirsFnirspipelineassessordata.class);
	public static final String SCHEMA_ELEMENT_NAME="fnirs:fnirsPipelineAssessorData";

	public AutoFnirsFnirspipelineassessordata(ItemI item)
	{
		super(item);
	}

	public AutoFnirsFnirspipelineassessordata(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use AutoFnirsFnirspipelineassessordata(UserI user)
	 **/
	public AutoFnirsFnirspipelineassessordata(){}

	public AutoFnirsFnirspipelineassessordata(Hashtable properties,UserI user)
	{
		super(properties,user);
	}

	public String getSchemaElementName(){
		return "fnirs:fnirsPipelineAssessorData";
	}
	 private org.nrg.xdat.om.XnatImageassessordata _Imageassessordata =null;

	/**
	 * imageAssessorData
	 * @return org.nrg.xdat.om.XnatImageassessordata
	 */
	public org.nrg.xdat.om.XnatImageassessordata getImageassessordata() {
		try{
			if (_Imageassessordata==null){
				_Imageassessordata=((XnatImageassessordata)org.nrg.xdat.base.BaseElement.GetGeneratedItem((XFTItem)getProperty("imageAssessorData")));
				return _Imageassessordata;
			}else {
				return _Imageassessordata;
			}
		} catch (Exception e1) {return null;}
	}

	/**
	 * Sets the value for imageAssessorData.
	 * @param v Value to Set.
	 */
	public void setImageassessordata(ItemI v) throws Exception{
		_Imageassessordata =null;
		try{
			if (v instanceof XFTItem)
			{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/imageAssessorData",v,true);
			}else{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/imageAssessorData",v.getItem(),true);
			}
		} catch (Exception e1) {logger.error(e1);throw e1;}
	}

	/**
	 * imageAssessorData
	 * set org.nrg.xdat.model.XnatImageassessordataI
	 */
	public <A extends org.nrg.xdat.model.XnatImageassessordataI> void setImageassessordata(A item) throws Exception{
	setImageassessordata((ItemI)item);
	}

	/**
	 * Removes the imageAssessorData.
	 * */
	public void removeImageassessordata() {
		_Imageassessordata =null;
		try{
			getItem().removeChild(SCHEMA_ELEMENT_NAME + "/imageAssessorData",0);
		} catch (FieldNotFoundException e1) {logger.error(e1);}
		catch (java.lang.IndexOutOfBoundsException e1) {logger.error(e1);}
	}

	//FIELD

	private String _Pipelinerun=null;

	/**
	 * @return Returns the pipelineRun.
	 */
	public String getPipelinerun(){
		try{
			if (_Pipelinerun==null){
				_Pipelinerun=getStringProperty("pipelineRun");
				return _Pipelinerun;
			}else {
				return _Pipelinerun;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for pipelineRun.
	 * @param v Value to Set.
	 */
	public void setPipelinerun(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/pipelineRun",v);
		_Pipelinerun=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Object _Pipelinerundatetime=null;

	/**
	 * @return Returns the pipelineRunDateTime.
	 */
	public Object getPipelinerundatetime(){
		try{
			if (_Pipelinerundatetime==null){
				_Pipelinerundatetime=getProperty("pipelineRunDateTime");
				return _Pipelinerundatetime;
			}else {
				return _Pipelinerundatetime;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for pipelineRunDateTime.
	 * @param v Value to Set.
	 */
	public void setPipelinerundatetime(Object v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/pipelineRunDateTime",v);
		_Pipelinerundatetime=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _Userthatran=null;

	/**
	 * @return Returns the userThatRan.
	 */
	public String getUserthatran(){
		try{
			if (_Userthatran==null){
				_Userthatran=getStringProperty("userThatRan");
				return _Userthatran;
			}else {
				return _Userthatran;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for userThatRan.
	 * @param v Value to Set.
	 */
	public void setUserthatran(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/userThatRan",v);
		_Userthatran=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _Scanused=null;

	/**
	 * @return Returns the scanUsed.
	 */
	public String getScanused(){
		try{
			if (_Scanused==null){
				_Scanused=getStringProperty("scanUsed");
				return _Scanused;
			}else {
				return _Scanused;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for scanUsed.
	 * @param v Value to Set.
	 */
	public void setScanused(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/scanUsed",v);
		_Scanused=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _Paramsused=null;

	/**
	 * @return Returns the paramsUsed.
	 */
	public String getParamsused(){
		try{
			if (_Paramsused==null){
				_Paramsused=getStringProperty("paramsUsed");
				return _Paramsused;
			}else {
				return _Paramsused;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for paramsUsed.
	 * @param v Value to Set.
	 */
	public void setParamsused(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/paramsUsed",v);
		_Paramsused=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	public static ArrayList<org.nrg.xdat.om.FnirsFnirspipelineassessordata> getAllFnirsFnirspipelineassessordatas(org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.FnirsFnirspipelineassessordata> al = new ArrayList<org.nrg.xdat.om.FnirsFnirspipelineassessordata>();

		try{
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetAllItems(SCHEMA_ELEMENT_NAME,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.FnirsFnirspipelineassessordata> getFnirsFnirspipelineassessordatasByField(String xmlPath, Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.FnirsFnirspipelineassessordata> al = new ArrayList<org.nrg.xdat.om.FnirsFnirspipelineassessordata>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(xmlPath,value,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.FnirsFnirspipelineassessordata> getFnirsFnirspipelineassessordatasByField(org.nrg.xft.search.CriteriaCollection criteria, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.FnirsFnirspipelineassessordata> al = new ArrayList<org.nrg.xdat.om.FnirsFnirspipelineassessordata>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(criteria,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static FnirsFnirspipelineassessordata getFnirsFnirspipelineassessordatasById(Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems("fnirs:fnirsPipelineAssessorData/id",value,user,preLoad);
			ItemI match = items.getFirst();
			if (match!=null)
				return (FnirsFnirspipelineassessordata) org.nrg.xdat.base.BaseElement.GetGeneratedItem(match);
			else
				 return null;
		} catch (IllegalAccessException e) {
			final StackTraceElement[] stacktrace = e.getStackTrace();
			final String location = stacktrace == null || stacktrace.length == 0 ? "Unknown (no stack trace)" : stacktrace[0].toString();
			logger.error("The user " + user.getUsername() + " was denied access to the fnirs:fnirsPipelineAssessorData/id instance with ID " + value + ". Occurred at: " + location + "\n" + e.getMessage());
		} catch (Exception e) {
			logger.error("",e);
		}

		return null;
	}

	public static ArrayList wrapItems(ArrayList items)
	{
		ArrayList al = new ArrayList();
		al = org.nrg.xdat.base.BaseElement.WrapItems(items);
		al.trimToSize();
		return al;
	}

	public static ArrayList wrapItems(org.nrg.xft.collections.ItemCollection items)
	{
		return wrapItems(items.getItems());
	}
	public ArrayList<ResourceFile> getFileResources(String rootPath, boolean preventLoop){
ArrayList<ResourceFile> _return = new ArrayList<ResourceFile>();
	 boolean localLoop = preventLoop;
	        localLoop = preventLoop;
	
	        //imageAssessorData
	        XnatImageassessordata childImageassessordata = (XnatImageassessordata)this.getImageassessordata();
	            if (childImageassessordata!=null){
	              for(ResourceFile rf: ((XnatImageassessordata)childImageassessordata).getFileResources(rootPath, localLoop)) {
	                 rf.setXpath("imageAssessorData[" + ((XnatImageassessordata)childImageassessordata).getItem().getPKString() + "]/" + rf.getXpath());
	                 rf.setXdatPath("imageAssessorData/" + ((XnatImageassessordata)childImageassessordata).getItem().getPKString() + "/" + rf.getXpath());
	                 _return.add(rf);
	              }
	            }
	
	        localLoop = preventLoop;
	
	return _return;
}
}
