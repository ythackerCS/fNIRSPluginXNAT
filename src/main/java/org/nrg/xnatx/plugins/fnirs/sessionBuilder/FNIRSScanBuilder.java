package org.nrg.xnatx.plugins.fnirs.sessionBuilder;

import lombok.extern.slf4j.Slf4j;
import org.apache.axis.utils.StringUtils;
import org.nrg.xdat.XDAT;
import org.nrg.xdat.bean.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;
import java.util.concurrent.Callable;

@Slf4j
public class FNIRSScanBuilder implements Callable<XnatImagescandataBean> {

    private final Path scanDir;
    private final FnirsFnirsscandataBean fnirsScan;

    public FNIRSScanBuilder(final Path scanDir) {
        this.scanDir = scanDir;
        this.fnirsScan = new FnirsFnirsscandataBean();
    }

    @Override
    public XnatImagescandataBean call() throws IOException {
        log.debug("Building BLI scans for {}", scanDir);

        String id = scanDir.getFileName().toString();

        fnirsScan.setId(id);
        fnirsScan.setType("FNIRS");
        fnirsScan.setUid(UUID.randomUUID().toString());

//        fnirsScan.setOperator(analyzedClickInfo.getUserLabelNameSet().getUser());
//
//        if (StringUtils.isEmpty(analyzedClickInfo.getClickNumber().getClickNumber())) {
//            log.info("Unable to find a UID in AnalyzedClickInfo.txt for scan {}. Will generate a random UID instead.", bliScan.getId());
//            fnirsScan.setUid(UUID.randomUUID().toString());
//        } else {
//            fnirsScan.setUid(analyzedClickInfo.getClickNumber().getClickNumber());
//        }

        // Set scan datetime
//        fnirsScan.setStartDate(analyzedClickInfo.getLuminescentImage().getAcquisitionDateTime());

        File resourceCatalogXml = new File(scanDir.toFile(), "scan_catalog.xml");
        XnatResourcecatalogBean resourceCatalog = new XnatResourcecatalogBean();

        resourceCatalog.setUri(Paths.get("SCANS", id, "scan_catalog.xml").toString());
        resourceCatalog.setLabel("FNIRS");
        resourceCatalog.setFormat("FNIRS");
        resourceCatalog.setContent("FNIRS");
        resourceCatalog.setDescription("FNIRS Scan data");

        CatCatalogBean catCatalogBean = new CatCatalogBean();

        Files.list(scanDir)
                .map(this::createCatalogEntry)
                .forEach(catCatalogBean::addEntries_entry);

        fnirsScan.addFile(resourceCatalog);

        try (FileWriter resourceCatalogXmlWriter = new FileWriter(resourceCatalogXml)) {
            catCatalogBean.toXML(resourceCatalogXmlWriter, true);
        } catch (IOException e) {
            log.error("Unable to write scan catalog", e);
        }

        return fnirsScan;
    }

    private CatEntryBean createCatalogEntry(Path path) {
        CatEntryBean catEntryBean = new CatEntryBean();
        catEntryBean.setUri(String.valueOf(path.getFileName()));
        return catEntryBean;
    }
}
