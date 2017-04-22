CREATE TABLE items (
  id INT NOT NULL  AUTO_INCREMENT,
  itemsname VARCHAR(32) NOT NULL COMMENT '商品名称',
  price FLOAT(10,1) NOT NULL COMMENT '商品定价',
  detail TEXT COMMENT '商品描述',
  pic VARCHAR(64) DEFAULT NULL COMMENT '商品图片',
  createtime DATETIME NOT NULL COMMENT '生产日期',
  PRIMARY KEY (id)
)  DEFAULT CHARSET=utf8;

/*Table structure for table `orderdetail` */

CREATE TABLE order_detail (
  id INT NOT NULL AUTO_INCREMENT,
 orders_id INT NOT NULL COMMENT '订单id',
  items_id INT NOT NULL COMMENT '商品id',
  items_num INT  DEFAULT NULL COMMENT '商品购买数量',
  PRIMARY KEY (id),
  KEY `FK_orderdetail_1` (`orders_id`),
  KEY `FK_orderdetail_2` (`items_id`),
  CONSTRAINT `FK_orderdetail_1` FOREIGN KEY (`orders_id`) REFERENCES `orders` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_orderdetail_2` FOREIGN KEY (`items_id`) REFERENCES `items` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
)  DEFAULT CHARSET=utf8;

/*Table structure for table `orders` */

CREATE TABLE orders (
  id INT NOT NULL AUTO_INCREMENT,
  user_id INT NOT NULL COMMENT '下单用户id',
  number VARCHAR(30) NOT NULL COMMENT '订单号',
  createtime DATETIME NOT NULL COMMENT '创建订单时间',
  note VARCHAR(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  KEY `FK_orders_1` (`user_id`),
  CONSTRAINT `FK_orders_id` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
)  DEFAULT CHARSET=utf8;

/*Table structure for table `t_user` */

CREATE TABLE t_user (
  id INT NOT NULL AUTO_INCREMENT,
  username VARCHAR(32) NOT NULL COMMENT '用户名称',
  birthday DATE DEFAULT NULL COMMENT '生日',
  sex CHAR(1) DEFAULT NULL COMMENT '性别',
  address  VARCHAR(256) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`)
) DEFAULT CHARSET=utf8;