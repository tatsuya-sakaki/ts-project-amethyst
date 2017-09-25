<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="utf8">
<meta name="description" content="メインページです">
<meta name="robots" content="noindex,nofollow">
<title>メインページ</title>
<link rel="shortcut icon" href="img/iam.ico" />
<link rel="stylesheet" href="css/common.css" />
<link rel="stylesheet" href="css/index.css" />
</head>
<body>
	<header>共通ヘッダーさん</header>
	<nav>ホーム</nav>
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
			<div id="topimage">
				<img class="img circled" src="img/iam.jpg" alt="iam">
			</div>
			<div id="top-description">
				<h1>Myクラウドガレージ</h1>
			</div>
			<div id="top-news">
				<h2>近況：</h2>
				<p>
					&nbsp;ウチの課はとても良いところ。<br>
					YさんもKさんもとっても優しいし、MさんやIさんは技術力も高くて学ぶことばかり。<br>
					Sさんもいつも元気だし、Tさんにもうかうかしているとあっという間に追い抜かれそう。。<br>
					T築wiki課長の下、今日も頑張るぞ！！
				</p>
			</div>
		</div>
		<hr>
		<div id="contents">
			<h2>コンテンツ</h2>
			<ul class="contentlist">
			<c:forEach var="contentType" items="${contentTypeList}">
						<c:set var="id" value="${contentType.contentTypeId}" ></c:set>
				<li class="content"><a href="${'type/' +=id}.html">
						<div class="contimg">
							<img src="${contentType.pictureUrl}" width="250" height="250"
								alt="${contentType.name}">
						</div>
						<c:set var="name" value="${contentType.name}" ></c:set>
						<div class="conttext">${name}</div>
				</a></li>
			</c:forEach>
			</ul>
			<p class="clear"></p>
		</div>
	</div>
	<footer>共通フッタ―さん</footer>
</body>
</html>