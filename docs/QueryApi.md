# QueryApi

All URIs are relative to *https://glistest.planttreaty.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listRelationships**](QueryApi.md#listRelationships) | **GET** /glisapi/v1/rels | Get PGRFA relationships
[**listTerms**](QueryApi.md#listTerms) | **GET** /glisapi/v1/terms | GLIS vocabularies
[**search**](QueryApi.md#search) | **GET** /glisapi/v1/pgrfas | Find passport data on PGRFA in GLIS


<a name="listRelationships"></a>
# **listRelationships**
> List&lt;Relationship&gt; listRelationships(doi, role, oper)

Get PGRFA relationships

Multiple status values can be provided with comma separated strings

### Example
```java
// Import classes:
//import org.genesys.glis.v1.invoker.ApiClient;
//import org.genesys.glis.v1.invoker.ApiException;
//import org.genesys.glis.v1.invoker.Configuration;
//import org.genesys.glis.v1.invoker.auth.*;
//import org.genesys.glis.v1.api.QueryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: easySmta
HttpBasicAuth easySmta = (HttpBasicAuth) defaultClient.getAuthentication("easySmta");
easySmta.setUsername("YOUR USERNAME");
easySmta.setPassword("YOUR PASSWORD");

QueryApi apiInstance = new QueryApi();
String doi = "doi_example"; // String | Digital Object Identifier (DOI) associated to the PGRFA for which relations are requested. Mandatory
String role = "role_example"; // String | Role of doi in the relationships. Optional, defaults to 'any'. Role in the relationship * any - Any role, default. * subject - DOI provided is the subject in the relationship. * object - DOI provided is the object in the relationship.
String oper = "oper_example"; // String | Relational operator code to filter the relations. Optional; if specified, only the relations with the given operator will be returned. Relational code * acfr - Acquired from. The PGRFA was received from a Provider. The related DOI identifies the Provider's sample * crfr - Created from. The PGRFA was obtained through crossing parent PGRFAs. The related DOIs identify the parent samples * defr - Derived from. The PGRFA was obtained from another sample. The related DOI identifies such original sample
try {
    List<Relationship> result = apiInstance.listRelationships(doi, role, oper);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#listRelationships");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doi** | **String**| Digital Object Identifier (DOI) associated to the PGRFA for which relations are requested. Mandatory |
 **role** | **String**| Role of doi in the relationships. Optional, defaults to &#39;any&#39;. Role in the relationship * any - Any role, default. * subject - DOI provided is the subject in the relationship. * object - DOI provided is the object in the relationship. | [optional]
 **oper** | **String**| Relational operator code to filter the relations. Optional; if specified, only the relations with the given operator will be returned. Relational code * acfr - Acquired from. The PGRFA was received from a Provider. The related DOI identifies the Provider&#39;s sample * crfr - Created from. The PGRFA was obtained through crossing parent PGRFAs. The related DOIs identify the parent samples * defr - Derived from. The PGRFA was obtained from another sample. The related DOI identifies such original sample | [optional]

### Return type

[**List&lt;Relationship&gt;**](Relationship.md)

### Authorization

[easySmta](../README.md#easySmta)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="listTerms"></a>
# **listTerms**
> List&lt;Term&gt; listTerms(acceptLanguage)

GLIS vocabularies

To describe the kind of information that will be found in the targets, GLIS adopts a simple controlled vocabulary.

### Example
```java
// Import classes:
//import org.genesys.glis.v1.invoker.ApiClient;
//import org.genesys.glis.v1.invoker.ApiException;
//import org.genesys.glis.v1.invoker.Configuration;
//import org.genesys.glis.v1.invoker.auth.*;
//import org.genesys.glis.v1.api.QueryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: easySmta
HttpBasicAuth easySmta = (HttpBasicAuth) defaultClient.getAuthentication("easySmta");
easySmta.setUsername("YOUR USERNAME");
easySmta.setPassword("YOUR PASSWORD");

QueryApi apiInstance = new QueryApi();
List<String> acceptLanguage = Arrays.asList("en"); // List<String> | Tags to filter by
try {
    List<Term> result = apiInstance.listTerms(acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#listTerms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | [**List&lt;String&gt;**](String.md)| Tags to filter by | [optional] [default to en] [enum: en, fr, es, ar, ru, zh]

### Return type

[**List&lt;Term&gt;**](Term.md)

### Authorization

[easySmta](../README.md#easySmta)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="search"></a>
# **search**
> List&lt;PGRFA&gt; search(page, perPage, doi, identifier, genus, species, name, holdwiews, holdpid, holdname, holdcountry, methodcode, provwiews, provpid, provname, provcountry, provenance, collwiews, collpid, collname, collcountry, bredwiews, bredpid, bredname, bredcountry, biostatus, mlsstatus, targetkw)

Find passport data on PGRFA in GLIS



### Example
```java
// Import classes:
//import org.genesys.glis.v1.invoker.ApiClient;
//import org.genesys.glis.v1.invoker.ApiException;
//import org.genesys.glis.v1.invoker.Configuration;
//import org.genesys.glis.v1.invoker.auth.*;
//import org.genesys.glis.v1.api.QueryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: easySmta
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
    System.err.println("Exception when calling QueryApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Request a particular page | [optional] [default to 1]
 **perPage** | **Integer**| The number of items returned in a single page | [optional] [default to 10]
 **doi** | **String**| Digital Object Identifier (DOI) associated to the PGRFA | [optional]
 **identifier** | **String**| Any identifier associated with the PGRFA, excluding the DOI | [optional]
 **genus** | **String**| Genus of the PGRFA | [optional]
 **species** | **String**| Species and other taxonomic elements | [optional]
 **name** | **String**| Any name associated with the PGRFA | [optional]
 **holdwiews** | **String**| FAO/WIEWS Institute code of the holding institution | [optional]
 **holdpid** | **String**| Easy-SMTA PID of the holding institution or person | [optional]
 **holdname** | **String**| Name and surname for persons or Organization name of the holding institution or person | [optional]
 **holdcountry** | **String**| ISO-3166 alpha-3 country code (https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) of the holding institution or person | [optional]
 **methodcode** | **String**| Code of the method through which the PGRFA has been acquired. See Table 1 for the codes accepted by this element. TODO enum | [optional]
 **provwiews** | **String**| FAO/WIEWS Institute code of the providing institution | [optional]
 **provpid** | **String**| Easy-SMTA PID of the providing institution or person | [optional]
 **provname** | **String**| Name and surname for persons or Organization name of the providing institution | [optional]
 **provcountry** | **String**| ISO-3166 alpha-3 country code (https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) of the providing institution or person | [optional]
 **provenance** | **String**| ISO-3166 alpha-3 country code (https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) of the providing institution or person | [optional]
 **collwiews** | **String**| FAO/WIEWS Institute code of the collecting institution | [optional]
 **collpid** | **String**| Easy-SMTA PID of the collecting institution or person | [optional]
 **collname** | **String**| Name and surname for persons or Organization name of the collecting institution or person | [optional]
 **collcountry** | **String**| ISO-3166 alpha-3 country code (https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) of the collecting institution or person | [optional]
 **bredwiews** | **String**| FAO/WIEWS Institute code of the breeding institution | [optional]
 **bredpid** | **String**| Easy-SMTA PID of the breeding institution or person | [optional]
 **bredname** | **String**| Name and surname for persons or Organization name of the breeding institution or person | [optional]
 **bredcountry** | **String**| ISO-3166 alpha-3 country code (https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) of the breeding institution or person | [optional]
 **biostatus** | **String**| Code of the biological status of sample (MCPD SAMPSTAT). | [optional]
 **mlsstatus** | **String**| Code for the inclusion into the Multilateral System. | [optional]
 **targetkw** | **String**| Code for the keyword for a target associated to the PGRFA. To obtain the list of keyword codes, please see \&quot;Controlled vocabulary query\&quot;. | [optional]

### Return type

[**List&lt;PGRFA&gt;**](PGRFA.md)

### Authorization

[easySmta](../README.md#easySmta)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, application/brapi, application/zip, application/ld+json

