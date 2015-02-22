Minimal web app combining CDI (Weld), MVC 1.0 (Ozark) and Jetty

*currently broken*

I wanted to play around with Ozark, the MVC 1.0 reference
implementation, without having to use Glassfish, so I spent some time
hunting for the right combination of Maven, web.xml and Jetty
settings.

The current implementation does not work: It throws a
`java.lang.IllegalArgumentException` saying `interface org.glassfish.hk2.api.ProxyCtl is not visible from class loader`. 

