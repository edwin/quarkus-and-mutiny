# Using Mutiny on Quarkus to do a Parallel API Call

## Concept
Simulating a 3 external API calls, with each API call having a 3second delay.

## Without Mutiny
```shell
$ time curl -kv http://localhost:8080/hello/
*   Trying [::1]:8080...
*   Trying 127.0.0.1:8080...
* Connected to localhost (127.0.0.1) port 8080
> GET /hello/ HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/8.4.0
> Accept: */*
>
< HTTP/1.1 200 OK
< Content-Type: application/json;charset=UTF-8
< content-length: 104
<
* Connection #0 to host localhost left intact
{"hello":"{\n\"hello\" : \"world 01\"\n},{\n\"hello\" : \"world 02\"\n},{\n\"hello\" : \"world 03\"\n}"}

real    0m 10.27s
user    0m 0.04s
sys     0m 0.15s
```

## With Mutiny
```shell
$ time curl -kv http://localhost:8080/hello/parallel
*   Trying [::1]:8080...
*   Trying 127.0.0.1:8080...
* Connected to localhost (127.0.0.1) port 8080
> GET /hello/parallel HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/8.4.0
> Accept: */*
>
< HTTP/1.1 200 OK
< Content-Type: application/json;charset=UTF-8
< content-length: 76
<
{
"hello" : "world 01"
}, {
"hello" : "world 02"
}, {
"hello" : "world 03"
* Connection #0 to host localhost left intact
}

real   0m 4.11s
user    0m 0.04s
sys     0m 0.12s

```