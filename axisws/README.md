# Axis 2 service

## Build
`mvn -Dmaven.wagon.http.ssl.insecure=true clean compile axis2:aar`

## Deploy
Simply drop the target/quote-service-1.0-SNAPSHOT.aar into axis server' folder `repository/services`.

## Access the service sample URL
http://localhost:8080/axis2/services/QuoteBean?wsdl
