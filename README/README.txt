Open LMS project with netbeans IDE

Clone the project to your local machine using git hub repository url.
Below is th git hub repository url.
https://github.com/Imashi/LibraryManagementSystemITW2014-R582V262.git 
Please leave the user and password fields blank.

Import required dependancy jar files to the project. Dependency .jar files can be located in the lib folder.

Restore the database backup to MS SQL Server 2012. Database backup (LSM_DB.bak) can be found under the resources folder.
Modify the BD.java class with the url of your SQL server. DB.java class can be found under the se.wsu.lmw.Database package. 
Please use the sql server authentication to initialize the database connection.
URL format : jdbc:jtds:sqlserver://<Computer_Name>/<Database_name>;instance=<SQL_Server_Instance>;user=<SQL_Username>;password=<SQL_Login_Password>"

(adding the .dll)
Copy ntlmauth.dll file in to  C:\Windows\System32 Derectory and java\jre7\bin directory


Please use the below login credintials to log into the LMS aplicaiton.
user imashi
passwors-1234

All the reports will be created in the project classpath.