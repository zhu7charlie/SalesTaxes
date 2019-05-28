FROM java:8
#EXPOSE 8080
MAINTAINER Changhai Zhu
COPY input1.txt ./
COPY input2.txt ./
COPY input3.txt ./
ADD target/mavenSalesTaxes-0.0.1-SNAPSHOT.jar czSalesTaxes.jar
ENTRYPOINT ["java","-cp", "czSalesTaxes.jar", "com.charlie.it.mainSalesTaxes" ]
#CMD exec java -cp /czSalesTaxes.jar com.charlie.it.mainSalesTaxes