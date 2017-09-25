<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="utf8">
<meta name="description" content="コンテンツページです">
<meta name="robots" content="noindex,nofollow">
<title>コンテンツページ</title>
<link rel="shortcut icon" href="../img/iam.ico" />
<link rel="stylesheet" href="../css/common.css" />
<link rel="stylesheet" href="../css/type.css" />
</head>
<body>
	<header>共通ヘッダーさん</header>
	<nav>
		<a href="../index.html">ホーム</a>&nbsp;&gt;&nbsp;コンテンツ
	</nav>
	<div id="leftside">
		<p>左サイドさん</p>
		<p>左サイドさん</p>
		<p>左サイドさん</p>
		<p>左サイドさん</p>
		<p>左サイドさん</p>
		<p>左サイドさん</p>
		<p>左サイドさん</p>
		<p>左サイドさん</p>
		<p>左サイドさん</p>
		<p>左サイドさん</p>
		<p>左サイドさん</p>
		<p>左サイドさん</p>
		<p>左サイドさん</p>
	</div>
	<div id="rightside">
		<p>右サイドさん</p>
		<p>右サイドさん</p>
		<p>右サイドさん</p>
		<p>右サイドさん</p>
		<p>右サイドさん</p>
		<p>右サイドさん</p>
		<p>右サイドさん</p>
		<p>右サイドさん</p>
		<p>右サイドさん</p>
		<p>右サイドさん</p>
		<p>右サイドさん</p>
		<p>右サイドさん</p>
		<p>右サイドさん</p>
	</div>
	<div id="main">
		<div id="top">
			<div id="cont-image">
				<img src="../${contentType.pictureUrl}" width="250" height="250"
					alt="${contentType.name}">
			</div>
			<div id="cont-description">
				<h1>${contentType.name}</h1>
				<p>${contentType.description}</p>
			</div>
		</div>
		<hr>
		<div id="content">
			<div>
				<p>今はまだ何もないんよ</p>
			</div>
		</div>
	</div>
	<p class="clear"></p>
	<footer>
		<hr>
		共通フッタ―さん
	</footer>
</body>
</html>