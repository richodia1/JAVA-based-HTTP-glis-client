/*
 * Copyright 2017 Global Crop Diversity Trust
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
 */

package org.genesys.glis.v1.api;

import org.genesys.glis.v1.invoker.ApiClient;
import org.genesys.glis.v1.invoker.Configuration;
import org.genesys.glis.v1.invoker.auth.HttpBasicAuth;
import org.junit.BeforeClass;

public abstract class BaseApiTest {

	public static final String THE_DOI = "10.0155/1";

	protected static String GLIS_USERNAME = System.getenv("GLIS_USERNAME");
	protected static String GLIS_PASSWORD = System.getenv("GLIS_PASSWORD");

	@BeforeClass
	public static void config() {
		ApiClient defaultClient = Configuration.getDefaultApiClient();
		if ("true".equals(System.getenv("GLIS_DEBUG"))) {
			defaultClient.setDebugging(true);
		}
		// Configure HTTP basic authorization: glis_auth
		HttpBasicAuth easySmtaAuth = (HttpBasicAuth) defaultClient.getAuthentication("easySmta");
		easySmtaAuth.setUsername(GLIS_USERNAME);
		System.out.println("Using GLIS username " + easySmtaAuth.getUsername());
		easySmtaAuth.setPassword(GLIS_PASSWORD);
	}
}
