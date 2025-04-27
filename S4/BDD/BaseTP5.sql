CREATE DATABASE IF NOT EXISTS CINEBASE_Tadjine;
USE CINEBASE_Tadjine;

CREATE TABLE IF NOT EXISTS PERSONNE(
    idPersonne INT NOT NULL,
    nom VARCHAR(30) NOT NULL,
    prenom VARCHAR(30) NOT NULL,
    PRIMARY KEY (idPersonne)   
);

CREATE TABLE IF NOT EXISTS FILM(
    idFilm INT NOT NULL,
    idRealisateur INT,
    titre VARCHAR(100) UNIQUE NOT NULL,
    genre VARCHAR(100),
    annee INT CHECK(annee >= 0),
    PRIMARY KEY(idFilm),
    FOREIGN KEY(idRealisateur) REFERENCES PERSONNE(idPersonne)
);

CREATE TABLE IF NOT EXISTS JOUER(
    idActeur INT,
    idFilm INT,
    role VARCHAR(100),
    PRIMARY KEY(idActeur, idFilm),
    FOREIGN KEY(idActeur) REFERENCES PERSONNE(idPersonne),
    FOREIGN KEY(idFilm) REFERENCES FILM(idFilm)
);

CREATE TABLE IF NOT EXISTS CINEMA(
    idCinema INT NOT NULL,
    nom VARCHAR(30),
    adresse VARCHAR(255),
    PRIMARY KEY(idCinema)
);

CREATE TABLE IF NOT EXISTS PROJECTION(
    idCinema INT,
    idFilm INT,
    jour DATE,
    PRIMARY KEY(idCinema, idFilm, jour),
    FOREIGN KEY(idCinema) REFERENCES CINEMA(idCinema),
    FOREIGN KEY(idFilm) REFERENCES FILM(idFilm)
);

INSERT INTO PERSONNE (idPersonne, nom, prenom) VALUES
(01, 'Kidmane', 'Nicole'),
(02, 'Bettany', 'Paul'),
(03, 'Watson', 'Emily'),
(04, 'Skarsgard', 'Stellan'),
(05, 'Travolta', 'John'),
(06, 'Jackson', 'Samuel'),
(07, 'Willis', 'Bruce'),
(08, 'Irons', 'Jeremy'),
(09, 'Spader', 'James'),
(10, 'Hunter', 'Holly'),
(11, 'Arquette', 'Rosanna'),
(12, 'Wayne', 'John'),
(13, 'Von', 'Trier'),
(14, 'Tarantino', 'Quentin'),
(15, 'Cronenberg', 'David'),
(16, 'Mazursky', 'Paul'),
(17, 'Jones', 'Grace'),
(18, 'Glen', 'John'),
(19, 'Eastwood', 'Clint'),
(20, 'Spacey', 'Kevin'),
(21, 'Menvès', 'Sam'),
(22, 'Jolie', 'Angelina');

INSERT INTO FILM (idFilm, idRealisateur, titre, genre, annee) VALUES
(01, 15, 'Crash', 'Drame', 1996),
(02, 15, 'Faux-Semblants', 'Epouvante', 1988),
(03, 14, 'Pulp Fiction', 'Policier', 1994),
(04, 13, 'Breaking the waves', 'Drame', 1996),
(05, 13, 'Dogville', 'Drame', 2002),
(06, 12, 'Almo', 'Western', 1960),
(07, 18, 'Dangereusement vôtre', 'Espionnage', 1985),
(08, 19, 'Chasseur blanc coeur noir', 'Drame', 1989),
(10, 21, 'American Beauty', 'Drame', 1999);

INSERT INTO CINEMA (idCinema, nom, adresse) VALUES
(02, 'le Fontenelle', '78160 Marly'),
(01, 'le Renoir', '13100 Aix'),
(03, 'Gaumont Wilson', '31000 Toulouse'),
(04, 'Espace Ciné', '93800 Epinay');

INSERT INTO JOUER (idActeur, idFilm, role) VALUES
(01, 05, 'Grace'),
(02, 05, 'Tom Edison'),
(03, 04, 'Bess'),
(04, 04, 'Jan'),
(05, 03, 'Vincent Vega'),
(06, 03, 'Jules Wimfield'),
(07, 03, 'Butch Coolidge'),
(08, 02, 'Beverly & Elliot'),
(09, 01, 'James Ballard'),
(10, 01, 'Helen Remington'),
(11, 01, 'Gabrielle'),
(04, 05, 'Chuck'),
(16, 07, 'May Day'),
(19, 08, 'John Wilson'),
(20, 10, 'Lester Burnham');

INSERT INTO PROJECTION (idCinema, idFilm, jour) VALUES
(2, 5, '2002-05-01'),
(2, 5, '2002-05-02'),
(2, 5, '2002-05-03'),
(2, 4, '1996-12-02'),
(1, 1, '1996-05-07'),
(2, 7, '1985-05-09'),
(1, 4, '1996-08-02'),
(4, 3, '1994-04-08'),
(3, 6, '1990-12-02'),
(2, 2, '1990-12-08'),
(3, 3, '1994-11-05'),
(4, 3, '1994-11-06'),
(1, 6, '1980-07-05'),
(2, 4, '1996-09-02'),
(4, 6, '2002-08-01'),
(3, 6, '1960-11-09'),
(1, 2, '1988-03-12'),
(2, 8, '1989-02-01'),
(2, 1, '1997-05-11'),
(2, 3, '1994-07-05'),
(2, 6, '2002-08-01'),
(1, 3, '1994-03-02'),
(2, 10, '2000-10-03');

SELECT * FROM FILM;

SELECT titre AS 'Titre de Film' FROM FILM;

SELECT * FROM FILM WHERE genre = 'Drame';

SELECT * FROM FILM WHERE genre = 'Drame' ORDER BY titre ASC;

SELECT PROJECTION.idFilm
FROM PROJECTION, cinema
WHERE nom = 'le Fontenelle' AND 
PROJECTION.idCinema = CINEMA.idCinema;

SELECT FILM.idFilm, FILM.titre
FROM PROJECTION, CINEMA, film
WHERE CINEMA.nom = 'le fontenelle' AND
PROJECTION.idCinema = CINEMA.idCinema AND
PROJECTION.idFilm = FILM.idFilm;

SELECT nom FROM personne D