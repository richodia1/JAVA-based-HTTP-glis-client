
# PGRFA

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**doi** | **String** | Digital Object Identifier (DOI) associated to the PGRFA | 
**url** | **String** | GLIS landing page for the PGRFA |  [optional]
**user** | [**Location**](Location.md) | GLIS user account who registered the PGRFA |  [optional]
**m01** | [**Location**](Location.md) | The organization, individual or legal entity conserving the PGRFA |  [optional]
**m02** | **String** | The identifier that is used to identify the PGRFA material to distinguish it from other PGRFA conserved by the holder. Precisely one identifier is specified for the material. |  [optional]
**m03** | **String** | Date on which PGRFA came into management of the holder of the PGRFA. Date fragments are also accepted, e.g. when only year or year and month are defined. |  [optional]
**m04** | [**TermValue**](TermValue.md) | Considering the date given for the previous field (Date), what event occurred on that date that resulted in the holder becoming the PGRFA holder. |  [optional]
**m05** | [**Names**](Names.md) |  |  [optional]
**r01** | [**List&lt;Target&gt;**](Target.md) | The URLs of websites where additional information on the PGRFA can be found. Each target is associated to one or more controlled vocabulary term code. |  [optional]
**r03** | [**TermValue**](TermValue.md) | Describes the conditions of provenance of the PGRFA. MCPD equivalent is Biological status of accession [SAMPSTAT]. |  [optional]
**r04** | [**Species**](Species.md) | Species:                  Specific epithet of the scientific name Species authority:        Authority for the specific epithet Subtaxa: Any additional infra-specific taxon: subspecies, variety, form, Group Subtaxon authority:       Authority for the subtaxon |  [optional]
**r05** | **List&lt;String&gt;** | Registered names or other designations, such as the name of a landrace, traditional variety or modern cultivar, or some other name or designation used to identify a breeder’s selection or elite line or variety. |  [optional]
**r06** | [**List&lt;OtherIdentifier&gt;**](OtherIdentifier.md) | Any other identifiers that have been assigned to identify the PGRFA material. |  [optional]
**r07** | [**TermValue**](TermValue.md) | The status of the PGRFA with regard to the Multilateral System of Access and Benefit-Sharing (MLS) of the International Treaty on Plant Genetic Resources for Food and Agriculture. * 0 Not available under the MLS * 1 Available under the MLS * 11 The sample is of a crop listed in Annex I and is under the management and control of a Contracting Party to the Treaty and declared to be in the public domain * 12 The sample is in a collection subject to an agreement concluded under Article 15 of the Treaty * 13 The holder received the sample with SMTA * 14 The holder has voluntarily placed the sample in the MLS * 15 The sample is derived from, and distinct from, material previously received from the MLS, is still under development and not yet ready for commercialization, and may be made available at the discretion of the developer |  [optional]
**r08** | **Boolean** | Describes whether the PGRFA is still available or permanently lost after being registered. |  [optional]
**a01** | [**Location**](Location.md) | Location or name of the person or organization that provided the PGRFA to the holder. |  [optional]
**a02** | **String** | Unique identifier used by the provider to identify the PGRFA under the provider’s management. |  [optional]
**a03** | **String** | ISO-3166 apha-3 code of country in which the PGRFA material was either collected or bred or selected, or the first country in the known history of the PGRFA. |  [optional]
**a04** | [**List&lt;Location&gt;**](Location.md) | Location of the home base of the person(s) or organization(s) that originally collected the PGRFA from in situ conditions. |  [optional]
**a05** | **String** | Identifier assigned by the collector(s) to the PGRFA collected. MCPD equivalent is Collecting number [COLLNUMB]. |  [optional]
**a06** | **String** | The identifier, if any, of the mission during which the PGRFA was collected. |  [optional]
**a07** | **String** | Location information below the country level that describes where the PGRFA was collected. |  [optional]
**a08** | [**BigDecimal**](BigDecimal.md) | Latitude of the location where the PGRFA was collected in decimal degrees. |  [optional]
**a09** | [**BigDecimal**](BigDecimal.md) | Longitude of the location where the PGRFA was collected in decimal degrees. |  [optional]
**a10** | **String** | Uncertainty of the latitude/longitude coordinates of the location where the PGRFA was collected. |  [optional]
**a11** | [**TermValue**](TermValue.md) | The geodetic datum or spatial reference system upon which the latitude/longitude coordinates of the collecting location are based. |  [optional]
**a12** | [**TermValue**](TermValue.md) | The method used to estimate latitude/longitude coordinates of the location where the PGRFA was collected. |  [optional]
**a13** | [**BigDecimal**](BigDecimal.md) | Elevation of collecting site. |  [optional]
**a14** | **String** | Date on which the PGRFA was collected. Partial dates are allowed (YYYY-MM?-DD?). |  [optional]
**a15** | [**TermValue**](TermValue.md) | A description of the nature of the location where the PGRFA was collected. |  [optional]
**a16** | [**List&lt;Location&gt;**](Location.md) | Location where the material was bred. |  [optional]
**a17** | **String** | The pedigree (genealogy) or other description of the ancestry of the PGRFA and how it was bred. |  [optional]
**info** | [**UpdateInformation**](UpdateInformation.md) |  |  [optional]



