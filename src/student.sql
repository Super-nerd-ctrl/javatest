/*
 Navicat MySQL Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : hsp_db03

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 30/01/2023 14:59:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(256) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户名',
  `sex` int(4) NOT NULL COMMENT '性别',
  `age` int(2) NOT NULL COMMENT '年龄',
  `classname` varchar(256) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '班级名',
  `score` int(3) NOT NULL COMMENT '成绩',
  `grade` varchar(256) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '成绩等级',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '`student`' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, '吴昊强', 1, 50, '1班', 57, 'A');
INSERT INTO `student` VALUES (2, '哈哈哈哈', 1, 27, '2班', 88, 'B');
INSERT INTO `student` VALUES (3, '邹弘文', 1, 19, '1班', 71, 'C');
INSERT INTO `student` VALUES (4, '龚煜祺', 2, 24, '2班', 98, 'D');
INSERT INTO `student` VALUES (6, '董彬', 1, 27, '1班', 39, 'C');
INSERT INTO `student` VALUES (7, '雷智宸', 2, 22, '1班', 120, 'B');
INSERT INTO `student` VALUES (8, '方志泽', 1, 19, '2班', 59, 'A');
INSERT INTO `student` VALUES (9, '叶修洁', 2, 20, '1班', 48, 'D');
INSERT INTO `student` VALUES (10, '韩子涵', 1, 19, '2班', 48, 'B');
INSERT INTO `student` VALUES (11, '邱风华', 2, 22, '1班', 99, 'A');
INSERT INTO `student` VALUES (12, '李锦程', 1, 17, '2班', 72, 'D');
INSERT INTO `student` VALUES (13, '蔡志强', 2, 19, '1班', 38, 'A');
INSERT INTO `student` VALUES (14, '谢远航', 1, 18, '2班', 61, 'C');
INSERT INTO `student` VALUES (15, '莫绍辉', 2, 21, '1班', 88, 'A');
INSERT INTO `student` VALUES (16, '宋彬', 2, 18, '1班', 78, 'D');
INSERT INTO `student` VALUES (17, '钟文昊', 1, 30, '2班', 74, 'B');
INSERT INTO `student` VALUES (18, '秦鸿煊', 1, 22, '1班', 96, 'A');
INSERT INTO `student` VALUES (19, '陈晓博', 2, 24, '2班', 98, 'D');
INSERT INTO `student` VALUES (20, '邓驰', 1, 19, '1班', 67, 'C');
INSERT INTO `student` VALUES (21, 'xxx', 1, 50, '1班', 57, 'A');

SET FOREIGN_KEY_CHECKS = 1;
