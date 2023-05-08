package org.nrg.xnatx.plugins.fnirs;

import lombok.extern.slf4j.Slf4j;
import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.nrg.xdat.om.FnirsFnirssessiondata;
import org.nrg.xdat.om.FnirsFnirsscandata;
import org.nrg.xnat.restlet.actions.importer.ImporterHandlerPackages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@XnatPlugin(value = "fnirsPlugin", name = "fnirs Plugin",
            logConfigurationFile = "fnirs-logback.xml",
            dataModels = {
                          @XnatDataModel(value = FnirsFnirssessiondata.SCHEMA_ELEMENT_NAME,
                                         singular = "fNIRS Session",
                                         plural = "fNIRS Sessions",
                                         code = "fNIRS"),
                          @XnatDataModel(value = FnirsFnirsscandata.SCHEMA_ELEMENT_NAME,
                                         singular = "fNIRS Scan",
                                         plural = "fNIRS Scans",
                                         code = "fNIRSScan")
                          })
@ComponentScan({"org.nrg.xnatx.plugins.fnirs.bli.helpers",
                "org.nrg.xnatx.plugins.fnirs.bli.helpers.impl"
})
@Slf4j
public class fnirsPlugin {

    @Autowired
    public fnirsPlugin() { }

    @Bean
    public ImporterHandlerPackages pixiImporterHandlerPackages() {
        return new ImporterHandlerPackages("org.nrg.xnatx.plugins.fnirs.bli.importer");
    }

}
