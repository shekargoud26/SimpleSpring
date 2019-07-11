# SimpleSpring
A simple spring application to understand dependency injection  
  
  
**Defenition:**  

In software engineering, dependency injection is a technique whereby one object (or static method) supplies the dependencies of another object. A dependency is an object that can be used (a service). An injection is the passing of a dependency to a dependent object (a client) that would use it. The service is made part of the client's state. Passing the service to the client, rather than allowing a client to build or find the service, is the fundamental requirement of the pattern.
    
**Analogy:**  

Your CD Player is useless without a CD with music on it... (It's dependent on the CD). If they built CD Players with the CD already in it, it would get boring very quickly...
So they build them so you can "inject" the CD, (on which it is dependent) into the player. That way you can inject a different one each time, and get "different" behavior (music) dependent on which one you inject.
The only requirement is that the CD must be compatible with the interface defined by the player. (You can't play a blue-ray disk in a 1992 CD player.)
