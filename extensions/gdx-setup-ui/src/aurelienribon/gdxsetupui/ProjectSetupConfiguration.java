/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package aurelienribon.gdxsetupui;

/**
 * Skeleton for all the parameters related to the configuration of a project.
 * @author Aurelien Ribon | http://www.aurelienribon.com/
 */
public class ProjectSetupConfiguration extends BaseProjectConfiguration {
	public String mainClassName = "MyGdxGame";
	public String packageName = "com.me.mygdxgame";
	public String androidMinSdkVersion = "5";
	public String androidTargetSdkVersion = "19";
	public String androidMaxSdkVersion = "";
}
