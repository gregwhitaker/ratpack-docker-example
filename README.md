# ratpack-docker-example

An example of how to package a [Ratpack](https://www.ratpack.io) application as a Docker container.

## Running the Example
1. Package the application as a Docker container by running the following Gradle command:

        $ ./gradlew buildImage

   Once the build completes you will see Docker Image ID that was created in the console:
   
       > Task :buildImage
       Created image with ID '02e353fa9cc5'.
       
2. Start the newly created Docker container with the following command:

        $ docker run -p5050:5050 -d {image id}
        
3. Test that the service is running in the container by executing the following command:

        $ curl -v http://localhost:5050/example

    If successful you will receive an HTTP 200 similar to the following:
    
        *   Trying ::1...
        * TCP_NODELAY set
        * Connected to localhost (::1) port 5050 (#0)
        > GET /example HTTP/1.1
        > Host: localhost:5050
        > User-Agent: curl/7.54.0
        > Accept: */*
        >
        < HTTP/1.1 200 OK
        < content-type: text/plain;charset=UTF-8
        < content-length: 17
        <
        * Connection #0 to host localhost left intact
        This thing works!
        
## Bugs and Feedback
For bugs, questions, and discussions please use the [Github Issues](https://github.com/gregwhitaker/ratpack-docker-example/issues).

## License
MIT License

Copyright (c) 2017 Greg Whitaker

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.