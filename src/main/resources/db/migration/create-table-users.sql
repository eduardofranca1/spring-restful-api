create tabe tb_users (
  id bigint primary key not null auto_increment,
  email varchar(255) not null,
  password varchar(255) not null,
  unique key uk_email (email)
)