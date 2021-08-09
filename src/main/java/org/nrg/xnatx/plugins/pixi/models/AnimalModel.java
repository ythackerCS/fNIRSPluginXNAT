package org.nrg.xnatx.plugins.pixi.models;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nullable;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@Slf4j
public class AnimalModel {

    @ApiModelProperty(example = "WUAM1")
    @NotBlank
    private String id;

    @ApiModelProperty(example = "Wash U Animal Model 1")
    @NotBlank
    private String name;

    @ApiModelProperty(example = "[\"WUPDX1\", \"WUPDX1\" ]")
    @Nullable
    private List<String> pdxIDs;

    @ApiModelProperty(example = "NIH-3T3")
    @Nullable
    private String cellLine;

    @ApiModelProperty(example = "P4")
    @Nullable
    private String passage;

    @ApiModelProperty(example = "false")
    @Nullable
    private Boolean isImmuneSystemHumanized;

    @ApiModelProperty(example = "CD34þ hematopoietic stem cell-engrafted/PBMC/thymus/thymus-fetal liver/iPSC/other")
    @Nullable
    private String humanizationType;

    //TODO Other Humanization Type
}