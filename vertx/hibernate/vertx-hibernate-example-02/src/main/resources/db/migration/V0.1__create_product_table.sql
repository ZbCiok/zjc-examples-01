
-- DROP TABLE IF EXISTS product CASCADE;

CREATE TABLE product (id int8 NOT NULL GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 1 CACHE 1 NO CYCLE),
                      "name" varchar(255) NULL,
                      "price" numeric(19, 2)  NULL,
                      CONSTRAINT organization_pkey PRIMARY KEY (id)
);

-- insert into product(id, name, price) values(1, 'org#name#1', '1.23');
-- insert into product(id, name, price) values(2, 'org#name#2', '2.34');