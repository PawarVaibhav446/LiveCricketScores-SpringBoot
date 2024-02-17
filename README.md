Live Cricket Scores

Overview:
This Spring Boot project is designed to fetch live cricket scores and the points table of the CWC 2023 World Cup from a cricket website using the JSoup library. 
The retrieved data is then stored in a MySQL database for future reference and analysis.

Features:
Live Cricket Score Fetching: Utilizes JSoup to scrape live cricket scores from a reliable cricket website.
CWC 2023 Points Table: Retrieves and displays the points table for the Cricket World Cup 2023.
MySQL Database Integration: Stores the fetched cricket scores and points table data in a MySQL database for persistent storage.

Prerequisites:
Java 17 or later
Maven
MySQL Database

Endpoints:
Live Cricket Scores:
Endpoint: /live
Method: GET
Description: Retrieves and displays live cricket scores.

CWC 2023 Points Table:
Endpoint: /points-table
Method: GET
Description: Retrieves and displays the points table for the Cricket World Cup 2023.
