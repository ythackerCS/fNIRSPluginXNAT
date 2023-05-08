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

//@Slf4j
//public class BliScanBuilder implements Callable<XnatImagescandataBean> {
//
//    private final Path scanDir;
//
//    public BliScanBuilder(final Path scanDir) {
//        this.scanDir = scanDir;
//    }
//
////    @Override
////    public XnatImagescandataBean call() throws IOException {
////        log.debug("Building BLI scans for {}", scanDir);
////
////        String id = scanDir.getFileName().toString();
////
////        File resourceCatalogXml = new File(scanDir.toFile(), "scan_catalog.xml");
////        XnatResourcecatalogBean resourceCatalog = new XnatResourcecatalogBean();
////
////        resourceCatalog.setUri(Paths.get("SCANS", id, "scan_catalog.xml").toString());
////        resourceCatalog.setLabel("BLI");
////        resourceCatalog.setFormat("BLI");
////        resourceCatalog.setContent("BLI");
////        resourceCatalog.setDescription("BLI Scan data");
////
////        CatCatalogBean catCatalogBean = new CatCatalogBean();
////
////        Files.list(scanDir)
////             .map(this::createCatalogEntry)
////             .forEach(catCatalogBean::addEntries_entry);
////
////        try (FileWriter resourceCatalogXmlWriter = new FileWriter(resourceCatalogXml)) {
////            catCatalogBean.toXML(resourceCatalogXmlWriter, true);
////        } catch (IOException e) {
////            log.error("Unable to write scan catalog", e);
////        }
////
////        return
////    }
//
//    private CatEntryBean createCatalogEntry(Path path) {
//        CatEntryBean catEntryBean = new CatEntryBean();
//        catEntryBean.setUri(String.valueOf(path.getFileName()));
//        return catEntryBean;
//    }
//
//}
