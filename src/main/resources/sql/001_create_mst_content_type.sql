CREATE TABLE amethyst.MST_CONTENT_TYPE
(id int NOT NULL PRIMARY KEY AUTO_INCREMENT, name varchar(50), description varchar(200), pictureUrl varchar(150), createDate date, createUser varchar(50),
updateDate date, updateUser varchar(50), deleteFlg int
);

INSERT INTO amethyst.MST_CONTENT_TYPE VALUES
(1, 'デザイン研究', '視覚聴覚３Ｄ等、デザインの研究をするスペースです。' ,'img/desworks.jpg', '20170101', 'user', '20170101', 'user', 0),
(2, '技術研究', 'システム・その他科学技術の研究をするスペースです。' ,'img/tecworks.jpg', '20170101', 'user', '20170101', 'user', 0),
(3, '随想集', '随想を書きためるスペースです。' ,'img/essayworks.jpg', '20170101', 'user', '20170101', 'user', 0);