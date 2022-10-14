create a spring boot starter project with web,lombok,datajpa and mysql /oracle driver
create java class and add annotations(@Entity ,@table,@Id,@column)
create a interface extending jparepository
create a service class and autowire repository
call the method of repository in servive class methods
register the entity bean with values
Access Entity bean and service bean using bean method
pass entity bean 
modify application file
update 
=================================================
packing application
update the pom.xml file
add elements finalName to build Section
invoke the maven goal package,skip tests
check the target folder for jar file
exit from sts
navigate to target folder
invoke java -jar jarFileName 
comment=java -jar product-service.jar
--------------------------------------------------------
expose the application as Rest service

add a rest controller
add ALL THE CRUD methods
addtionalLY add a method to find products whoseratePerunit is more than rs.200
use @Query with JPQL