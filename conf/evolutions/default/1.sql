# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table address (
  id                            bigint auto_increment not null,
  address                       varchar(255),
  employee_id                   bigint,
  constraint uq_address_employee_id unique (employee_id),
  constraint pk_address primary key (id)
);

create table department (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_department primary key (id)
);

create table employee (
  id                            bigint auto_increment not null,
  department_id                 bigint,
  name                          varchar(255),
  constraint pk_employee primary key (id)
);

create table project (
  id                            bigint auto_increment not null,
  project_name                  varchar(255),
  constraint pk_project primary key (id)
);

create table project_project (
  project_id                    bigint auto_increment not null,
  constraint pk_project_project primary key (project_id)
);

create table user (
  role                          varchar(255),
  email                         varchar(255) not null,
  name                          varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (email)
);

alter table address add constraint fk_address_employee_id foreign key (employee_id) references employee (id) on delete restrict on update restrict;

alter table employee add constraint fk_employee_department_id foreign key (department_id) references department (id) on delete restrict on update restrict;
create index ix_employee_department_id on employee (department_id);

alter table project_project add constraint fk_project_project_project_1 foreign key (project_id) references project (id) on delete restrict on update restrict;
create index ix_project_project_project_1 on project_project (project_id);

alter table project_project add constraint fk_project_project_project_2 foreign key (project_id) references project (id) on delete restrict on update restrict;
create index ix_project_project_project_2 on project_project (project_id);


# --- !Downs

alter table address drop constraint if exists fk_address_employee_id;

alter table employee drop constraint if exists fk_employee_department_id;
drop index if exists ix_employee_department_id;

alter table project_project drop constraint if exists fk_project_project_project_1;
drop index if exists ix_project_project_project_1;

alter table project_project drop constraint if exists fk_project_project_project_2;
drop index if exists ix_project_project_project_2;

drop table if exists address;

drop table if exists department;

drop table if exists employee;

drop table if exists project;

drop table if exists project_project;

drop table if exists user;

