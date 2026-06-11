alter table profiles
    modify bio TEXT null;

alter table profiles
    modify phone_number varchar(15) null;

alter table profiles
    modify loyalty_points int unsigned default 0 null;

