# soap-ui

This is a simple project with some JAX-WS Webservices with SOAP / JAX-RS RESTFul Webservices and SoapUI project example to test this services.

# SOAP

## Usage

### Using the standalone built in jdk server for publish the webservices
- `com.matafe.soap.Publisher`

### Example of a client consumer
- `com.matafe.calculator.soap.client.CalculatorClient`

The aplication can be deployed in a Servlet Container as Tomcat 

http://localhost:8080/soap-ui/

or

http://localhost:8080/soap-ui/Calculator
<br/>
http://localhost:8080/soap-ui/PersonService
<br/>
http://localhost:8080/soap-ui/PingService

The SoapUI project is in the base dir: `soap-ui-soapui-project.xml`

# REST

## Usage

### Using the standalone Grizzly HTTP server for publish the services
- `com.matafe.rest.Main`

### Example of a client consumer
- `com.matafe.person.rest.client.PersonClient`


Check the file curl.txt for some call examples.

You can check the WADL here: http://localhost:8080/soap-ui/application.wadl
