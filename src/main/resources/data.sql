DROP TABLE IF EXISTS carGarage;
 
CREATE TABLE carGarage (
  id INT AUTO_INCREMENT PRIMARY KEY,
  make VARCHAR(250) NOT NULL,
  model VARCHAR(250) NOT NULL,
  color VARCHAR(250) NOT NULL,
  year VARCHAR(250) DEFAULT NULL 
);
 
INSERT INTO carGarage (make, model, color, year) VALUES
  ('Toyota', 'Camry', 'Black', '2003'),
  ('Ford', 'Focus', 'Silver', '2012' ),
  ('Nissan', 'Murano', 'Light Blue', '2003');