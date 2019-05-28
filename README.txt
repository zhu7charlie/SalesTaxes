PROBLEM: SALES TAXES

A Maven Project was created on Eclipse Neon to solve this problem.

  1. It's a Plain Java 8 application -- structure & file names are all self-explanatory
  
  2. a plain inputfile.txt is in the root of application
  
  3. jUnit & Cucumber ComponentTest were included
  
  4. pushed to github, dockerHub 
    gitHub: https://github.com/zhu7charlie/SalesTaxes (https://github.com/zhu7charlie/SalesTaxes.git)
    DockerHub: https://hub.docker.com/r/zhu7charlie/cz-sales-taxes
    
  5. can clone/pull to your local and run it on IDE or DOS/Mac/CLI
    run/test on IDE (manually)
    DOS:ProjectWorkspce\mavenSalesTaxes>mvn clean install
    DOS:ProjectWorkspce\mavenSalesTaxes>mvn test
    DOS:ProjectWorkspce\mavenSalesTaxes>java -cp target\mavenSalesTaxes-0.0.1-SNAPSHOT.jar com.charlie.it.mainSalesTaxes
    
    $ docker pull zhu7charlie/cz-sales-taxes
    $ docker run zhu7charlie/cz-sales-taxes

To use Docker CLI:

cd ProjectRoot-onDockerWindow (e.g. MINGW64 ~/workspace/mavenSalesTaxes)

$ docker build -f Dockerfile -t zhu7charlie/cz-sales-taxes .

$ docker images

$ docker run zhu7charlie/cz-sales-taxes
