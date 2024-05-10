/*
 * GENERATED FILE
 * Created on Fri May 03 13:23:23 CDT 2024
 *
 */
package org.nrg.xnat.turbine.modules.screens;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apache.turbine.util.RunData;
import org.apache.velocity.context.Context;
import org.nrg.xdat.model.XnatAbstractresourceI;
import org.nrg.xdat.om.FnirsFnirspipelineassessordata;
import org.nrg.xdat.om.XnatResourcecatalog;
import org.nrg.xdat.turbine.modules.screens.SecureReport;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author XDAT
 *
 */

@Slf4j

public class XDATScreen_report_fnirs_fnirsPipelineAssessorData extends SecureReport {
	public void finalProcessing(RunData data, Context context) {
		FnirsFnirspipelineassessordata om = (FnirsFnirspipelineassessordata) context.get("om");
		List<XnatAbstractresourceI> files = om.getOut_file();

		if (files==null){
			return;
		}


		XnatResourcecatalog resource = (XnatResourcecatalog) files.get(0);
		context.put("showFnirFigs", resource!=null);
		context.put("assessorId", ((FnirsFnirspipelineassessordata) om).getId());
		context.put("exptId", ((FnirsFnirspipelineassessordata) om).getImagesessionId());
		try {
			context.put("html", FileUtils.readFileToString(new File(Paths.get(resource.getUri()).getParent().resolve("output.html").toString()), Charset.defaultCharset()));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		context.put("htmlFilePath", Paths.get(resource.getUri()).getParent().resolve("output.html").toString());

	}}
