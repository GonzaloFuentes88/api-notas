INSERT INTO roles (tipo) VALUES ('ADMIN');
INSERT INTO roles (tipo) VALUES ('USUARIO');

-- Inserts para la tabla usuarios
INSERT INTO usuarios (nombre, apellido, dni, username, password, email, role_id) VALUES ('Pedro', 'Martinez', 123456789, 'pedrom', 'password123', 'pedro@example.com', 1);
INSERT INTO usuarios (nombre, apellido, dni, username, password, email, role_id) VALUES ('Maria', 'Garcia', 987654321, 'mariag', 'password456', 'maria@example.com', 2);
INSERT INTO usuarios (nombre, apellido, dni, username, password, email, role_id) VALUES ('Carlos', 'Lopez', 456789123, 'carlosl', 'password789', 'carlos@example.com', 1);
INSERT INTO usuarios (nombre, apellido, dni, username, password, email, role_id) VALUES ('Laura', 'Rodriguez', 789123456, 'laurar', 'password987', 'laura@example.com', 2);
INSERT INTO usuarios (nombre, apellido, dni, username, password, email, role_id) VALUES ('Ana', 'Hernandez', 321987654, 'anah', 'password321', 'ana@example.com', 1);
INSERT INTO usuarios (nombre, apellido, dni, username, password, email, role_id) VALUES ('Javier', 'Perez', 654321987, 'javierp', 'password654', 'javier@example.com', 2);
INSERT INTO usuarios (nombre, apellido, dni, username, password, email, role_id) VALUES ('Sara', 'Gomez', 987654321, 'sarag', 'password987', 'sara@example.com', 1);
INSERT INTO usuarios (nombre, apellido, dni, username, password, email, role_id) VALUES ('Andrés', 'Fernandez', 456789123, 'andresf', 'password321', 'andres@example.com', 2);
INSERT INTO usuarios (nombre, apellido, dni, username, password, email, role_id) VALUES ('Lucia', 'Lopez', 789123456, 'lucial', 'password654', 'lucia@example.com', 1);
INSERT INTO usuarios (nombre, apellido, dni, username, password, email, role_id) VALUES ('Miguel', 'Gonzalez', 321987654, 'miguelg', 'password987', 'miguel@example.com', 2);

-- Inserts para la tabla tareas_pendientes
INSERT INTO tareas_pendientes (titulo, descripcion, fecha_creacion, fecha_vencimiento, estado, usuario_asignado, prioridad) VALUES ('Tarea 1 Pendiente', 'Descripción de la Tarea 1 Pendiente', '2023-05-21 08:45:00', '2023-05-24 10:30:00', 1, 1, 2);
INSERT INTO tareas_pendientes (titulo, descripcion, fecha_creacion, fecha_vencimiento, estado, usuario_asignado, prioridad) VALUES ('Tarea 2 Pendiente', 'Descripción de la Tarea 2 Pendiente', '2023-05-21 08:45:00', '2023-05-24 10:30:00', 1, 2, 2);
INSERT INTO tareas_pendientes (titulo, descripcion, fecha_creacion, fecha_vencimiento, estado, usuario_asignado, prioridad) VALUES ('Tarea 3 Pendiente', 'Descripción de la Tarea 3 Pendiente', '2023-05-21 08:45:00', '2023-05-24 10:30:00', 1, 3, 2);
INSERT INTO tareas_pendientes (titulo, descripcion, fecha_creacion, fecha_vencimiento, estado, usuario_asignado, prioridad) VALUES ('Tarea 4 Pendiente', 'Descripción de la Tarea 4 Pendiente', '2023-05-22 09:30:00', '2023-05-25 12:00:00', 1, 4, 1);--4
INSERT INTO tareas_pendientes (titulo, descripcion, fecha_creacion, fecha_vencimiento, estado, usuario_asignado, prioridad) VALUES ('Tarea 5 Pendiente', 'Descripción de la Tarea 5 Pendiente', '2023-05-23 10:15:00', '2023-05-26 14:30:00', 1, 5, 0);
INSERT INTO tareas_pendientes (titulo, descripcion, fecha_creacion, fecha_vencimiento, estado, usuario_asignado, prioridad) VALUES ('Tarea 6 Pendiente', 'Descripción de la Tarea 6 Pendiente', '2023-05-24 11:00:00', '2023-05-27 09:00:00', 1, 6, 2);
INSERT INTO tareas_pendientes (titulo, descripcion, fecha_creacion, fecha_vencimiento, estado, usuario_asignado, prioridad) VALUES ('Tarea 7 Pendiente', 'Descripción de la Tarea 7 Pendiente', '2023-05-25 12:30:00', '2023-05-28 10:30:00', 1, 7, 1);
INSERT INTO tareas_pendientes (titulo, descripcion, fecha_creacion, fecha_vencimiento, estado, usuario_asignado, prioridad) VALUES ('Tarea 8 Pendiente', 'Descripción de la Tarea 8 Pendiente', '2023-05-26 13:45:00', '2023-05-29 12:00:00', 1, 8, 0);
INSERT INTO tareas_pendientes (titulo, descripcion, fecha_creacion, fecha_vencimiento, estado, usuario_asignado, prioridad) VALUES ('Tarea 9 Pendiente', 'Descripción de la Tarea 9 Pendiente', '2023-05-27 14:30:00', '2023-05-30 14:30:00', 1, 9, 2);
INSERT INTO tareas_pendientes (titulo, descripcion, fecha_creacion, fecha_vencimiento, estado, usuario_asignado, prioridad) VALUES ('Tarea 10 Pendiente', 'Descripción de la Tarea 10 Pendiente', '2023-05-28 15:15:00', '2023-05-31 16:00:00', 1, 10, 1);

