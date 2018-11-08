# one-two

### 2018/11/08
## 방명록 예제 추가 및 aws RDS 연결, product table 생성

### RDS (MySQL 5.7.23)

cmd 혹은 터미널에서

~~~
mysql -h mydbinstance.ckdek3e36kwm.ap-northeast-2.rds.amazonaws.com -P 3306 -u "계획서 이메일에 사용된 ID" -p
~~~

### product table
~~~
create table product(
  id bigint(20) unsigned not null auto_increment,
  name varchar(255) not null,
  image mediumblob,
  price decimal(10,2) unsigned not null,
  store_id bigint(20) unsigned,
  primary key(id));
~~~
<hr>
