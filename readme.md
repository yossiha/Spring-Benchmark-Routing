# Benchmarking Spring Routing options

## Route /

```
ab -c 10 -n 30000 http://localhost:8080/

Requests per second:    5674.52 [#/sec] (mean)
Time per request:       1.762 [ms] (mean)
Time per request:       0.176 [ms] (mean, across all concurrent requests)
Transfer rate:          1512.83 [Kbytes/sec] received
```

## Route /home

```
ab -c 10 -n 30000 http://localhost:8080/home

Requests per second:    5980.38 [#/sec] (mean)
Time per request:       1.672 [ms] (mean)
Time per request:       0.167 [ms] (mean, across all concurrent requests)
Transfer rate:          1594.38 [Kbytes/sec] received
```
## Route /static.html

```
ab -c 10 -n 30000 http://localhost:8080/static.html

Requests per second:    1886.67 [#/sec] (mean)
Time per request:       5.300 [ms] (mean)
Time per request:       0.530 [ms] (mean, across all concurrent requests)
Transfer rate:          596.96 [Kbytes/sec] received
```

## Route /statik/static.html

```
ab -c 10 -n 30000 http://localhost:8080/statik/static.html

Requests per second:    1852.41 [#/sec] (mean)
Time per request:       5.398 [ms] (mean)
Time per request:       0.540 [ms] (mean, across all concurrent requests)
Transfer rate:          586.11 [Kbytes/sec] received
```
## Route /404

```
ab -c 10 -n 30000 http://localhost:8080/404

Requests per second:    2824.83 [#/sec] (mean)
Time per request:       3.540 [ms] (mean)
Time per request:       0.354 [ms] (mean, across all concurrent requests)
Transfer rate:          670.35 [Kbytes/sec] received
```