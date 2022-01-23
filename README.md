# beamdemojsonfile
Apache Beam Java examples.

Stack: 

Apache Beam direct runner
Maven
Java 11
Fasterxml for json parsing

Details: 
Gdp.json hve sample json data with gdp per country for specific year.

Example: 
{
  "indicator": {
    "id": "NY.GDP.MKTP.CD",
    "value": "GDP (current US$)"
  },
  "country": {
    "id": "IN",
    "value": "India"
  },
  "countryiso3code": "IND",
  "date": "2020",
  "value": 2660245248867.63,
  "unit": "",
  "obs_status": "",
  "decimal": 0
}


TextIOExecuter.java

Create default Pipeline reads json file and writes to output folder as it is without any transformation.

CountryExecutor.java

This class uses custome Options, parse json data file to java country object and do filter only Country :"Ind" 


More examples with runner will be added to this repository.




