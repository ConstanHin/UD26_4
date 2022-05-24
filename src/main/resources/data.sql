
insert into facultades (codigo, nombre) values
(1, "Facultad1"),
(2, "Facultad2"),
(3, "Facultad3");

insert into investigadores (dni, nom_apels, facultad_codigo) values
(123, "Pepe", 1),
(124, "Pepo", 1),
(125, "Pepa", 3);

insert into equipos (num_serie, nombre, facultad_codigo) values
(99, "Equipo1", 1),
(98, "Equipo2", 2),
(97, "Equipo3", 1);

insert into reservas (id, comienzo, fin, equipo_num_serie, investigador_dni) values
(1, "2000-01-01", "2000-01-02", 99, 123),
(2, "2000-01-02", "2000-01-03", 98, 124),
(3, "2000-01-03", "2000-01-04", 98, 124);