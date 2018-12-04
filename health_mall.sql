/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50529
Source Host           : localhost:3306
Source Database       : health_mall

Target Server Type    : MYSQL
Target Server Version : 50529
File Encoding         : 65001

Date: 2018-11-19 18:22:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for health_mall_addressment
-- ----------------------------
DROP TABLE IF EXISTS `health_mall_addressment`;
CREATE TABLE `health_mall_addressment` (
  `id` varchar(32) NOT NULL,
  `account` varchar(30) DEFAULT NULL,
  `member_code` varchar(30) DEFAULT NULL,
  `reciver_name` varchar(30) DEFAULT NULL,
  `phone` int(11) DEFAULT NULL,
  `postal_code` int(11) DEFAULT NULL COMMENT '邮编',
  `province` varchar(20) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `district` varchar(20) DEFAULT NULL,
  `street` varchar(50) DEFAULT NULL,
  `acquiescent` bit(1) DEFAULT NULL COMMENT '是否为默认地址',
  `remark` varchar(50) DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `update_time` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for health_mall_banner
-- ----------------------------
DROP TABLE IF EXISTS `health_mall_banner`;
CREATE TABLE `health_mall_banner` (
  `id` varchar(32) NOT NULL,
  `account` varchar(50) DEFAULT NULL,
  `banner_title` varchar(50) DEFAULT NULL,
  `banner_img` varchar(50) DEFAULT NULL,
  `banner_url` varchar(100) DEFAULT NULL,
  `product_id` varchar(30) DEFAULT NULL,
  `sort` int(11) DEFAULT NULL,
  `banner_sort` int(11) DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `update_time` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='banner图管理表';

-- ----------------------------
-- Table structure for health_mall_member
-- ----------------------------
DROP TABLE IF EXISTS `health_mall_member`;
CREATE TABLE `health_mall_member` (
  `id` varchar(32) NOT NULL,
  `account` varchar(20) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `mobile` int(11) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `sex` int(11) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `invitation` varchar(30) DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `update_time` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for health_mall_product
-- ----------------------------
DROP TABLE IF EXISTS `health_mall_product`;
CREATE TABLE `health_mall_product` (
  `id` varchar(32) NOT NULL,
  `account` varchar(30) DEFAULT NULL,
  `product_code` varchar(30) DEFAULT NULL,
  `product_name` varchar(50) DEFAULT NULL,
  `product_title` varchar(100) DEFAULT NULL,
  `product_type` varchar(32) DEFAULT NULL,
  `product_spec` varchar(32) DEFAULT NULL,
  `platform_price` double DEFAULT NULL,
  `market_price` double DEFAULT NULL,
  `member_price` double DEFAULT NULL,
  `product_vender` varchar(50) DEFAULT NULL,
  `vender_type` bit(1) DEFAULT NULL COMMENT '国产/进口  ',
  `product_people` int(11) DEFAULT NULL COMMENT '适用人群\n',
  `product_explain` text,
  `product_img` varchar(50) DEFAULT NULL,
  `product_sort` int(11) DEFAULT NULL,
  `product_status` int(11) DEFAULT NULL COMMENT '如首页展示、热搜、热卖、活动等\n',
  `product_shelves` bit(1) DEFAULT NULL COMMENT '上下架\n',
  `create_time` date DEFAULT NULL,
  `update_time` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for health_mall_product_img
-- ----------------------------
DROP TABLE IF EXISTS `health_mall_product_img`;
CREATE TABLE `health_mall_product_img` (
  `id` varchar(32) NOT NULL,
  `account` varchar(30) DEFAULT NULL,
  `product_id` varchar(32) DEFAULT NULL,
  `sku_id` varchar(32) DEFAULT NULL,
  `img_1` varchar(50) DEFAULT NULL,
  `img_2` varchar(50) DEFAULT NULL,
  `img_3` varchar(50) DEFAULT NULL,
  `img_4` varchar(50) DEFAULT NULL,
  `img_5` varchar(50) DEFAULT NULL,
  `img_6` varchar(50) DEFAULT NULL,
  `img_7` varchar(50) DEFAULT NULL,
  `img_8` varchar(50) DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `update_time` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for health_mall_product_sku
-- ----------------------------
DROP TABLE IF EXISTS `health_mall_product_sku`;
CREATE TABLE `health_mall_product_sku` (
  `id` varchar(32) NOT NULL,
  `account` varchar(30) DEFAULT NULL,
  `sku_code` varchar(30) DEFAULT NULL,
  `product_id` varchar(32) DEFAULT NULL,
  `sku_spec` varchar(32) DEFAULT NULL COMMENT '规格\n',
  `count` double DEFAULT NULL COMMENT '个数',
  `platform_price` double DEFAULT NULL,
  `market_price` double DEFAULT NULL,
  `member_price` double DEFAULT NULL,
  `stock` double DEFAULT NULL COMMENT '库存',
  `total_count` double DEFAULT NULL COMMENT '销量\n',
  `create_time` date DEFAULT NULL,
  `update_time` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for health_mall_product_spec
-- ----------------------------
DROP TABLE IF EXISTS `health_mall_product_spec`;
CREATE TABLE `health_mall_product_spec` (
  `id` varchar(32) NOT NULL,
  `account` varchar(30) DEFAULT NULL,
  `spec_name` varchar(50) DEFAULT NULL,
  `spec_sort` int(11) DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `update_time` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for health_mall_product_type
-- ----------------------------
DROP TABLE IF EXISTS `health_mall_product_type`;
CREATE TABLE `health_mall_product_type` (
  `id` varchar(32) NOT NULL,
  `account` varchar(30) DEFAULT NULL,
  `type_name` varchar(50) DEFAULT NULL,
  `parent_type` varchar(50) DEFAULT NULL,
  `type_sort` int(11) DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `update_time` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for health_mall_shopcart
-- ----------------------------
DROP TABLE IF EXISTS `health_mall_shopcart`;
CREATE TABLE `health_mall_shopcart` (
  `id` varchar(32) NOT NULL,
  `account` varchar(30) DEFAULT NULL,
  `member_code` varchar(30) DEFAULT NULL,
  `total_count` double DEFAULT NULL COMMENT '购物车总数\n',
  `remark` varchar(50) DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `update_time` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for health_mall_shopcart_items
-- ----------------------------
DROP TABLE IF EXISTS `health_mall_shopcart_items`;
CREATE TABLE `health_mall_shopcart_items` (
  `id` varchar(32) NOT NULL,
  `account` varchar(30) DEFAULT NULL,
  `shopcart_id` varchar(32) DEFAULT NULL,
  `product_code` varchar(30) DEFAULT NULL,
  `sku_code` varchar(30) DEFAULT NULL,
  `product_num` double DEFAULT NULL COMMENT '购物车中单品数量',
  `is_status` bit(1) DEFAULT NULL COMMENT '是否被选中',
  `is_delete` bit(1) DEFAULT NULL COMMENT '删除状态',
  `remark` varchar(50) DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `update_time` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for health_mall_user
-- ----------------------------
DROP TABLE IF EXISTS `health_mall_user`;
CREATE TABLE `health_mall_user` (
  `id` varchar(32) NOT NULL,
  `user_name` varchar(20) DEFAULT NULL,
  `pass_word` varchar(20) DEFAULT NULL,
  `user_role` varchar(20) DEFAULT NULL,
  `last_login_ip` varchar(30) DEFAULT NULL,
  `last_login_time` date DEFAULT NULL,
  `user_status` bit(1) DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `update_time` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for health_mall_user_power
-- ----------------------------
DROP TABLE IF EXISTS `health_mall_user_power`;
CREATE TABLE `health_mall_user_power` (
  `id` varchar(32) NOT NULL,
  `power_arrs` varchar(200) DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `update_time` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for health_mall_user_role
-- ----------------------------
DROP TABLE IF EXISTS `health_mall_user_role`;
CREATE TABLE `health_mall_user_role` (
  `id` varchar(32) NOT NULL,
  `role_name` varchar(30) DEFAULT NULL,
  `role_power` varchar(32) DEFAULT NULL,
  `role_status` bit(1) DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `update_time` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
