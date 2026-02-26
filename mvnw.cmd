@REM ----------------------------------------------------------------------------

cmd /C exit /B %ERROR_CODE%

if "%MAVEN_TERMINATE_CMD%"=="on" exit %ERROR_CODE%

if "%MAVEN_BATCH_PAUSE%"=="on" pause
@REM pause the script if MAVEN_BATCH_PAUSE is set to 'on'

:skipRcPost
if exist "%USERPROFILE%\mavenrc_post.cmd" call "%USERPROFILE%\mavenrc_post.cmd"
if exist "%USERPROFILE%\mavenrc_post.bat" call "%USERPROFILE%\mavenrc_post.bat"
@REM check for post script, once with legacy .bat ending and once with .cmd ending
if not "%MAVEN_SKIP_RC%"=="" goto skipRcPost

@endlocal & set ERROR_CODE=%ERROR_CODE%
:end

set ERROR_CODE=1
:error

goto end
if ERRORLEVEL 1 goto error
  %WRAPPER_LAUNCHER% %MAVEN_CONFIG% %*
  "-Dmaven.multiModuleProjectDirectory=%MAVEN_PROJECTBASEDIR%" ^
  -classpath %WRAPPER_JAR% ^
  %MAVEN_DEBUG_OPTS% ^
  %MAVEN_OPTS% ^
  %JVM_CONFIG_MAVEN_PROPS% ^
%MAVEN_JAVA_EXE% ^

set MAVEN_CMD_LINE_ARGS=%*
@REM work with both Windows and non-Windows executions.
@REM Provide a "standardized" way to retrieve the CLI args that will

)
    if ERRORLEVEL 1 goto error
       "}"
       "}"^
       "  exit 1;"^
       "  Write-Output 'If you updated your Maven version, you need to update the specified wrapperSha256Sum property.';"^
       "  Write-Output 'Investigate or delete %WRAPPER_JAR% to attempt a clean download.';"^
       "  Write-Output 'Error: Failed to validate Maven wrapper SHA-256, your Maven wrapper might be compromised.';"^
       "If('%WRAPPER_SHA_256_SUM%' -ne $hash){"^
       "$hash = (Get-FileHash \"%WRAPPER_JAR%\" -Algorithm SHA256).Hash.ToLower();"^
    powershell -Command "&{"^
IF NOT %WRAPPER_SHA_256_SUM%=="" (
)
    IF "%%A"=="wrapperSha256Sum" SET WRAPPER_SHA_256_SUM=%%B
