/*
SQLyog Ultimate - MySQL GUI v8.2 
MySQL - 5.7.25-log : Database - csd
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`csd` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `csd`;

/*Table structure for table `sys_car` */

DROP TABLE IF EXISTS `sys_car`;

CREATE TABLE `sys_car` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  `sitnum` int(11) DEFAULT NULL,
  `cid` int(11) DEFAULT NULL,
  `price` double(10,2) DEFAULT NULL,
  `number` int(11) DEFAULT NULL,
  `picture` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `sys_car` */

insert  into `sys_car`(`id`,`name`,`type`,`sitnum`,`cid`,`price`,`number`,`picture`) values (1,'大众帕萨特','手自一体',5,7,249.00,10,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97%E5%B8%95%E8%90%A8%E7%89%B9.png'),(2,'别克GL8','手自一体',7,7,282.00,8,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%88%AB%E5%85%8BGL8%EF%BC%88%E6%B2%AA%E7%89%8C%EF%BC%89.png'),(3,'荣威E550','自排',5,7,400.00,15,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E8%8D%A3%E5%A8%81E550.png'),(4,'别克GL8(沪牌)','自排',7,7,510.00,11,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E6%B1%9F%E6%B7%AE%E7%91%9E%E9%A3%8E8%E5%BA%A7.png'),(5,'别克凯越','自排',5,7,180.00,5,'https://www.chesudi.com/static/img/onerrorcar.9ae6dcc.png'),(6,'起亚K2','自排',5,7,69.00,30,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E8%B5%B7%E4%BA%9AK2.png'),(7,'大众','自排',5,8,89.00,30,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png'),(8,'福特福克斯','自排',5,8,90.00,12,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E6%97%A5%E4%BA%A7%E9%98%B3%E5%85%89.png'),(9,'尼桑阳光','自排',5,9,110.00,20,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97%E6%8D%B7%E8%BE%BE.png'),(10,'大众朗逸','手自一体',6,8,120.00,30,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png'),(11,'比亚迪秦','自排',7,8,150.00,11,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E6%AF%94%E4%BA%9A%E8%BF%AA%E7%A7%A6.png'),(12,'斯柯达明锐','自排',8,9,99.00,20,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png'),(13,'别克君越','自排',5,9,110.00,10,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E9%80%9AG10%20%E6%B2%AA%E7%89%8C.png'),(14,'日产阳光','手自一体',5,9,110.00,30,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E6%97%A5%E4%BA%A7%E5%A4%A9%E7%B1%81.png'),(15,'别克凯越','手排',6,10,130.00,10,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png'),(16,'传祺GS4-15','自排',5,11,115.00,5,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E4%BC%A0%E7%A5%BAGS4-15%E8%B1%AA%E5%8D%8E%E7%89%88.png'),(17,'大众','自排',5,12,110.00,10,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97%E6%A1%91%E5%A1%94%E7%BA%B3%EF%BC%8813%E6%96%B0%E6%AC%BE%EF%BC%89.png'),(18,'名爵MG5','自排',5,13,120.00,10,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%90%8D%E7%88%B5MG5.png'),(19,'名爵MG5','自排',5,12,120.00,10,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%90%8D%E7%88%B5MG5.png'),(20,'福特福克斯','自排',5,13,90.00,12,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png'),(21,'尼桑阳光','自排',5,14,110.00,20,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png'),(22,'大众朗逸','手自一体',6,14,120.00,30,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png'),(23,'比亚迪秦','自排',7,14,150.00,11,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png'),(24,'斯柯达明锐','自排',8,15,99.00,20,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png'),(25,'别克君越','自排',5,15,110.00,10,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png'),(26,'日产阳光','手自一体',5,13,110.00,30,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png'),(27,'别克凯越','手排',6,11,130.00,10,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png'),(28,'传祺GS4-15','自排',5,10,115.00,5,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png'),(29,'大众','自排',5,10,120.00,10,'https://web-api.chesudi.com/img/carTypeimage/ScarTypeimage/%E5%A4%A7%E4%BC%97POLO.png');

/*Table structure for table `sys_city` */

DROP TABLE IF EXISTS `sys_city`;

CREATE TABLE `sys_city` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `sys_city` */

insert  into `sys_city`(`id`,`name`,`pid`) values (1,'上海',0),(2,'广州',0),(3,'深圳',0),(7,'虹桥火车站接送点',1),(8,'机场服务点',1),(9,'足球场地铁站店',1),(10,'天山店',2),(11,'新白云机场A区停车场服务点',2),(12,'天河客运站店',2),(13,'番禺店',3),(14,'华南城店',3),(15,'宝安汽车站店',3);

/*Table structure for table `sys_order` */

DROP TABLE IF EXISTS `sys_order`;

CREATE TABLE `sys_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cid` int(11) DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  `getid` int(11) DEFAULT NULL,
  `backid` int(11) DEFAULT NULL,
  `oprice` double(10,2) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `sys_order` */

insert  into `sys_order`(`id`,`cid`,`uid`,`getid`,`backid`,`oprice`,`status`) values (1,1,1,7,7,189.00,'已归还'),(2,19,1,12,8,205.00,'已预订'),(3,15,1,10,8,215.00,'已预订'),(4,11,1,8,8,235.00,'已预订'),(5,27,1,11,12,215.00,'已预订'),(6,19,1,12,15,205.00,'已预订'),(7,11,7,8,9,235.00,'已预订'),(8,11,1,8,9,235.00,'已预订'),(9,11,1,8,9,235.00,'已预订'),(10,15,1,10,12,215.00,'已预订'),(11,19,1,12,15,205.00,'已预订'),(12,19,1,12,7,205.00,'已预订'),(13,27,1,11,15,215.00,'已预订'),(14,1,8,7,10,334.00,'已预订'),(15,4,8,7,13,595.00,'已预订'),(16,1,8,7,13,334.00,'已预订'),(17,1,8,7,13,334.00,'已预订'),(18,2,8,7,13,367.00,'已预订'),(19,1,8,7,13,334.00,'已预订'),(20,1,8,7,13,334.00,'???'),(23,3,2,10,7,485.00,'已归还11'),(24,1,2,7,10,334.00,'已归还11'),(25,18,2,10,13,205.00,'已归还11'),(26,23,2,7,10,235.00,'已归还11'),(27,2,2,7,13,367.00,'已归还11'),(28,2,2,7,10,367.00,'已归还11'),(29,2,1,7,10,367.00,'已归还11'),(30,15,2,10,13,215.00,'已归还11'),(31,23,2,7,10,235.00,'已归还11'),(34,27,2,7,10,215.00,'已归还11'),(35,4,2,10,7,595.00,'已归还11'),(36,23,2,7,13,235.00,'已归还11'),(37,2,2,7,10,367.00,'已归还11'),(38,23,2,7,10,235.00,'已归还11'),(39,23,2,10,13,235.00,'已归还11'),(40,2,2,7,10,367.00,'已归还11'),(41,1,12,7,10,334.00,'已归还11'),(42,2,12,7,7,367.00,'已归还11'),(43,1,12,7,10,334.00,'已归还11'),(44,2,13,7,10,367.00,'已归还11'),(45,23,8,7,10,235.00,'已归还11'),(46,3,2,7,10,485.00,'已归还11');

/*Table structure for table `sys_user` */

DROP TABLE IF EXISTS `sys_user`;

CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tel` varchar(11) DEFAULT NULL,
  `password` varchar(11) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `invitation` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `sys_user` */

insert  into `sys_user`(`id`,`tel`,`password`,`email`,`invitation`) values (1,'13783078934','123456','563911475@qq.com',''),(2,'','123456','',NULL),(7,'13733975958','123456','563911475@qq.com','123'),(8,'111','123123','111',NULL),(9,'12312312312','123123','123@qq.com',''),(10,'12312312311','123123','1231231@qq.com',''),(11,'12312312313','123123','123123@qq.com',''),(13,'12345','123123','123',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
