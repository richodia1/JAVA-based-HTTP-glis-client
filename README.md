# Java client for the Global Information System for PGRFA

The GLIS test environment is accessible at <https://glistest.planttreaty.org/>

# Using the glis-client Java library

## Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.genesys-pgr</groupId>
    <artifactId>glis-client</artifactId>
    <version>1.0-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

## Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.genesys-pgr:glis-client:1.0-SNAPSHOT"
```

## Test and Production GLIS environment

To change the base URL of the GLIS api server (i.e. switch between production and testing environments) you must change the `ApiClient` setting:

```java
ApiClient client = // ...
client.setBasePath("https://glis.planttreaty.org")
```

This can be done either on the `Configuration.getDefaultApiClient()` singleton object:

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://glis.planttreaty.org")
```

... or when creating a new API instance:

```java
ApiClient client =new ApiClient();
client.setBasePath("https://glis.planttreaty.org");
QueryApi api = new QueryApi(client);
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import org.genesys.glis.v1.invoker.*;
import org.genesys.glis.v1.invoker.auth.*;
import org.genesys.glis.v1.model.*;
import org.genesys.glis.v1.api.QueryApi;

import java.io.File;
import java.util.*;

public class QueryApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Optionally configure HTTP basic authorization: easySmta
        HttpBasicAuth easySmta = (HttpBasicAuth) defaultClient.getAuthentication("easySmta");
        easySmta.setUsername("YOUR USERNAME");
        easySmta.setPassword("YOUR PASSWORD");

        QueryApi apiInstance = new QueryApi();
        Integer page = 1; // Integer | Request a particular page
        Integer perPage = 10; // Integer | The number of items returned in a single page
        String doi = "doi_example"; // String | Digital Object Identifier (DOI) associated to the PGRFA
        String identifier = "identifier_example"; // String | Any identifier associated with the PGRFA, excluding the DOI
        String genus = "genus_example"; // String | Genus of the PGRFA
        String species = "species_example"; // String | Species and other taxonomic elements
        String name = "name_example"; // String | Any name associated with the PGRFA
        String holdwiews = "holdwiews_example"; // String | FAO/WIEWS Institute code of the holding institution
        String holdpid = "holdpid_example"; // String | Easy-SMTA PID of the holding institution or person
        String holdname = "holdname_example"; // String | Name and surname for persons or Organization name of the holding institution or person
        String holdcountry = "holdcountry_example"; // String | ISO-3166 alpha-3 country code (https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) of the holding institution or person
        String methodcode = "methodcode_example"; // String | Code of the method through which the PGRFA has been acquired. See Table 1 for the codes accepted by this element. TODO enum
        String provwiews = "provwiews_example"; // String | FAO/WIEWS Institute code of the providing institution
        String provpid = "provpid_example"; // String | Easy-SMTA PID of the providing institution or person
        String provname = "provname_example"; // String | Name and surname for persons or Organization name of the providing institution
        String provcountry = "provcountry_example"; // String | ISO-3166 alpha-3 country code (https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) of the providing institution or person
        String provenance = "provenance_example"; // String | ISO-3166 alpha-3 country code (https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) of the providing institution or person
        String collwiews = "collwiews_example"; // String | FAO/WIEWS Institute code of the collecting institution
        String collpid = "collpid_example"; // String | Easy-SMTA PID of the collecting institution or person
        String collname = "collname_example"; // String | Name and surname for persons or Organization name of the collecting institution or person
        String collcountry = "collcountry_example"; // String | ISO-3166 alpha-3 country code (https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) of the collecting institution or person
        String bredwiews = "bredwiews_example"; // String | FAO/WIEWS Institute code of the breeding institution
        String bredpid = "bredpid_example"; // String | Easy-SMTA PID of the breeding institution or person
        String bredname = "bredname_example"; // String | Name and surname for persons or Organization name of the breeding institution or person
        String bredcountry = "bredcountry_example"; // String | ISO-3166 alpha-3 country code (https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) of the breeding institution or person
        String biostatus = "biostatus_example"; // String | Code of the biological status of sample (MCPD SAMPSTAT).
        String mlsstatus = "mlsstatus_example"; // String | Code for the inclusion into the Multilateral System.
        String targetkw = "targetkw_example"; // String | Code for the keyword for a target associated to the PGRFA. To obtain the list of keyword codes, please see \"Controlled vocabulary query\".
        try {
            List<PGRFA> result = apiInstance.search(page, perPage, doi, identifier, genus, species, name, holdwiews, holdpid, holdname, holdcountry, methodcode, provwiews, provpid, provname, provcountry, provenance, collwiews, collpid, collname, collcountry, bredwiews, bredpid, bredname, bredcountry, biostatus, mlsstatus, targetkw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PgrfaApi#search");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

Calls to GLIS API may be anonymous or use HTTP basic authentication with credentials from Easy-SMTA.

Anonymous calls are subject stricter rate limits than authenticated calls.

All URIs are relative to _<https://glistest.planttreaty.org>_

Class      | Method                                                      | HTTP request               | Description
---------- | ----------------------------------------------------------- | -------------------------- | -----------------------------------
_QueryApi_ | [**listRelationships**](docs/QueryApi.md#listRelationships) | **GET** /glisapi/v1/rels   | Get PGRFA relationships
_QueryApi_ | [**listTerms**](docs/QueryApi.md#listTerms)                 | **GET** /glisapi/v1/terms  | GLIS vocabularies
_QueryApi_ | [**search**](docs/QueryApi.md#search)                       | **GET** /glisapi/v1/pgrfas | Find passport data on PGRFA in GLIS

## Documentation for Models

- [Actor](docs/Actor.md)
- [ApiError](docs/ApiError.md)
- [Location](docs/Location.md)
- [Names](docs/Names.md)
- [OtherIdentifier](docs/OtherIdentifier.md)
- [PGRFA](docs/PGRFA.md)
- [RateLimitError](docs/RateLimitError.md)
- [Relationship](docs/Relationship.md)
- [Species](docs/Species.md)
- [Target](docs/Target.md)
- [Term](docs/Term.md)
- [TermValue](docs/TermValue.md)
- [UpdateInformation](docs/UpdateInformation.md)

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

# Development of the library

1. Update `glis.yml` definition
2. Generate code using swagger with `mvn generate-sources`

## Testing

Unit testing is skipped by default. It can be enabled by setting `-DskipTests=false` variable and providing login credentials for the client:

```bash
GLIS_USERNAME=your_username GLIS_PASSWORD=your_password mvn test -DskipTests=false
```

To see debug output of API calls set envonment variable `GLIS_DEBUG=true`:

```bash
GLIS_DEBUG=true GLIS_USERNAME=your_username GLIS_PASSWORD=your_password mvn test -DskipTests=false
```

# Other platforms

[Swagger Codegen](http://swagger.io/swagger-codegen/) can generate client SDKs for C#, Android, C++, Haskell, Javascript, Groovy, ObjC, Perl, PHP, Python, etc.

Use our [glis.yml](/src/main/resources/swagger/v1/glis.yml) to generate the API for your preferred language. If decide to make your library publicly accessible, please let us know and we'll link it here!
