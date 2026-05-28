# fNIRSPluginXNAT

## Overview

`fNIRSPluginXNAT` is an XNAT plugin that adds support for functional near-infrared spectroscopy (fNIRS) data within the XNAT imaging informatics platform. The plugin was developed to support Optical-imaging XNAT-enabled Informatics (OXI), an open-source infrastructure for organizing, sharing, and processing optical neuroimaging data across research groups.

This plugin extends XNAT so that fNIRS datasets can be uploaded, organized, viewed, and connected to containerized processing workflows in a structure that is accessible to both computational and non-computational researchers.

## Motivation

fNIRS and diffuse optical tomography (DOT) studies often require specialized data organization, preprocessing, and analysis workflows. Many existing imaging informatics systems are optimized for MRI, CT, or PET data and do not natively support fNIRS-specific acquisition structures or downstream analysis needs.

This plugin helps address that gap by adding fNIRS-aware data organization to XNAT and enabling integration with containerized NeuroDOT processing workflows.

## Key Features

- Adds a custom fNIRS data type to XNAT
- Supports upload and organization of fNIRS data files
- Defines subject, session, scan, and assessor structures for fNIRS workflows
- Integrates with XNAT Container Service for reproducible processing
- Supports browser-accessible outputs from analysis pipelines
- Designed for use with OXI and NeuroDOT-based fNIRS/DOT workflows

## Intended Use

This plugin is intended for research groups using XNAT to manage optical neuroimaging data, especially studies involving:

- Functional near-infrared spectroscopy (fNIRS)
- Diffuse optical tomography (DOT)
- NeuroDOT processing workflows
- Multi-site optical imaging collaborations
- Containerized analysis pipelines

## Repository Structure

fNIRSPluginXNAT/
├── src/                 # Java source code for the XNAT plugin
├── scripts/             # Supporting scripts, if applicable
├── gradle/              # Gradle wrapper and build files
├── build.gradle         # Plugin build configuration
├── settings.gradle      # Gradle project settings
└── README.md
Requirements
XNAT
Java
Gradle
XNAT Plugin Development Environment
Optional: XNAT Container Service for running processing containers

Exact version requirements may depend on the XNAT instance where the plugin is deployed.

Installation

Clone the repository:

git clone https://github.com/ythackerCS/fNIRSPluginXNAT.git
cd fNIRSPluginXNAT

Build the plugin:

./gradlew jar

Copy the generated plugin JAR into the XNAT plugins directory:

cp build/libs/*.jar /path/to/xnat/plugins/

Restart XNAT after installing the plugin.

sudo service tomcat restart

The exact restart command may vary depending on the XNAT deployment.

Example Workflow
Install the plugin on an XNAT instance.
Upload fNIRS data into the appropriate subject/session structure.
Organize fNIRS scans and related resources using the plugin-defined data type.
Run containerized NeuroDOT preprocessing, reconstruction, or analysis workflows through XNAT Container Service.
View pipeline outputs, figures, notebooks, or derived files through the XNAT web interface.
Related Projects
NeuroDOT_py: Python toolbox for optical brain mapping
FullProcessing_BIDS_NeuroDOT-Container: Containerized NeuroDOT processing workflow
Reconstruction_BIDS_NeuroDOT-Container: Containerized NeuroDOT reconstruction workflow
OXI: Optical-imaging XNAT-enabled Informatics platform for fNIRS data organization and processing
Notes

This plugin was developed for research use and may require adaptation for specific XNAT deployments or institutional workflows. Users should have familiarity with XNAT plugin installation and XNAT Container Service configuration.

Citation

If this plugin or related OXI tools are useful in your work, please cite the associated OXI, NeuroDOT, or fNIRS workflow publications when available.

Status

Research software. Active development may occur as OXI and NeuroDOT workflows evolve.


For your NeuroDOT container READMEs, I would also replace the intro with something like this:

# NeuroDOT Preprocessing Container

## Overview

This Docker container runs a NeuroDOT preprocessing workflow using Papermill. It mounts fNIRS subject data from an XNAT scan resource, executes a preprocessing notebook, saves generated figures, and exports the completed notebook for review.

The container was designed to make NeuroDOT preprocessing reproducible and accessible through XNAT Container Service.

## Outputs

- Executed preprocessing notebook
- Saved figures from the workflow
- Processed intermediate files, depending on notebook configuration
