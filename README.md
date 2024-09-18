# Redis-Integration-with-Spring-Boot
<h2>How to integrate redis into spring boot application and performing CURD operation</h2>
<h3>What is Redis?</h3>
<p>Remote Dictionary Server, aka Redis, an in-memory data store, is one of the many options for implementing caching in Spring Boot applications due to its speed, versatility, and simplicity of use. It is a versatile key-value store that supports several data structures, such as Strings, Sorted Sets, Hashes, Lists, Streams, Bitmaps, Sets, etc., because it is a NoSQL database and doesn’t need a predetermined schema.</p>

<h3>How does Redis work?</h3>
<p>Redis effectively stores the results of database retrieval operations, allowing subsequent requests to retrieve the data directly from the cache. This significantly enhances application performance by reducing unnecessary database calls.</p>

<h3>Integrate redis in your spring boot application</h3>
<h6>Add dependency </h6>
<h5>
  <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-redis</artifactId>
		</dependency>
</h5>
<h3>Configure redis using application.properties</h3>
<p>
  <br>spring.data.redis.host=localhost
</br>
  <br>
  spring.data.redis.port=6379
  </br>
</p>
<h3>Check repository code for the CURD operation </h3>
