 create table accounts (
      id varchar(36) primary key,
      client_id varchar(10),
      account_id varchar(12),
      balance int,
      blocked boolean
 );


create table transfers (
                           id varchar(36) primary key,
                           source_account_id int,
                           target_account_id int,
                           amount int,
                           message varchar(255)
);

insert into accounts (id, client_id, account_id, balance, blocked) values (552077e6-2caa-47fe-89f3-168ac81a94b1, '000000000001', '00000000000111', 500, false),
                                                                           (d2bd47e4-c3ca-4b83-8ca8-209d158330b1, '000000000002', '00000000000112', 500, false );

insert into transfers (id,  source_account_id, target_account_id, amount, message) values                   ('bde76ffa-f133-4c23-9bca-03618b2a94b2', 1, 2, 100, 'Тестовый перевод'),
                                                                                                            ('32ebb2eb-ed35-4baa-b500-b7f6535e4c88', 2, 1, 50, 'Обратный тестовый перевод');