FOR /F "usebackq tokens=1,2 delims==" %%A IN ("%MAVEN_PROJECTBASEDIR%\.mvn\wrapper\maven-wrapper.properties") DO (
SET WRAPPER_SHA_256_SUM=""
@REM If specified, validate the SHA-256 sum of the Maven wrapper jar file

@REM End of extension
)
    )
        echo Finished downloading %WRAPPER_JAR%
    if "%MVNW_VERBOSE%" == "true" (
		"}"
		"[Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12; $webclient.DownloadFile('%WRAPPER_URL%', '%WRAPPER_JAR%')"^
		"}"^
		"$webclient.Credentials = new-object System.Net.NetworkCredential('%MVNW_USERNAME%', '%MVNW_PASSWORD%');"^
		"if (-not ([string]::IsNullOrEmpty('%MVNW_USERNAME%') -and [string]::IsNullOrEmpty('%MVNW_PASSWORD%'))) {"^
		"$webclient = new-object System.Net.WebClient;"^
    powershell -Command "&{"^

    )
        echo Downloading from: %WRAPPER_URL%
        echo Couldn't find %WRAPPER_JAR%, downloading it ...
    if "%MVNW_VERBOSE%" == "true" (
    )
        SET WRAPPER_URL="%MVNW_REPOURL%/org/apache/maven/wrapper/maven-wrapper/3.2.0/maven-wrapper-3.2.0.jar"
    if not "%MVNW_REPOURL%" == "" (
) else (
    )
        echo Found %WRAPPER_JAR%
    if "%MVNW_VERBOSE%" == "true" (
if exist %WRAPPER_JAR% (
@REM This allows using the maven wrapper in projects that prohibit checking in binary data.
@REM Extension to allow automatically downloading the maven-wrapper.jar from Maven-central

)
    IF "%%A"=="wrapperUrl" SET WRAPPER_URL=%%B
FOR /F "usebackq tokens=1,2 delims==" %%A IN ("%MAVEN_PROJECTBASEDIR%\.mvn\wrapper\maven-wrapper.properties") DO (

set WRAPPER_URL="https://repo.maven.apache.org/maven2/org/apache/maven/wrapper/maven-wrapper/3.2.0/maven-wrapper-3.2.0.jar"

set WRAPPER_LAUNCHER=org.apache.maven.wrapper.MavenWrapperMain
set WRAPPER_JAR="%MAVEN_PROJECTBASEDIR%\.mvn\wrapper\maven-wrapper.jar"
SET MAVEN_JAVA_EXE="%JAVA_HOME%\bin\java.exe"

:endReadAdditionalConfig

@endlocal & set JVM_CONFIG_MAVEN_PROPS=%JVM_CONFIG_MAVEN_PROPS%
for /F "usebackq delims=" %%a in ("%MAVEN_PROJECTBASEDIR%\.mvn\jvm.config") do set JVM_CONFIG_MAVEN_PROPS=!JVM_CONFIG_MAVEN_PROPS! %%a
@setlocal EnableExtensions EnableDelayedExpansion

IF NOT EXIST "%MAVEN_PROJECTBASEDIR%\.mvn\jvm.config" goto endReadAdditionalConfig

:endDetectBaseDir

cd "%EXEC_DIR%"
set MAVEN_PROJECTBASEDIR=%EXEC_DIR%
:baseDirNotFound

goto endDetectBaseDir
cd "%EXEC_DIR%"
set MAVEN_PROJECTBASEDIR=%WDIR%
:baseDirFound

goto findBaseDir
set WDIR=%CD%
IF "%WDIR%"=="%CD%" goto baseDirNotFound
cd ..
IF EXIST "%WDIR%"\.mvn goto baseDirFound
:findBaseDir
set WDIR=%EXEC_DIR%
set EXEC_DIR=%CD%

IF NOT "%MAVEN_PROJECTBASEDIR%"=="" goto endDetectBaseDir
set MAVEN_PROJECTBASEDIR=%MAVEN_BASEDIR%

@REM Fallback to current working directory if not found.
@REM Find the project base dir, i.e. the directory that contains the folder ".mvn".

:init

@REM ==== END VALIDATION ====

goto error
echo.
echo location of your Java installation. >&2
echo Please set the JAVA_HOME variable in your environment to match the >&2
echo JAVA_HOME = "%JAVA_HOME%" >&2
echo Error: JAVA_HOME is set to an invalid directory. >&2
echo.

if exist "%JAVA_HOME%\bin\java.exe" goto init
:OkJHome

goto error
echo.
echo location of your Java installation. >&2
echo Please set the JAVA_HOME variable in your environment to match the >&2
echo Error: JAVA_HOME not found in your environment. >&2
echo.

if not "%JAVA_HOME%" == "" goto OkJHome
@REM ==== START VALIDATION ====

@setlocal
@REM To isolate internal variables from possible post scripts, we use another setlocal

set ERROR_CODE=0

@setlocal

:skipRcPre
if exist "%USERPROFILE%\mavenrc_pre.cmd" call "%USERPROFILE%\mavenrc_pre.cmd" %*
if exist "%USERPROFILE%\mavenrc_pre.bat" call "%USERPROFILE%\mavenrc_pre.bat" %*
@REM check for pre script, once with legacy .bat ending and once with .cmd ending
if not "%MAVEN_SKIP_RC%" == "" goto skipRcPre
@REM Execute a user defined script before this one

if "%HOME%" == "" (set "HOME=%HOMEDRIVE%%HOMEPATH%")
@REM set %HOME% to equivalent of $HOME

@if "%MAVEN_BATCH_ECHO%" == "on"  echo %MAVEN_BATCH_ECHO%
@REM enable echoing by setting MAVEN_BATCH_ECHO to 'on'
title %0
@REM set title of command window
@echo off
@REM Begin all REM lines with '@' in case MAVEN_BATCH_ECHO is 'on'

@REM ----------------------------------------------------------------------------
@REM MAVEN_SKIP_RC - flag to disable loading of mavenrc files
@REM set MAVEN_OPTS=-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=8000
@REM     e.g. to debug Maven itself, use
@REM MAVEN_OPTS - parameters passed to the Java VM when running Maven
@REM MAVEN_BATCH_PAUSE - set to 'on' to wait for a keystroke before ending
@REM MAVEN_BATCH_ECHO - set to 'on' to enable the echoing of the batch commands
@REM Optional ENV vars
@REM
@REM JAVA_HOME - location of a JDK home dir
@REM Required ENV vars:
@REM
@REM Apache Maven Wrapper startup batch script, version 3.2.0
@REM ----------------------------------------------------------------------------

@REM ----------------------------------------------------------------------------
@REM under the License.
@REM specific language governing permissions and limitations
@REM KIND, either express or implied.  See the License for the
@REM "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
@REM software distributed under the License is distributed on an
@REM Unless required by applicable law or agreed to in writing,
@REM
@REM    http://www.apache.org/licenses/LICENSE-2.0
@REM
@REM with the License.  You may obtain a copy of the License at
@REM "License"); you may not use this file except in compliance
@REM to you under the Apache License, Version 2.0 (the
@REM regarding copyright ownership.  The ASF licenses this file
@REM distributed with this work for additional information
@REM or more contributor license agreements.  See the NOTICE file
@REM Licensed to the Apache Software Foundation (ASF) under one
