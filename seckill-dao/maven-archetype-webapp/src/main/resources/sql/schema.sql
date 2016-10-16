CREATE DATABASE seckill;

use seckill;

CREATE TABLE seckill(
`seckill_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '商品库存id',
`name` varchar(120) NOT NULL COMMENT '商品名称',
`number` int NOT NULL COMMENT '库存数量',
`start_time` timestamp NOT NULL COMMENT '秒杀开启时间',
`end_time` timestamp NOT NULL COMMENT '秒杀结束时间',
`create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
PRIMARY KEY (seckill_id),
key idx_start_time(start_time),
key idx_end_time(end_time),
key idx_create_time(create_time)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='秒杀库存表'

insert into 
	seckill(name, number, start_time, end_time)
values 
	('1000元秒杀iphone7', 100, '2016-10-15 00:00:00', '2016-10-20 00:00:00'),
	('1000元秒杀iphone6', 200, '2016-10-15 00:00:00', '2016-10-20 00:00:00'),
	('1000元秒杀iphone5', 300, '2016-10-15 00:00:00', '2016-10-20 00:00:00'),
	('1000元秒杀iphone4', 400, '2016-10-15 00:00:00', '2016-10-20 00:00:00')
	
create table success_killed(
`seckill_id` BIGINT NOT NULL COMMENT '秒杀商品id',
`user_phone` BIGINT NOT NULL COMMENT '用户手机号',
`state` tinyint NOT NULL DEFAULT -1 COMMENT '状态',
`create_time` timestamp NOT NULL COMMENT '创建时间',
PRIMARY KEY(seckill_id, user_phone),/*联合主键*/
key idx_create_time(create_time)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='秒杀成功明细表'

-- 为什么手写DDL
-- 记录每次上线的DDL修改
-- 上线v1.1
ALTER TABLE seckill
DROP INDEX idx_create_time,
ADD index idx_c_s(start_time,create_time);

-- 上线v1.2
-- ddl


