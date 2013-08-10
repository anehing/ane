/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50150
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50150
File Encoding         : 65001

Date: 2011-11-14 21:41:57
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `demo`
-- ----------------------------
DROP TABLE IF EXISTS `demo`;
CREATE TABLE  demo  (
   id  int NOT NULL ,
   content  varchar(255) DEFAULT NULL,
   publishdate  date DEFAULT NULL,
   title  varchar(255) DEFAULT NULL,
  PRIMARY KEY ( id )
)

-- ----------------------------
-- Records of demo
-- ----------------------------
INSERT INTO demo VALUES ('1', 'HTTP://WWW.CHINASB.ORG',sysdate, 'Chinasb');
INSERT INTO demo VALUES ('2', 'HTTP://WWW.ITEYE.COM',sysdate, 'ITEYE');
INSERT INTO demo VALUES ('3', 'HTTP://APP.CHINASB.ORG',sysdate, 'Google App Engine');
