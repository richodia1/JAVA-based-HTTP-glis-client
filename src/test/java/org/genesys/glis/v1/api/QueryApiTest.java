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

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.genesys.glis.v1.invoker.ApiException;
import org.genesys.glis.v1.model.PGRFA;
import org.genesys.glis.v1.model.Relationship;
import org.genesys.glis.v1.model.Term;
import org.junit.Test;

/**
 * API tests for PgrfasApi
 */
public class QueryApiTest extends BaseApiTest {

	private final QueryApi api = new QueryApi();

	/**
	 * Find passport data on PGRFA in GLIS
	 *
	 * 
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void findPgrfaTest() throws ApiException {
		List<PGRFA> response = api.search(null, null, THE_DOI, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
				null, null);
		assertThat(response.size(), greaterThan(0));
	}

	/**
	 * Get PGRFA relationships
	 *
	 * Multiple status values can be provided with comma separated strings
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void relsTest() throws ApiException {
		String role = null;
		String oper = null;
		List<Relationship> response = api.listRelationships(THE_DOI, role, oper);

		assertThat(response.size(), greaterThan(0));

	}

	/**
	 * GLIS vocabularies
	 *
	 * To describe the kind of information that will be found in the targets, GLIS adopts a simple controlled
	 * vocabulary.
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void listTermsTest() throws ApiException {
		List<String> acceptLanguage = Arrays.asList("en");
		List<Term> response = api.listTerms(acceptLanguage);

		assertThat(response.size(), greaterThan(0));

		// response.stream().forEach(t -> {
		// System.err.println("Term: " + t.getTerm());
		// });
	}

}
