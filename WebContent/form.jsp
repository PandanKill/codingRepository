<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html lang="en-US">

<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Kanrisha - A Premium HTML5 Responsive Admin Template</title>
<style>
td {
	text-align: center;
}
</style>
<!--[if lt IE 9]>
		<script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
		<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
		<script src="Javascript/Flot/excanvas.js"></script>
	<![endif]-->
<!-- The Fonts -->
<link
	href="http://fonts.googleapis.com/css?family=Oswald|Droid+Sans:400,700"
	rel="stylesheet" />
<!-- The Main CSS File -->
<link rel="stylesheet" href="CSS/style.css" />
<!-- jQuery -->
<script src="Javascript/jQuery/jquery-1.7.2.min.js"></script>
<!-- Flot -->
<script src="Javascript/Flot/jquery.flot.js"></script>
<script src="Javascript/Flot/jquery.flot.resize.js"></script>
<script src="Javascript/Flot/jquery.flot.pie.js"></script>
<!-- DataTables -->
<script src="Javascript/DataTables/jquery.dataTables.min.js"></script>
<!-- ColResizable -->
<script src="Javascript/ColResizable/colResizable-1.3.js"></script>
<!-- jQuryUI -->
<script src="Javascript/jQueryUI/jquery-ui-1.8.21.min.js"></script>
<!-- Uniform -->
<script src="Javascript/Uniform/jquery.uniform.js"></script>
<!-- Tipsy -->
<script src="Javascript/Tipsy/jquery.tipsy.js"></script>
<!-- Elastic -->
<script src="Javascript/Elastic/jquery.elastic.js"></script>
<!-- ColorPicker -->
<script src="Javascript/ColorPicker/colorpicker.js"></script>
<!-- SuperTextarea -->
<script src="Javascript/SuperTextarea/jquery.supertextarea.min.js"></script>
<!-- UISpinner -->
<script src="Javascript/UISpinner/ui.spinner.js"></script>
<!-- MaskedInput -->
<script src="Javascript/MaskedInput/jquery.maskedinput-1.3.js"></script>
<!-- ClEditor -->
<script src="Javascript/ClEditor/jquery.cleditor.js"></script>
<!-- Full Calendar -->
<script src="Javascript/FullCalendar/fullcalendar.js"></script>
<!-- Color Box -->
<script src="Javascript/ColorBox/jquery.colorbox.js"></script>
<!-- Kanrisha Script -->
<script src="Javascript/kanrisha.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body>
	<div class="contents">
		<div class="grid_wrapper">

			<div class="g_6 contents_header">
				<h3 class="i_16_table tab_label">数据库管理</h3>
				<div>
					<span class="label">数据库的备份和管理</span>
				</div>
			</div>

			<div class="g_12 separator">
				<span></span>
			</div>

			<!-- Simple Table -->
			<div class="g_12">
				<div class="widget_header">
					<h4 class="widget_header_title wwIcon i_16_tables">试题的备份和恢复(Database
						backup and recovery)</h4>
				</div>
				<div class="widget_contents noPadding">
					<table class="tables" id="table_table1">
						<thead>
							<tr>
								<th>数据库</th>

								<th>功能</th>
							</tr>
						</thead>
						<tbody>
                            <form id="fen">
							<tr>
								<td align="center"><select size="1" id="a" name="a">
										<option value="人员表" >人员表</option>
										<option value="科目表" >科目表</option>
										<option value="题库表" >题库表</option>
										<option value="试卷表" >试卷表</option>
								</select></td>
								<td>
								    <input type="button"  value="备份" onclick="beifen()"/>

								    <input type="button" value="恢复" onclick="huifu()"/>
									<input type="button" value="删除备份" onclick="nihao()"/> 
									<input type="button" value="查询备份" onclick="chaxun()">
									</td>
							</tr>
							</form> 
						</tbody>
					</table>
				</div>
			</div>
			<!-- Column Resize-Able -->

			<!-- Separator -->

		</div>
	</div>
	</div>

	<div style="display: none">
		<script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540'
			language='JavaScript' charset='gb2312'></script>
	</div>
	<script>
  	function beifen(){
		var q=document.getElementById("fen");
		q.action="bei";
		q.method="post";
		q.submit();
		
	}  
	
	function huifu(){
		var r=document.getElementById("fen");
		r.action="hui";
		r.method="post";
		r.submit();
		
	}
	
	function nihao(){
		var r=document.getElementById("fen");
		r.action="ni";
		r.method="post";
		r.submit();
		
	}
	
	function chaxun(){
		var t=document.getElementById("fen");
		t.action="chaxun";
		t.method="post";
		t.submit();
	}
	
	
	
	</script>

</body>

</html>