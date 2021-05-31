CREATE DATABASE TUHousing;
USE TUHousing;
CREATE TABLE TUH_USER(Fname char(20),
					Lname char(20),
                    Email varchar(30),
                    Phone_num char(16),
                    Ssn char(9),
                    Street_address varchar(30),
                    City char(15),
                    Zip char(6),
                    State char(2),
					PRIMARY KEY(Ssn)	
);

CREATE TABLE HOUSING(Housing_num int,
				   Manager char(20),
				   School_year char(10),
                   Address char(20),
                   City char(15),
                   Zip int,
                   State char(2),
                   PRIMARY KEY (Housing_num)
                   );
                   
                   CREATE TABLE RESIDENT_HALL(
				   Hall_num int,
                   Phone_num char(16),
                   Num_of_beds int,
                   Resident_hall_name char(15),
                   PRIMARY KEY(Hall_num),
                   FOREIGN KEY (Hall_num) REFERENCES HOUSING(Housing_num)
                   );

CREATE TABLE HALL_BED(Hall_floor int,
				   Room_num int,
                   Price int,
				   Num_of_beds int,
                   Hall_num int,
                   Bed_id char(9),
                   PRIMARY KEY(Bed_id),
                   FOREIGN KEY (Hall_num) REFERENCES RESIDENT_HALL(Hall_num)
                   );

CREATE TABLE APARTMENT(
				   Apart_num int,
                   Phone_num char(16),
                   Num_of_beds int,
                   Apartment_name char(15),
                   PRIMARY KEY(Apart_num),
                   FOREIGN KEY (Apart_num) REFERENCES HOUSING(Housing_num)
                   );
                   
CREATE TABLE APART_BED(Apart_floor int,
				   Room_num int,
                   Price int,
				   Num_of_beds int,
                   Num_of_baths int,
                   Apart_num int,
                   Bed_id char(9),
                   PRIMARY KEY(Bed_id),
                   FOREIGN KEY (Apart_num) REFERENCES APARTMENT(Apart_num)
                   );
                   
                                      

                   
CREATE TABLE MEAL_PLAN(Price int,
				   Plan_id int,
                   Meal_name char(25),
                   PRIMARY KEY(Plan_id)
                   );

CREATE TABLE LEASE(Length char(14),
				   Lease_date DATE,
				   Lease_num int NOT NULL AUTO_INCREMENT,
                   Housing_num int,
                   Bed_id char(9),
                   PRIMARY KEY(Lease_num),
				   FOREIGN KEY (Housing_num) REFERENCES HOUSING(Housing_num)
                   
                   );

CREATE TABLE STUDENT(Num_of_courses int,
					Credits int,
                    Student_id char(7),
                    Tu_Status char(10),
                    Lease_num int NOT NULL AUTO_INCREMENT,
                    Ssn char(9),
                    Plan_id int,
                    Want_parking bool,
                    Want_meal_plan bool,
                    PRIMARY KEY (Student_id),
                    FOREIGN KEY(Ssn) REFERENCES TUH_USER(Ssn),
                    FOREIGN KEY (Lease_num) REFERENCES LEASE(Lease_num),
                    FOREIGN KEY(Plan_id) REFERENCES MEAL_PLAN(Plan_id)
);

CREATE TABLE PARKING(Car_make char(15),
				   Car_model char(15),
				   Car_color char(10),
				   Permit_id int NOT NULL AUTO_INCREMENT,
                   Plate_num char(7),
                   Student_id char(7),
                   PRIMARY KEY (Permit_id),
                   FOREIGN KEY (Student_id) REFERENCES STUDENT(Student_id)
                   );
                    
CREATE TABLE TU_ADMIN(
	Id int NOT NULL AUTO_INCREMENT, 
	Username char(20),
    Passw char(20),
	Tu_position char(15),
    Ssn char(9),
    PRIMARY KEY(Id),
    FOREIGN KEY (Ssn) REFERENCES TUH_USER(Ssn)
    );


                   



                   

