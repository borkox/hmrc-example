# Axis 2 service

## Build

`mvn -Dmaven.wagon.http.ssl.insecure=true clean compile axis2:aar`

## Deploy
Simply drop the target/quote-service-1.0-SNAPSHOT.aar into axis server' folder `repository/services`.
I couldn't deploy on axis2 inside wso2 because I hit bug:
https://wso2.org/jira/browse/CARBON-12682
So I downloaded fresh axis2 server and used it for demo.


## Access the service sample URL
http://localhost:8080/axis2/services/QuotationService?wsdl

##Access through API service
set header "SOAPAction":
<soap12:operation soapAction="" style="document"/> 
see: https://stackoverflow.com/questions/5981379/the-endpoint-reference-epr-for-the-operation-not-found-is/24493440
