
CREATE DATABASE IF NOT EXISTS Basetp4;
USE basetp4;
CREATE TABLE IF NOT EXISTS PERSONNES(
    idPersonne VARCHAR(10),
    numSec INT NOT NULL,
    nom VARCHAR(30) ,
    prenom VARCHAR(30) NOT NULL,
    dateNai DATE NOT NULL,
    adresse VARCHAR(100),
    PRIMARY KEY(idPersonne)
) ENGINE=InnoDB;

CREATE TABLE  IF NOT EXISTS MODULES(
    codeModule VARCHAR(10) NOT NULL,
    intetule VARCHAR(30) NOT NULL,
    coef INT NOT NULL,
    PRIMARY KEY (codeModule)
) ENGINE=InnoDB;

CREATE TABLE IF NOT EXISTS SUIVRE(
    idEtudiant VARCHAR(10) ,
    idModule VARCHAR(10) NOT NULL,
    note INT,
    FOREIGN KEY(idEtudiant) REFERENCES PERSONNES(idPersonne) ON DELETE RESTRICT ON UPDATE CASCADE,
    FOREIGN KEY(idModule) REFERENCES MODULES (codeModule) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB;



ALTER TABLE MODULES ADD COLUMN idEnseignant VAECHAR(10) NOT NULL;

ALTER TABLE MODULES
ADD CONSTRAINT ck1_enseignant FOREIGN KEY (idEnseignant) REFERENCES PERSONNES (idPersonne) ON DELETE
RESTRICT ON UPDATE CASCADE

ALTER TABLE PERSONNES ADD CONSTRAINT  ck1_numSec UNIQUE (numSec)

Alter TABLE PERSONNES MODIFY adresse VARCHAR(32) DEFAULT 'Algerie'

ALTER TABLE MODULES ADD CONSTRAINT ck1_coef CHECK (coef > 0)

INSERT INTO PERSONNES (idPersonne, numSec, nom, prenom, dateNai, adresse) VALUES
('2MI', 21991, 'ADI', 'Mounir', '1991-03-25', 'Bouira'),
(NULL, 51989, 'KASRI', 'Amine', '1989-05-01', 'Bejaia'),
('10', 31980, 'KARA', 'Lyes', '1980-05-18', 'Alger'),
('11', 41981, 'SALMI', 'Riad', '1981-01-09', ''),
('13', 41985, '', 'Ryma', '1985-02-26', 'Bejaia');

INSERT INTO MODULES (codeModule, intetule, coef, idEnseignant) VALUES
('BDL2', 'Base de donnees', 3, '10'),
('SEL3', 'System d''exploitation', 2, '11'),
('SIL2', 'System d''information', 4, '11');
-- ('1AM1', 'Intelegence Artificielle', 4, '15');  COMMENT: le num 15 n'existe pas

INSERT INTO SUIVRE (idEtudiant, idModule, note) VALUES
('1MI', 'BDL2', 15),
(NULL, 'SEL3', 11),
('1MI', 'SEL3', 17),
('2MI', 'SEL3', 12),
('2MI', 'LML2', 13),
('3MI', 'SEL3', 11),
('2MI', 'SIL2', 14);



