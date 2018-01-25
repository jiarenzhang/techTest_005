/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : root

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-01-25 20:09:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=205 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('196', '170名字', '我是170', '2018-01-25 20:04:06', '12');
INSERT INTO `student` VALUES ('198', null, null, null, null);
INSERT INTO `student` VALUES ('199', '张三', '备注', '2018-01-25 19:56:18', '11');
INSERT INTO `student` VALUES ('200', '张三', '备注', '2018-01-25 19:57:57', '11');
INSERT INTO `student` VALUES ('201', '张三', '备注', '2018-01-25 19:58:14', '11');
INSERT INTO `student` VALUES ('202', '张三', '备注', '2018-01-25 20:00:55', '11');
INSERT INTO `student` VALUES ('203', '张三', '备注', '2018-01-25 20:01:16', '11');
INSERT INTO `student` VALUES ('204', '张三', '备注', '2018-01-25 20:01:18', '11');
