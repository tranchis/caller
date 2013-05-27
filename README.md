# Caller

Caller is a utility library that allows to call SOAP web services without having to use fully WSDL compliant stub classes.

Caller allows for using any kind of input and output classes for generating the SOAP request, and as long as the getters and setters of such classes
have the same name as the attributes of the datatypes defined in the XSD part of the WSDL of the service, the matching is made in an automatic fashion.

## Usage

The provided class is com.github.tranchis.caller.Caller and the syntax of the call is:

```java
Caller c = new Caller();
result = c.callService(
  "http://server:port/webapp/service?WSDL#operationName",
  new Object[] { input1, input2 },
  OutputClass.class);
```

The first parameter points to the operation section of the service WSDL, the second parameter is an array of objects with the inputs that match
the inputs of the SOAP request, and the third parameter is the class that matches the SOAP response.

## License

The code contributed for this package is licensed under LGPL v3 (see LICENSE).
