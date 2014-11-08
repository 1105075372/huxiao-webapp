DROP TABLE IF EXISTS huxiao_user;
CREATE TABLE huxiao_user (
  username VARCHAR(20) NOT NULL COMMENT '用户名',
  passwd VARCHAR(20) NOT NULL COMMENT '密码',
  nickname VARCHAR(20) NOT NULL COMMENT '昵称',
  gender enum('F','M') COMMENT '性别',
  age INT(3) COMMENT '年龄',
  creator VARCHAR(200) NOT NULL COMMENT '创建者',
  modifier VARCHAR(200) NOT NULL COMMENT '修改者',
  create_time DATETIME DEFAULT NULL COMMENT '创建时间',
  modify_time DATETIME DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY  (username)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '用户表';
