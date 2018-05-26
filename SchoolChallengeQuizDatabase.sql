CREATE DATABASE  IF NOT EXISTS `schoolchallengequiz` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `schoolchallengequiz`;
-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: schoolchallengequiz
-- ------------------------------------------------------
-- Server version	5.7.10-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ranking`
--

DROP TABLE IF EXISTS `ranking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ranking` (
  `Rank` int(11) NOT NULL AUTO_INCREMENT,
  `SchoolID` int(11) NOT NULL,
  `Points` int(11) NOT NULL,
  PRIMARY KEY (`Rank`),
  KEY `SchoolID` (`SchoolID`),
  CONSTRAINT `ranking_ibfk_1` FOREIGN KEY (`SchoolID`) REFERENCES `school` (`SchoolID`)
) ENGINE=InnoDB AUTO_INCREMENT=128 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ranking`
--

LOCK TABLES `ranking` WRITE;
/*!40000 ALTER TABLE `ranking` DISABLE KEYS */;
INSERT INTO `ranking` VALUES (1,1,11793),(2,2,11400),(3,3,9900),(4,4,8596),(5,8,6411),(6,5,6066),(7,6,5995),(8,7,5700),(9,11,4805),(10,10,4700),(11,9,4484),(12,12,3973),(13,13,3693),(14,14,3500),(15,15,2864),(16,17,2801),(17,20,2707),(18,16,2599),(19,19,2500),(20,25,2416),(21,21,2300),(22,22,2300),(23,23,2300),(24,18,2267),(25,26,2200),(26,39,2171),(27,27,2100),(28,28,2000),(29,30,2000),(30,31,2000),(31,24,1900),(32,32,1900),(33,29,1790),(34,35,1701),(35,51,1569),(36,33,1500),(37,34,1499),(38,36,1400),(39,38,1400),(40,40,1400),(41,37,1400),(42,41,1300),(43,42,1300),(44,44,1300),(45,43,1300),(46,45,1200),(47,46,1200),(48,47,1200),(49,48,1200),(50,50,1100),(51,49,1100),(52,52,1000),(53,53,1000),(54,54,900),(55,56,900),(56,57,900),(57,55,800),(58,58,800),(59,59,800),(60,60,700),(61,61,700),(62,62,600),(63,63,600),(64,64,600),(65,65,600),(66,66,600),(67,67,500),(68,68,500),(69,69,400),(70,70,400),(71,71,400),(72,72,400),(73,73,400),(74,74,400),(75,75,300),(76,76,300),(77,77,300),(78,79,300),(79,80,300),(80,78,200),(81,81,200),(82,82,200),(83,83,200),(84,84,100),(85,85,100),(86,86,100),(87,87,100),(88,88,100),(89,89,100),(90,90,100),(91,91,100),(92,92,100),(93,93,100),(94,94,100),(95,95,100),(96,96,100),(97,97,100),(98,98,100),(99,99,100);
/*!40000 ALTER TABLE `ranking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `rankingsheet`
--

DROP TABLE IF EXISTS `rankingsheet`;
/*!50001 DROP VIEW IF EXISTS `rankingsheet`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `rankingsheet` AS SELECT 
 1 AS `Rank`,
 1 AS `School Name`,
 1 AS `Points`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `school`
--

DROP TABLE IF EXISTS `school`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `school` (
  `SchoolID` int(11) NOT NULL AUTO_INCREMENT,
  `SchoolName` varchar(50) NOT NULL,
  `OldPoints` int(11) NOT NULL DEFAULT '0',
  `NewPoints` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`SchoolID`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `school`
--

LOCK TABLES `school` WRITE;
/*!40000 ALTER TABLE `school` DISABLE KEYS */;
INSERT INTO `school` VALUES (1,'Kingston College',11793,11793),(2,'Titchfield High',11400,11400),(3,'Ardenne High',9900,9900),(4,'St. Jago High',8596,8596),(5,'Calabar High',6066,6066),(6,'Wolmer\'s Boys',5995,5995),(7,'Munro College',5700,5700),(8,'Campion College',6411,6411),(9,'Glenmuir High',4484,4484),(10,'Old Harbour High',4700,4700),(11,'Manchester High',4805,4805),(12,'Jamaica College',3973,3973),(13,'Immaculate High',3693,3693),(14,'Camperdown High',3500,3500),(15,'St. Mary High',2864,2864),(16,'Charlemont High',2599,2599),(17,'The Queen\'s School',2801,2801),(18,'Clarendon College',2267,2267),(19,'Mannings School',2500,2500),(20,'Central High',2707,2707),(21,'Black River High',2300,2300),(22,'Dinthill Technical',2300,2300),(23,'St. Catherine High',2300,2300),(24,'Merl Grove High',1900,1900),(25,'Cornwall College',2416,2416),(26,'DeCarteret College',2200,2200),(27,'St. George\'s College',2100,2100),(28,'Excelsior High',2000,2000),(29,'Denbigh High',1790,1790),(30,'Hampton High',2000,2000),(31,'Bridgeport High',2000,2000),(32,'Wolmer\'s Girls',1900,1900),(33,'Rusea\'s High',1500,1500),(34,'Morant Bay High',1499,1499),(35,'St. Michael\'s Academy',1701,1701),(36,'York Castle High',1400,1400),(37,'St. Andrew Technical',1400,1400),(38,'Meadowbrook High',1400,1400),(39,'Knox College',2171,2171),(40,'Hydel High',1400,1400),(41,'Holy Childhood High',1300,1300),(42,'Victor Dixon High',1300,1300),(43,'Lacovia High',1300,1300),(44,'Bog Walk High',1300,1300),(45,'Herbert Morrison High',1200,1200),(46,'Norman Manley High',1200,1200),(47,'Bellefield High',1200,1200),(48,'Oberlin High',1200,1200),(49,'Garvey Maceo High',1100,1100),(50,'Montego Bay High',1100,1100),(51,'Mona High',1569,1569),(52,'Edwin Allen High',1000,1000),(53,'Ocho Rios High',1000,1000),(54,'Mount Alvernia High',900,900),(55,'STETHS',800,800),(56,'William Knibb High',900,900),(57,'Gaynstead High',900,900),(58,'Browns Town Coll',800,800),(59,'McGrath High',800,800),(60,'Spalding High',700,700),(61,'Vere Technical',700,700),(62,'Belair',600,600),(63,'Ewarton High',600,600),(64,'St. Mary\'s College',600,600),(65,'Jose Marti Tech. High',600,600),(66,'Spanish Town High',600,600),(67,'St. Hughs High',500,500),(68,'St. Thomas Technical',500,500),(69,'Dunoon Tech High',400,400),(70,'Maggotty High',400,400),(71,'Fair Prospect High',400,400),(72,'Albert Town High',400,400),(73,'Ferncourt High',400,400),(74,'BB Coke High',400,400),(75,'Clan Carthy High',300,300),(76,'Aabuthnott Gallimore',300,300),(77,'Jonathan Grant High',300,300),(78,'Annotto Bay High',200,200),(79,'Ascot High',300,300),(80,'Christiana High',300,300),(81,'Waterford High',200,200),(82,'May Day High',200,200),(83,'Alston High',200,200),(84,'Rhodes Hall High',100,100),(85,'Penwood high',100,100),(86,'Kemps Hill High',100,100),(87,'Cedric Titus High',100,100),(88,'Claude McKay High',100,100),(89,'Glengoffe High',100,100),(90,'Grange Hill High',100,100),(91,'Holmwood Technical',100,100),(92,'Iona High',100,100),(93,'Holy Trinity',100,100),(94,'Knockalva High',100,100),(95,'Brown\'s Town High',100,100),(96,'Green Pond High',100,100),(97,'Lennon High',100,100),(98,'Tacky High',100,100),(99,'Westwood High',100,100);
/*!40000 ALTER TABLE `school` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER RankUpdate AFTER INSERT ON school 
FOR EACH ROW BEGIN INSERT INTO Ranking (SchoolID,Points) Values (NEW.SchoolID,NEW.NewPoints); 
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER RankDelete BEFORE DELETE ON school 
FOR EACH ROW BEGIN DELETE FROM Ranking 
WHERE SchoolID = OLD.SchoolID; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Dumping events for database 'schoolchallengequiz'
--

--
-- Dumping routines for database 'schoolchallengequiz'
--

--
-- Final view structure for view `rankingsheet`
--

/*!50001 DROP VIEW IF EXISTS `rankingsheet`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `rankingsheet` AS select `ranking`.`Rank` AS `Rank`,`school`.`SchoolName` AS `School Name`,`school`.`OldPoints` AS `Points` from (`ranking` join `school`) where (`ranking`.`SchoolID` = `school`.`SchoolID`) order by `ranking`.`Rank` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-09-17 16:36:42
