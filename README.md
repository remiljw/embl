# EMBL

## Project

This repo consists of two projects in two folders, one is a perl script which converts chromomsomes with the [Ensembl API](http://www.ensembl.org/)located in the `ensmbl-perl` folder and the other, a Java(Spring) API to fetch data from two primary tables located in the `ensemble-table-api` folder.

## Software Requirements 
To run both of these projects sucessfully, you will need to have some software readily installed on your OS. 
#### Requirements for the Java(Spring) Project: 
  - Java 17 or later. Download [here](https://www.oracle.com/java/technologies/downloads/)
  - [Maven](https://maven.apache.org/install.html)
  - [PostgreSQL](https://www.postgresql.org/download/)
#### Requiremnts for the Perl script:
  - [Perl](https://www.perl.org/get.html)
  - [Ensembl API](http://www.ensembl.org/info/docs/api/)
  - There are different guides for setting up the Ensembl API based on your OS:
    - [Windows](https://www.ensembl.info/2014/02/10/ensembl-api-on-windows/)
    - [Linux](http://www.ensembl.org/info/docs/api/api_installation.html)
    - [OSX](https://www.ensembl.info/2013/09/09/installing-perl-dbdmysql-and-ensembl-on-osx/)
    - [Using a Virtual Machine](http://www.ensembl.org/info/data/virtual_machine.html)
  - If you encountered issues while trying to setup the API, you can check the list of common issues [here](http://www.ensembl.org/info/docs/api/debug_installation_guide.html).

## Run Instructions
### Running the Perl Script
- Clone the project onto your system.
- Launch your terminal and cd into the `ensembl-perl` and run the script with command:
```bash
 perl convert_chromosomes.pl
```
### Running the Java(Spring) API
- Start your Postgres server and create a database with any name of your choice.
- Update the `application/proporties` file in the resource directory of the Java project with the database name and Postgres user
```java
  spring.datasource.url=jdbc:postgresql://localhost:5432/<database_name>
  spring.datasource.username=<postgres_user>
  spring.datasource.password=<postgres_user_password>
```
- In your terminal cd into the `ensembl-table-api` folder and run:
```bash
  mvn spring-boot:run
```
- You can then visit the url returned at the end of the build in your browser.



