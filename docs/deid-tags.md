---
layout: page
---
## Using DEID tags

DEID tags are a Daquery specific construct that can be added to the returned columns of a SQL querie to specify if a column of data is identifiable or not and if it is identifiable, what the type of data is.

DEID tags take the form:

```
<IDENTIFIABLE [ISID=true|false] [DATESHIFT [ISBIRTHDATE]]  [ISZIPCODE] [OBFUSCATE]>
```
* **ISID** [optional] The ISID label marks the tag as identifiable or not.  If not included, the tag is defaulted to categorizing the associated data element as identifiable.

* **DATESHIFT** [optional] The DATESHIFT label marks the tag as being date data which will be randomly shifted.
  * **ISBIRTHDATE** [optional] The nested ISBIRTHDATE label marks a field already defined as a shifted date as a birthdate.  This effects the de-identified data by reporting any birthdates of a person 89 years of age or older as 89 years old, as of the current date.
* **ISZIPCODE** [optional] The ISZIPCODE label marks a field as containing a zip code.  The data for this field, when de-identified, will be truncated to the first three digits of the zip code with XX added to the end.  For example 15212 will become 152XX.

* **OBFUSCATE** [optional] The OBFUSCATE label marks a field as containing aggregate (count) level data that will be obfuscated based on the policy defined in the Network properties page.

All of the above parameters, except for ISID cannot be combined with other parmeters.  Only DATESHIFT, ISZIPCODE, or OBFUSCATE can be specified at one time.

Examples:

