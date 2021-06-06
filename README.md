swagger URL -
http://localhost:9000/swagger-ui/index.html#/routing-controller


Flow of info - 

There is a facade class named as RoutingHolder which has one instance of domain data repository, Problem solver and score each.
Whenever new request comes to create route, create an instance of that RoutingHolder and put that in cache and return a unique uuid.
Now that uuid is always used to get the solution or get status of solve.
Once problem is solved, do a get request and get the solution.

Cachce cleaner is not needed now
--There is a cache cleaner which will run every 30 minutes and clear all old routing holder which has not been used from last 60 minutes.