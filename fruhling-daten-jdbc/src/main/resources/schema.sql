-- author
create table Author(
    id int auto_increment primary key,
    firstname varchar(100) not null,
    lastname varchar(100) not null,
    email varchar(100) not null,
    username varchar(100) not null

);

-- post
create table Post(
    id int auto_increment primary key,
    version int,
    title varchar(255) not null,
    content text not null,
    published_on timestamp not null,
    updated_on timestamp,
    author int,
    foreign key (author) references Author(id)
);

-- comment
create table Comment(
    post int not null, -- aggregate root
    name varchar(100) not null,
    content text not null,
    published_on timestamp not null,
    updated_on timestamp,
    foreign key (post) references Post(id)
);