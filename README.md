# water
UML analysis and design: https://vodovod-4d0ca.firebaseapp.com/

# sample requests
## Person 
### POST localhost:8080/persons
	{
		"givenName":"Peter",
		"familyName":"Mladý",
		"birthNumber":"450202/123",
		"address": {
			"city":"Bratislava",
			"street":"Bajkalská",
			"zip":"82108"
		}
	}
### GET localhost:8080/persons/1
## Company
### POST localhost:8080/companies
	{
		"name":"Microsoft",
		"businessId":"12345678",
		"taxId":"11111111",
		"address": {
			"city":"Bratislava",
			"street":"Prešovská 30",
			"zip":"82108"
		}
	}
### GET localhost:8080/companies/1
## Water Connection
### POST localhost:8080/water-connections
	{
		"personId":"1",
		"contactEmail":"peter.mlady@mailcity.com",
		"contactPhone":"0903222333",
		"connectionType":"WATER_SUPPLY",
		"waterSewerageType":"HOUSEHOLD",
		"projectStatus":"PREPARED",
		"createdBy":"zdeno.jasek",	
		"deliveryPoint" :{
			"parcel":"34/a",
			"property":"HF/89",
			"area":"51",
			"address": {
				"city":"Ružomberok",
				"street":"Bajkalská",
				"zip":"82108"
			}
		}
	}
### GET localhost:8080/water-connections