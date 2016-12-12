
CREATE TABLE VehicleModelYear (
	id SERIAL NOT NULL,
	year INTEGER NOT NULL,
	make VARCHAR(50) NOT NULL,
	model VARCHAR(50) NOT NULL,
	PRIMARY KEY (id),
	CONSTRAINT U_VehicleModelYear_year_make_model UNIQUE(year, make, model)
);

CREATE TABLE UserData (
	id SERIAL NOT NULL,
    Age INTEGER,
	Name VARCHAR(50) NOT NULL,
	City VARCHAR(50),
	PRIMARY KEY (id)
);
/*
текст, дата, КОЛА(връзка към таблицата коли), +оценки, -оценки, Потребител (връзка към таблицата потребител),
*/
CREATE TABLE Opinion (
	id SERIAL NOT NULL,
    AverageMark REAL NOT NULL,
	UserName VARCHAR(50) NOT NULL,
    UserAge Integer,
    UserLocation VARCHAR(50),
	Text VARCHAR(1500) NOT NULL,
    carId INTEGER references VehicleModelYear (id),
	PRIMARY KEY (id)
);

//INSERT INTO Opinion VALUES(1, 5.5, 'Todor', 29, 'Sofia', 'az sym pich', 4);





