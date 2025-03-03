-- MySQL dump 10.13  Distrib 8.3.0, for macos14.2 (x86_64)
--
-- Host: localhost    Database: self_order_kiosk
-- ------------------------------------------------------
-- Server version	8.3.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `categories`
--

DROP TABLE IF EXISTS `categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categories` (
  `category_id` int NOT NULL AUTO_INCREMENT,
  `category_name` varchar(100) NOT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categories`
--

LOCK TABLES `categories` WRITE;
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `categories` VALUES (1,'Meal Combos'),(2,'Sides'),(3,'Desserts'),(4,'Beverages'),(5,'Happy Meals'),(6,'Bakery');
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `items`
--

DROP TABLE IF EXISTS `items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `items` (
  `item_id` int NOT NULL AUTO_INCREMENT,
  `item_name` varchar(200) NOT NULL,
  `item_price` double NOT NULL,
  `item_image` varchar(200) DEFAULT NULL,
  `category_id` int DEFAULT NULL,
  PRIMARY KEY (`item_id`),
  KEY `category_id` (`category_id`),
  CONSTRAINT `items_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `categories` (`category_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `items`
--

LOCK TABLES `items` WRITE;
/*!40000 ALTER TABLE `items` DISABLE KEYS */;
INSERT INTO `items` VALUES (1,'Krabby Patty Value Meal',15.99,'https://b.zmtcdn.com/data/dish_photos/452/f6297bbafae110b76453ca78a2cf6452.jpg',1),(2,'Seaweed Wrap',12.5,'https://b.zmtcdn.com/data/dish_photos/1c8/2111a3b479c81a8d738cf42ef37f31c8.jpg',1),(3,'Patrik Star Meal',19.99,'https://b.zmtcdn.com/data/dish_photos/a4e/bf134f09c17995a4ec54b55b32928a4e.jpg',1),(4,'French Fries',3.99,'https://b.zmtcdn.com/data/dish_photos/671/a72661987ae2d3efa3c336e7fdd40671.jpg',2),(5,'Chicken Nuggets',6.69,'https://b.zmtcdn.com/data/dish_photos/6b8/28ef02f89c1bfb24a39fd347780fe6b8.jpg',2),(6,'Pizza Puff',3.75,'https://b.zmtcdn.com/data/dish_photos/91f/11e3d724c0fa28bf53b6b93180dad91f.png',2),(7,'Oreo Flurry',2.99,'https://b.zmtcdn.com/data/dish_photos/6a1/a8b772965acc98c27e900046eed366a1.jpg',3),(8,'Sandy Brownie',3.5,'https://b.zmtcdn.com/data/dish_photos/3fd/9f787bf19d49e2b3c20e558ffb5e73fd.jpg',3),(9,'Strawberry Soft Serve',6.25,'https://b.zmtcdn.com/data/dish_photos/32e/cc1d9c77ced500c2b1df7c019b0c632e.jpg',3),(10,'Coca Cola',2.59,'https://b.zmtcdn.com/data/dish_photos/441/4a5318a0ce6e68ae345c91a0f3139441.png',4),(11,'Orange Juice',3,'https://b.zmtcdn.com/data/dish_photos/ca5/3891a51f9ba71bd9f37ee1616bcceca5.png',4),(12,'Cold Coffee',2.69,'https://b.zmtcdn.com/data/dish_photos/1fe/715ff2c6ed6b30b5b26fbeca40d4c1fe.jpg',4),(13,'Filet-O-Fish Double Patty Meal',16.5,'https://b.zmtcdn.com/data/dish_photos/64d/f35d02b08a7217af87c914de5afe564d.jpg',1),(14,'Poutine',5.49,'https://static.wikia.nocookie.net/ronaldmcdonald/images/1/14/Poutine.png/revision/latest?cb=20150827073617',2),(15,'Chocolate Soft Serve',6.25,'https://b.zmtcdn.com/data/dish_photos/6dd/d40c1df21491e53d782803bf3e56d6dd.jpg',3),(16,'NESTEA Ice Tea',2.69,'https://b.zmtcdn.com/data/dish_photos/2c4/fda620c078759d62dc052b60c7c682c4.jpg',4),(17,'Soft Serve Cone',1.99,'https://mcdonaldsfiji.com/wp-content/uploads/2019/07/Soft-Serve-Cone-600x600.jpg',3),(18,'Swirl Chocolate Cone',1.99,'https://live.staticflickr.com/1693/25108044261_29929675f2.jpg',3),(19,'Cold Coffee Float',3.99,'https://images.deliveryhero.io/image/menu-import-gateway-prd/regions/AS/chains/mcd_philippines/fb3d308026181939cc3f345d93943c16.jpg?width=%s',4);
/*!40000 ALTER TABLE `items` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_details`
--

DROP TABLE IF EXISTS `order_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_details` (
  `order_id` int NOT NULL,
  `item_id` int DEFAULT NULL,
  `item_quantity` int NOT NULL,
  `item_size` varchar(10) DEFAULT NULL,
  `item_order_price` double NOT NULL,
  KEY `order_id` (`order_id`),
  KEY `item_id` (`item_id`),
  CONSTRAINT `order_details_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `order_details_ibfk_2` FOREIGN KEY (`item_id`) REFERENCES `items` (`item_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_details`
--

LOCK TABLES `order_details` WRITE;
/*!40000 ALTER TABLE `order_details` DISABLE KEYS */;
INSERT INTO `order_details` VALUES (8,19,1,'LARGE',5.99),(9,4,1,'LARGE',5.99),(10,1,2,'LARGE',17.990000000000002),(11,17,3,'LARGE',3.99),(11,15,1,'MEDIUM',6.25),(12,1,1,'MEDIUM',15.99),(14,3,1,'MEDIUM',19.99),(15,1,1,'MEDIUM',15.99),(15,14,1,'LARGE',7.49),(15,8,2,'MEDIUM',3.5),(15,12,1,'MEDIUM',2.69);
/*!40000 ALTER TABLE `order_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `order_id` int NOT NULL AUTO_INCREMENT,
  `order_eating_location` varchar(100) NOT NULL,
  `order_payment_method` varchar(100) NOT NULL,
  `order_status` int DEFAULT '0',
  `order_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (8,'EAT_IN','PAY_COUNTER',0,'2024-03-25 12:22:26'),(9,'TAKE_OUT','PAY_COUNTER',0,'2024-03-25 12:43:13'),(10,'EAT_IN','PAY_HERE',0,'2024-03-25 15:22:49'),(11,'EAT_IN','PAY_COUNTER',0,'2024-03-25 15:39:52'),(12,'EAT_IN','PAY_HERE',0,'2024-04-05 20:14:40'),(14,'EAT_IN','PAY_COUNTER',0,'2024-04-07 22:22:03'),(15,'EAT_IN','PAY_HERE',0,'2024-04-07 22:36:49');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `user_fullname` varchar(200) NOT NULL,
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Aryan Sanghvi','sanghvi','123'),(2,'Frosina Filiposka','fros','123'),(4,'Aryan','aryan','124'),(5,'MEET','meet','124');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-07 22:52:31
