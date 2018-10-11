HMRC Task
========================================================

I created a spring boot project which contains 3 REST operations:
 folder: springbootrest
 run: mvn -X spring-boot:run
 POST   http://localhost:8080/quotations/add
 GET    http://localhost:8080/quotations/all
 DELETE http://localhost:8080/quotations/removeAll

I created a carbon app which will create Proxy and API around the above mentioned service:
 Carbon app is here: 
    eclipse-wso2-workspace\quotationsCompositeApplication\target\quotationsCompositeApplication_1.0.0.car
 The carbon app introduces mediation logic for logging.
 POST   http://localhost:8280/quotations/add
 GET    http://localhost:8280/quotations/all
 DELETE http://localhost:8280/quotations/removeAll
 
The carbon application will create proxy which will return XML transformed from JSON:
 It can be tested with browser tools on this address:
 https://localhost:9443/services/QuotationsTransofmProxy?tryit

SOAP UI project:
 QuotationREST-soapui-project.xml

================= Other experiments ===================

SOAP services:
see folder: axisws
see folder: springbootws
I created API wrapping axisws and put screenshots in folder "screenshots".

 
