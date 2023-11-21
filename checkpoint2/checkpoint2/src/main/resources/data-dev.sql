insert into clientes(id, ativo, bairro, cep, complemento, data_cadastro, logradouro, municipio, 
nome, numero, uf) 
values (1, true, 'Jaguaré', '12345678', 'ap 1', current_timestamp(), 'Rua Abc', 'São Paulo', 'AC', '999', 'SP');

insert into clientes(id, ativo, bairro, cep, complemento, data_cadastro, logradouro, municipio, 
nome, numero, uf) 
values (2, true, 'Jaguaré', '12345678', 'ap 1', current_timestamp(), 'Rua Abc', 'São Paulo', 'DC', '999', 'SP');

insert into pedidos(id, cliente_id, data_pedido, data_entrega, valor_total, situacao)
values (1,1, current_timestamp(), current_timestamp(), 1500.50, 'ATIVO');

insert into pedidos(id, cliente_id, data_pedido, data_entrega, valor_total, situacao)
values (2, 1, current_timestamp(), current_timestamp(), 2000, 'ATIVO');

insert into pedidos(id, cliente_id, data_pedido, data_entrega, valor_total, situacao)
values (3, 1, current_timestamp(), current_timestamp(), 500, 'ENTREGUE');

insert into produtos(id,nome, data_cadastro)
values(1, 'Morango', current_timestamp());

insert into produtos(id, nome, data_cadastro)
values(2, 'Maracujá', current_timestamp());

insert into produtos(id, nome, data_cadastro)
values(3, 'Chocolate', current_timestamp());