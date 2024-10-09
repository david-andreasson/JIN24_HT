CREATE TABLE Movies
(
    MovieID       INTEGER PRIMARY KEY AUTOINCREMENT,
    Title    TEXT,
    Director TEXT,
    Year     INTEGER,
    Genre    TEXT
);

INSERT INTO Movies (Title, Director, Year, Genre)
VALUES ('The Shawshank Redemption', 'Frank Darabont', 1994, 'Drama'),
       ('The Godfather', 'Francis Ford Coppola', 1972, 'Crime'),
       ('The Dark Knight', 'Christopher Nolan', 2008, 'Action'),
       ('Inception', 'Christopher Nolan', 2010, 'Sci-Fi'),
       ('Fight Club', 'David Fincher', 1999, 'Drama'),
       ('Pulp Fiction', 'Quentin Tarantino', 1994, 'Crime'),
       ('Forrest Gump', 'Robert Zemeckis', 1994, 'Drama'),
       ('The Matrix', 'Lana Wachowski, Lilly Wachowski', 1999, 'Sci-Fi');

SELECT Movies.Title
FROM Movies
ORDER BY Year DESC;

CREATE TABLE Actors
(
    ActorID INTEGER PRIMARY KEY AUTOINCREMENT,
    Name    TEXT,
    DateOfBirth Date
);

INSERT INTO Actors (Name, DateOfBirth)
VALUES ('Tim Robbins', '1958-10-16'),
       ('Morgan Freeman', '1937-06-01'),
       ('Marlon Brando', '1924-04-03'),
       ('Al Pacino', '1940-04-25'),
       ('Christian Bale', '1974-01-30'),
       ('Heath Ledger', '1979-04-04'),
       ('Leonardo DiCaprio', '1974-11-11'),
       ('Joseph Gordon-Levitt', '1981-02-17'),
       ('Brad Pitt', '1963-12-18'),
       ('Edward Norton', '1969-08-18');

CREATE TABLE MovieActors
(
    MovieID INTEGER,
    ActorID INTEGER,
    PRIMARY KEY (MovieID, ActorID),
    FOREIGN KEY (MovieID) REFERENCES Movies(MovieID),
    FOREIGN KEY (ActorID) REFERENCES Actors(ActorID)
);

INSERT INTO MovieActors (MovieID, ActorID)
VALUES (1, 1),
       (1, 2),
       (2, 3),
       (2, 4),
       (3, 5),
       (3, 6),
       (4, 5),
       (4, 7),
       (5, 8),
       (5, 9),
       (6, 10),
       (6, 7),
       (7, 8),
       (7, 9),
       (8, 5),
       (8, 10);

SELECT Title, Name
FROM Movies
         INNER JOIN MovieActors ON Movies.MovieID = MovieActors.MovieID
         INNER JOIN Actors ON MovieActors.ActorID = Actors.ActorID;

Select Director, COUNT(*) AS NumberOfMovies
From Movies
group by Director

Create View MovieActorsView2 AS
    SELECT M.MovieID, M.Title, Count(A.ActorID) AS NumberOfActors
    FROM Movies M
             INNER JOIN MovieActors MA ON M.MovieID = MA.MovieID
             INNER JOIN Actors A ON MA.ActorID = A.ActorID
    GROUP BY M.MovieID, M.Title;

Select M.Title, Count(MA.ActorID) AS NumberOfActors
From Movies M
         inner join MovieActors MA on M.MovieID = MA.MovieID
Group By M.MovieID, M.Title
Having Count(MA.ActorID) > (
SELECT AVG(ActorCount)
From (
    SELECT Count(ActorID) AS ActorCount
    From MovieActors
    Group By MovieID
     ) AS SubQuery
    );

Select Title, Actors.Name
From Movies
            inner join MovieActors on Movies.MovieID = MovieActors.MovieID
            inner join Actors on MovieActors.ActorID = Actors.ActorID
    Where Year >= 2000;



