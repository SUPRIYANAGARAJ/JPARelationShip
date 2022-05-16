CREATE TABLE `bookstoredb`. `bookstore_table` (`gen_name` VARCHAR(16) NOT NULL, `gen_val` INT NOT NULL);
insert into `bookstoredb`. `bookstore_table` values ("book_id", 1);
insert into `bookstoredb`. `bookstore_table` values ("author_id", 1000);
CREATE TABLE `bookstoredb`. `book` (`id` INT, `title` VARCHAR(128), `author` VARCHAR(64), `price` FLOAT);
CREATE TABLE `bookstoredb`. `author` (`id` INT, `name` VARCHAR(128), `birthDate` DATETIME );   