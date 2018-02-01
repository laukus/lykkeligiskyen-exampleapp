# lykkeligiskyen-exampleapp

Build: 
```
mvn package
```

Usage:
```
 java -jar timeservice-1.0-SNAPSHOT.jar server
```
--

Build Docker Container:
```
docker build . -t lykkelig
```
Run Docker Container:
```
docker run -i -p 80:8080 lykkelig
```

--

The application consist of one single service, available on the endpoint /time.
Currently on port 8080, or port 80 when running a Docker container.

The service returns the following Json String:

```
{"id":"332b8e31-1666-4ae9-a2bb-b0ef3ca95260","time":"2018-02-01T22:35:25.089Z"}
```

id: Randomly generated GUID, a unique id for the applicaton instance.

time: Textual reprentation of the current date/time,