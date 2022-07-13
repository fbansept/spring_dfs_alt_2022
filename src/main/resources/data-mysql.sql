INSERT INTO role (id, nom)
VALUES (NULL, 'admin') ,(NULL, 'utilisateur');

INSERT INTO utilisateur (id, mot_de_passe, pseudo, role_id)
VALUES (NULL, 'franck', 'root', 2) ,(NULL, 'john', 'doe', 2) , (NULL, 'admin', 'azerty', 1);

INSERT INTO competence (id, nom)
VALUES (NULL, 'developpeur') ,(NULL, 'comptable') ,(NULL, 'management');

INSERT INTO utilisateur_competences (utilisateur_id, competences_id)
VALUES (1, 1) ,(1,2) ,(2, 2),(3, 3);