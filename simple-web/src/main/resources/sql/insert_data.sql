/*Data for the table `items` */
INSERT  INTO items(itemsname,price,detail,pic,createtime) VALUES 
('台式机',3000.0,'该电脑质量非常好！',NULL,'2015-07-07 13:28:53'),
('笔记本',6000.0,'笔记本性能好，质量好！',NULL,'2015-07-08 13:22:57'),
('背包',200.0,'名牌背包，容量大质量好！',NULL,'2015-07-010 13:25:02');

/*Data for the table `user` */
INSERT  INTO `t_user`(`username`,`birthday`,`sex`,`address`) VALUES
('王五',NULL,'2',NULL),
('张三','2014-07-10','1','北京市'),
('张小明',NULL,'1','河南郑州'),
('陈小明',NULL,'1','河南郑州'),
('张三丰',NULL,'1','河南郑州'),
('陈小明',NULL,'1','河南郑州'),
('王五',NULL,NULL,NULL),
 ('小A','2015-06-27','2','北京'),
('小B','2015-06-27','2','北京'),
('小C','2015-06-27','1','北京'),
('小D','2015-06-27','2','北京');

/*Data for the table `orders` */
INSERT  INTO `orders`(`user_id`,`number`,`createtime`,`note`) VALUES 
(1,'1000010','2015-06-04 13:22:35',NULL),
(1,'1000011','2015-07-08 13:22:41',NULL),
(2,'1000012','2015-07-17 14:13:23',NULL),
(3,'1000012','2015-07-16 18:13:23',NULL),
(4,'1000012','2015-07-15 19:13:23',NULL),
(5,'1000012','2015-07-14 17:13:23',NULL),
(6,'1000012','2015-07-13 16:13:23',NULL);

/*Data for the table `orderdetail` */
INSERT  INTO `order_detail`(`orders_id`,`items_id`,`items_num`) VALUES
 (1,1,1),
 (1,2,3),
 (2,3,4),
 (3,2,3);