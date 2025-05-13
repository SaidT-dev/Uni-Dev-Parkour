CREATE DATABASE IF NOT EXISTS BIBLIO_Tadjine;
USE BIBLIO_Tadjine;

CREATE TABLE IF NOT EXISTS ETUDIANT (
    NumEtd INT NOT NULL AUTO_INCREMENT,
    NomEtd VARCHAR(20) NOT NULL,
    PrenomEtd VARCHAR(20) NOT NULL,
    AdresseEtd VARCHAR(250),
    PRIMARY KEY(NumEtd)
);

CREATE TABLE IF NOT EXISTS AUTEUR (
    NumAuteur INT NOT NULL AUTO_INCREMENT,
    NomAuteur VARCHAR(20) NOT NULL,
    AdresseAuteur VARCHAR(250),
    PRIMARY KEY(NumAuteur)
);

CREATE TABLE IF NOT EXISTS EDITEUR (
    NumEditeur INT NOT NULL AUTO_INCREMENT,
    NomEditeur VARCHAR(20) NOT NULL,
    AdresseEditeur VARCHAR(250),
    PRIMARY KEY(NumEditeur)
);

CREATE TABLE IF NOT EXISTS THEME (
    NumTheme INT NOT NULL AUTO_INCREMENT,
    IntituleTheme VARCHAR(20) NOT NULL,
    PRIMARY KEY (NumTheme)
);

CREATE TABLE IF NOT EXISTS LIVRE (
    NumLivre INT NOT NULL AUTO_INCREMENT,
    TitreLivre VARCHAR(250) NOT NULL UNIQUE,
    NumAuteur INT NOT NULL,
    NumEditeur INT NOT NULL,
    NumTheme INT NOT NULL,
    PRIMARY KEY (NumLivre),
    FOREIGN KEY (NumAuteur) REFERENCES AUTEUR(NumAuteur) ON UPDATE CASCADE ON DELETE RESTRICT,
    FOREIGN KEY (NumEditeur) REFERENCES EDITEUR(NumEditeur) ON UPDATE CASCADE ON DELETE RESTRICT,
    FOREIGN KEY (NumTheme) REFERENCES THEME(NumTheme) ON UPDATE CASCADE ON DELETE RESTRICT
);

CREATE TABLE IF NOT EXISTS PRET (
    NumEtd INT NOT NULL,
    NumLivre INT NOT NULL,
    DatePret DATE NOT NULL,
    DateRetour DATE, 
    CHECK (DateRetour IS NULL OR DateRetour > DatePret),
    PRIMARY KEY (NumEtd, NumLivre, DatePret),
    FOREIGN KEY (NumEtd) REFERENCES ETUDIANT(NumEtd) ON UPDATE CASCADE ON DELETE RESTRICT,
    FOREIGN KEY (NumLivre) REFERENCES LIVRE(NumLivre) ON UPDATE CASCADE ON DELETE RESTRICT
);

INSERT INTO ETUDIANT (NomEtd, PrenomEtd, AdresseEtd)
VALUES
    ('Dupont', 'Alice', '10 rue des Lilas'),
    ('Martin', 'Bob', '20 avenue des Champs'),
    ('Lemoine', 'Sophie', '78 Rue de la LIberte'),
    ('Bernard', 'Amandine', '88 Rue des Fleurs');

INSERT INTO EDITEUR (NomEditeur, AdresseEditeur)
VALUES
    ('Gallimard', 'Paris'),
    ('Seuil', 'Paris');

INSERT INTO auteur (NomAuteur, AdresseAuteur)
VALUES
    ('Victor Hugo', 'Besancon'),
    ('George Orwell', 'Motihari'),
    ('Albert Camus', 'Paris');

ALTER TABLE LIVRE
ADD COLUMN AnneeEdition INT;

INSERT INTO theme (IntituleTheme)
VALUES 
    ('Litterature'),
    ('Science-fiction');

INSERT INTO livre(TitreLivre, NumAuteur, NumEditeur, NumTheme, AnneeEdition)
VALUES
    ('Les miserables', 1, 1, 1, 1862),
    ('1984', 2, 2, 2, 1949),
    ('L''etranger', 3, 1, 1, 1942);

INSERT INTO pret (NumEtd, NumLivre, DatePret, DateRetour)
VALUES
    (1, 1, '2025-04-01', '2025-04-15'),
    (2, 2, '2025-04-24', NULL),
    (3, 1, '2025-04-04', '2025-04-21');

-- QST 4 
SELECT NomAuteur, TitreLivre 
FROM auteur, livre
WHERE livre.NumAuteur = auteur.NumAuteur;

-- QST 5
SELECT TitreLivre, AnneeEdition FROM livre;

-- QST 6
SELECT livre.TitreLivre
FROM etudiant, livre, pret
WHERE etudiant.NomEtd = 'Dupont'
  AND etudiant.PrenomEtd = 'Alice'
  AND etudiant.NumEtd = pret.NumEtd
  AND pret.NumLivre = livre.NumLivre;

-- QST 7
SELECT NumLivre FROM pret WHERE DateRetour is NULL 

-- QST 8
SELECT auteur.NomAuteur 
FROM auteur,livre WHERE
auteur.NumAuteur = livre.NumAuteur
AND livre.AnneeEdition >= 1900;

-- QST 9
SELECT etudiant.NomEtd
from etudiant, pret WHERE
etudiant.NumEtd = pret.NumEtd AND
pret.DatePret >= '2025-04-01';

-- QST 10
SELECT livre.TitreLIvre, auteur.NomAuteur, theme.IntituleTheme
FROM livre,auteur,theme 
WHERE livre.NumAuteur = auteur.NumAuteur
AND livre.NumTheme = theme.NumTheme;

-- QST 11
SELECT etudiant.NomEtd, COUNT(*) AS NombreEmprunts
FROM pret, etudiant
WHERE pret.NumEtd = etudiant.NumEtd
GROUP BY etudiant.NumEtd, etudiant.NomEtd;

-- QST 12
SELECT livre.TitreLivre
FROM livre
WHERE AnneeEdition = (
    SELECT MAX(AnneeEdition)
    FROM livre
);

-- QST 13
SELECT NomEtd
FROM etudiant
WHERE NumEtd NOT IN (
    SELECT NumEtd FROM pret
);

-- QST 14
SELECT IntituleTheme, COUNT(*) as NombreLivre
FROM livre, theme
WHERE livre.NumTheme = THEME.NumTheme
GROUP BY theme.NumTheme, theme.IntituleTheme

-- QST 15
SELECT etudiant.NomEtd, livre.TitreLivre
FROM pret, etudiant, livre
WHERE etudiant.NumEtd = pret.NumEtd
  AND livre.NumLivre = pret.NumLivre;

-- QST 16
DELETE FROM pret
WHERE DatePret = CURDATE();
