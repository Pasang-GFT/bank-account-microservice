 # Code Analysis

## sonar-project.properties

This file is used to configure the SonarQube analysis.

## sonar.projectKey

The `sonar.projectKey` property is used to uniquely identify the project in SonarQube. It must be unique in a given SonarQube instance.

## sonar.projectName

The `sonar.projectName` property is used to specify the name and version of the project that will be displayed in the SonarQube UI. This property was mandatory prior to SonarQube 6.1.

## sonar.projectVersion

The `sonar.projectVersion` property is used to specify the version of the project that will be displayed in the SonarQube UI.

## sonar.sources

The `sonar.sources` property is used to specify the path to the source code that will be analyzed. The path is relative to the `sonar-project.properties` file. Replace "\" by "/" on Windows. This property is optional if `sonar.modules` is set.

## sonar.sourceEncoding

The `sonar.sourceEncoding` property is used to specify the encoding of the source code. The default is the default system encoding.