-- Inserts para la tabla tareas_realizadas
INSERT INTO tareas_realizadas (titulo, descripcion, fecha_creacion, fecha_vencimiento, estado, usuario_asignado, fecha_finalizacion) VALUES ('Tarea 1 Realizada', 'Descripción de la Tarea 1 Realizada', '2023-05-21 08:45:00', '2023-05-22 10:30:00', 1, 3, '2023-05-22 12:45:00');
INSERT INTO tareas_realizadas (titulo, descripcion, fecha_creacion, fecha_vencimiento, estado, usuario_asignado, fecha_finalizacion) VALUES ('Tarea 2 Realizada', 'Descripción de la Tarea 2 Realizada', '2023-05-21 08:45:00', '2023-05-22 10:30:00', 1, 3, '2023-05-22 12:45:00');
INSERT INTO tareas_realizadas (titulo, descripcion, fecha_creacion, fecha_vencimiento, estado, usuario_asignado, fecha_finalizacion) VALUES ('Tarea 3 Realizada', 'Descripción de la Tarea 3 Realizada', '2023-05-21 08:45:00', '2023-05-22 10:30:00', 1, 3, '2023-05-22 12:45:00');
INSERT INTO tareas_realizadas (titulo, descripcion, fecha_creacion, fecha_vencimiento, estado, usuario_asignado, fecha_finalizacion) VALUES ('Tarea 4 Realizada', 'Descripción de la Tarea 4 Realizada', '2023-05-22 09:30:00', '2023-05-23 12:00:00', 1, 4, '2023-05-23 13:15:00');
INSERT INTO tareas_realizadas (titulo, descripcion, fecha_creacion, fecha_vencimiento, estado, usuario_asignado, fecha_finalizacion) VALUES ('Tarea 5 Realizada', 'Descripción de la Tarea 5 Realizada', '2023-05-23 10:15:00', '2023-05-24 14:30:00', 1, 5, '2023-05-24 15:45:00');
INSERT INTO tareas_realizadas (titulo, descripcion, fecha_creacion, fecha_vencimiento, estado, usuario_asignado, fecha_finalizacion) VALUES ('Tarea 6 Realizada', 'Descripción de la Tarea 6 Realizada', '2023-05-24 11:00:00', '2023-05-25 09:00:00', 1, 6, '2023-05-25 11:30:00');
INSERT INTO tareas_realizadas (titulo, descripcion, fecha_creacion, fecha_vencimiento, estado, usuario_asignado, fecha_finalizacion) VALUES ('Tarea 7 Realizada', 'Descripción de la Tarea 7 Realizada', '2023-05-25 12:30:00', '2023-05-26 10:30:00', 1, 7, '2023-05-26 12:45:00');
INSERT INTO tareas_realizadas (titulo, descripcion, fecha_creacion, fecha_vencimiento, estado, usuario_asignado, fecha_finalizacion) VALUES ('Tarea 8 Realizada', 'Descripción de la Tarea 8 Realizada', '2023-05-26 13:45:00', '2023-05-27 12:00:00', 1, 8, '2023-05-27 13:30:00');
INSERT INTO tareas_realizadas (titulo, descripcion, fecha_creacion, fecha_vencimiento, estado, usuario_asignado, fecha_finalizacion) VALUES ('Tarea 9 Realizada', 'Descripción de la Tarea 9 Realizada', '2023-05-27 14:30:00', '2023-05-28 14:30:00', 1, 9, '2023-05-28 16:00:00');
INSERT INTO tareas_realizadas (titulo, descripcion, fecha_creacion, fecha_vencimiento, estado, usuario_asignado, fecha_finalizacion) VALUES ('Tarea 10 Realizada', 'Descripción de la Tarea 10 Realizada', '2023-05-28 15:15:00', '2023-05-29 16:00:00', 1, 10, '2023-05-29 17:15:00');

-- Inserts para la tabla comentarios_tarea_realizada
INSERT INTO comentarios_tarea_realizada (tarea_realizada_id, comentario) VALUES (1, 'Comentario 2');
INSERT INTO comentarios_tarea_realizada (tarea_realizada_id, comentario) VALUES (2, 'Comentario 2');
INSERT INTO comentarios_tarea_realizada (tarea_realizada_id, comentario) VALUES (3, 'Comentario 3');
INSERT INTO comentarios_tarea_realizada (tarea_realizada_id, comentario) VALUES (4, 'Comentario 3');
INSERT INTO comentarios_tarea_realizada (tarea_realizada_id, comentario) VALUES (5, 'Comentario 4');
INSERT INTO comentarios_tarea_realizada (tarea_realizada_id, comentario) VALUES (6, 'Comentario 4');
INSERT INTO comentarios_tarea_realizada (tarea_realizada_id, comentario) VALUES (7, 'Comentario 5');
INSERT INTO comentarios_tarea_realizada (tarea_realizada_id, comentario) VALUES (8, 'Comentario 5');
INSERT INTO comentarios_tarea_realizada (tarea_realizada_id, comentario) VALUES (9, 'Comentario 6');
INSERT INTO comentarios_tarea_realizada (tarea_realizada_id, comentario) VALUES (10, 'Comentario 6');