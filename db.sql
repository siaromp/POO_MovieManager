DROP TABLE IF EXISTS actors;
CREATE TABLE actors (
    id INTEGER PRIMARY KEY,
    name TEXT UNIQUE NOT NULL
);

DROP TABLE IF EXISTS directors;
CREATE TABLE directors (
    id INTEGER PRIMARY KEY,
    name TEXT UNIQUE NOT NULL
);

DROP TABLE IF EXISTS genres;
CREATE TABLE genres (
    id INTEGER PRIMARY KEY,
    name TEXT UNIQUE NOT NULL
);

DROP TABLE IF EXISTS movies;
CREATE TABLE movies (
    id INTEGER PRIMARY KEY,
    title TEXT UNIQUE NOT NULL,
    sinopse TEXT,
    genre_id INTEGER,
    director_id INTEGER,
    FOREIGN KEY(genre_id) REFERENCES genres(id),
    FOREIGN KEY(director_id) REFERENCES director(id)
);

DROP TABLE IF EXISTS movies_actors;
CREATE TABLE movies_actors (
    movie_id INTEGER NOT NULL,
    actor_id INTEGER NOT NULL,
    FOREIGN KEY(movie_id) REFERENCES movie(id),
    FOREIGN KEY(actor_id) REFERENCES actor(id)
);