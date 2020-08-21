/*
Navicat MySQL Data Transfer

Source Server         : LocalMysql
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : db_java8

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2020-08-21 18:12:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `create_date` date DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '2020-08-20', '2020-08-21 17:38:27');
