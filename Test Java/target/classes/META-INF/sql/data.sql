create table patient (
id INT PRIMARY KEY NOT NULL,
	FirstName VARCHAR(200),
	LastName VARCHAR(200),
	DateOfBirth DATE,
    SocialSecurityNumber VARCHAR(200)
)

create table visit (
id INT PRIMARY KEY NOT NULL,
	ReasonOfVisit VARCHAR(200),
	FamilyHistory VARCHAR(200),
	Date DATE,
    Time DATE,
    TypeOfVisit VARCHAR(200)
)

INSERT INTO patient (id, FirstName, LastName, DateOfBirth, SocialSecurityNumber) VALUES (1, "John", "Kebab","1923-12-01", "66666666");
INSERT INTO patient (id, FirstName, LastName, DateOfBirth, SocialSecurityNumber) VALUES (1, "Sam", "Smith","1980-05-11", "76666666");


INSERT INTO visit (id, ReasonOfVisit, FamilyHistory, Date, Time, TypeOfVisit) VALUES (1, "Urgent", "", "2018-03-01", "12.08", "Home");
INSERT INTO visit (id, ReasonOfVisit, FamilyHistory, Date, Time, TypeOfVisit) VALUES (1, "First time", "", "2020-07-15", "15.45", "Doctor office");
