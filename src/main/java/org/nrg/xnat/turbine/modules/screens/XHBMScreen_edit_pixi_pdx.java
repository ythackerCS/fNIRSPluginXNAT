package org.nrg.xnat.turbine.modules.screens;

import org.apache.turbine.util.RunData;
import org.apache.velocity.context.Context;
import org.nrg.config.entities.Configuration;
import org.nrg.config.services.ConfigService;
import org.nrg.xdat.XDAT;
import org.nrg.xdat.turbine.modules.screens.SecureScreen;
import org.nrg.xnatx.plugins.pixi.PIXIPlugin;

public class XHBMScreen_edit_pixi_pdx extends SecureScreen {
    @Override
    protected void doBuildTemplate(RunData runData, Context context) throws Exception {
        ConfigService configService = XDAT.getConfigService();
        Configuration config = configService.getConfig("forms", "datatype/" + PIXIPlugin.PIXI_PDX_DATATYPE);

        String customFormJson = null;
        if (null != config) {
            if (config.getStatus().equalsIgnoreCase("ENABLED")) {
                customFormJson = config.getContents();
            } else {
                customFormJson = "{}";
            }
        } else {
            customFormJson = "{}";
        }

        customFormJson = customFormJson.replace("$siteUrl", XDAT.getSiteUrl());

        context.put("form", customFormJson);
    }
}