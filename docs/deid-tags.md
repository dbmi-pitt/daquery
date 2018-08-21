---
layout: page
---
## Using DEID tags

DEID tags are a Daquery specific construct that can be added to the returned columns of a SQL queriy to specify if a column of data is identifiable or not and if it is identifiable, what the type of data is.

DEID tags take the form:

```
<IDENTIFIABLE [ISID=true|false] [DATESHIFT [ISBIRTHDATE]]  [ISZIPCODE]>
  or
<NOTIDENTIFIABLE>
```
IDENDIFIABLE parameters:
* **ISID** [optional] The ISID label marks the tag as identifiable or not.  If not included, the tag is defaulted to categorizing the associated data element as identifiable.  When exported, the data from this field will be de-identified by replacing the identifiers with a serialized number.

* **DATESHIFT** [optional] The DATESHIFT label marks the tag as being date data which will be randomly shifted.
  * **ISBIRTHDATE** [optional] The nested ISBIRTHDATE label marks a field already defined as a shifted date as a birthdate.  This effects the de-identified data by reporting any birthdates of a person 89 years of age or older as 89 years old, as of the current date.
* **ISZIPCODE** [optional] The ISZIPCODE label marks a field as containing a zip code.  The data for this field, when de-identified, will be truncated to the first three digits of the zip code with XX added to the end.  For example 15212 will become 152XX.

All of the above parameters are mutually exclusive and can only be applied to a column individually.  Only one of IDID, DATESHIFT and ISZIPCODE can be applied to a column- e.g. <IDENTIFIABLE ISID=true DATESHIFT> is an invalid tag.

The <NOTIDENTIFIABLE> tag marks a fields as non-identifiable data.  The data from a field marked with this tag will be exported without any changes.

### Examples:
Selects the field ABC, which will be treated as an identifier and serialized when exported.
```
select ABC<IDENTIFIABLE ISID=true> from TABLE1;
```
\\
Selects the fields B_DATE, ZIP and RACE where B_DATE will be shifted as a birthdate, ZIP will be truncated to the first three digits and RACE will left as is when exported.
```
select B_DATE<IDENTIFIABLE DATESHIFT ISBIRTHDATE>, ZIP<IDENTIFIABLE ISZIPCODE>, RACE<NOTIDENTIFIABLE> from PEOPLE;
```