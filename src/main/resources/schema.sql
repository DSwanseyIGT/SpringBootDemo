CREATE TABLE IF NOT EXISTS Run (
    id INT NOT NULL,
    title varchar(250) NOT NULL,
    started_on timestamp NOT NULL,
    completed_on timestamp NOT NULL,
    miles INT NOT NULL,
    location varchar(10) NOT NULL,
    version INT,
    PRIMARY KEY (id)
);

-- CREATE TABLE IF NOT EXISTS Engineers (
--     id INT NOT NULL,
--     firstName varchar(25) NOT NULL,
--     lastName varchar(50) NOT NULL,
--     email varchar(100) NOT NULL,
--     title varchar(50) NOT NULL,
--     experience INT NOT NULL,
--     projectid INT,
--     PRIMARY KEY (id)
--     -- FOREIGN KEY (projectid) REFERENCES "Projects".id
-- );
--
-- CREATE TABLE IF NOT EXISTS Projects (
--     id INT NOT NULL,
--     site varchar(250) NOT NULL,
--     projectmanagerid INT NOT NULL,
--     PRIMARY KEY (id),
--     FOREIGN KEY (projectmanagerid) REFERENCES "Engineers".id
-- );