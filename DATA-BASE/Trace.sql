create table Trace (
Date_operation Date,
operation VARCHAR(50),
Tableau VARCHAR(50),
id_personne Number,
constraint fk_id_personne foreign key(id_personne) references Personnelle(id_personne) on delete cascade
);








