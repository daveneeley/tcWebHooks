package webhook.testframework;

import java.io.File;
import java.io.IOException;

import org.jdom.JDOMException;

import webhook.teamcity.payload.WebHookPayloadManager;
import webhook.teamcity.payload.content.WebHookPayloadContent;
import webhook.teamcity.settings.WebHookConfig;
import webhook.teamcity.settings.WebHookProjectSettings;
import jetbrains.buildServer.serverSide.SBuildServer;
import jetbrains.buildServer.serverSide.SBuildType;
import jetbrains.buildServer.serverSide.SFinishedBuild;
import jetbrains.buildServer.serverSide.SRunningBuild;

public interface WebHookMockingFramework {
	
	public SBuildServer getServer();
	public SRunningBuild getRunningBuild();
	public SBuildType getSBuildType();
	public WebHookConfig getWebHookConfig();
	public WebHookPayloadContent getWebHookContent();
	public WebHookPayloadManager getWebHookPayloadManager();
	public WebHookProjectSettings getWebHookProjectSettings();
	public void loadWebHookConfigXml(File xmlConfigFile) throws JDOMException, IOException;
	public void loadWebHookProjectSettingsFromConfigXml(File xmlConfigFile) throws IOException, JDOMException;

}
