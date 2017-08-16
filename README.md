# PizzaAd
This WebAplication 'll be can handle and help pizza orders from pizza makers  

#run
1. Install gradle 4 or use gradlew(Windows) or ./gradlew(Linux, Mac)
2. In command line gradle(w) build if you would like what build because the command bootun also build
3. (Optional) install local postgreSql : https://www.postgresql.org/download/
4. gradle bootrun

#Active Profile change
This switch can be change database protperties between application-H2.properties and application-PostgreSql

example in run command line from root directory:
gradle bootrun -Dspring.profiles.active=H2
or
gradle bootrun -Dspring.profiles.active=PostgreSql
