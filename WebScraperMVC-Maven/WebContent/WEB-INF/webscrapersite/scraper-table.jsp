<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
 <!-- let's add tag srping:url -->
<spring:url value="/resources/css/scraper-table.css" var="scraper-tableCSS" />
<link href="${scraper-tableCSS}" rel="stylesheet" />
<!-- Finish adding tags -->
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<title>Scrape Table</title>
</head>
<body>
	<h2>Table</h2>
	
	<button>Scrape</button><button>Reset Table</button>
	<br>
	<table style="width: 100%">
		<tr>
			<th>ID</th>
			<th>TimeStamp</th>
			<th>Symbol</th>
			<th>LastPrice</th>
			<th>Change</th>
			<th>Change%/</th>
			<th>MarketTime</th>
			<th>Volume</th>
			<th>AvgVol</th>
			<th>MarketCap</th>
		</tr>
		<tr>
			<td>1</td>
			<td>2020-05-02</td>
			<td>AMD</td>
			<td>49.88</td>
			<td>-2.51</td>
			<td>-4.79%</td>
			<td>"4:00PM EDT"</td>
			<td>69.563M</td>
			<td>81.965M</td>
			<td>58.419B</td>
		</tr>
		<tr>
			<td>2</td>
			<td>2020-05-02</td>
			<td>CVS</td>
			<td>59.70</td>
			<td>-1.85</td>
			<td>-3.01%</td>
			<td>"4:02PM EDT"</td>
			<td>7.309M</td>
			<td>11.485M</td>
			<td>77.944B</td>
		</tr>
		<tr>
			<td>3</td>
			<td>2020-05-02</td>
			<td>GOOG</td>
			<td>"1,320.61"</td>
			<td>-28.05</td>
			<td>-2.08%</td>
			<td>"4:00PM EDT"</td>
			<td>2.073M</td>
			<td>2.497M</td>
			<td>900.811B</td>
		</tr>
		<tr>
			<td>70</td>
			<td>2020-05-02</td>
			<td>HAS</td>
			<td>68.73</td>
			<td>-3.48</td>
			<td>-4.82%</td>
			<td>"4:00PM EDT"</td>
			<td>1.742M</td>
			<td>1.922M</td>
			<td>9.416B</td>
		</tr>
		<tr>
			<td>71</td>
			<td>2020-05-02</td>
			<td>IBM</td>
			<td>121.87</td>
			<td>-3.69</td>
			<td>-2.94%</td>
			<td>"4:02PM EDT</td>
			<td>4.822M</td>
			<td>7.079M</td>
			<td>108.207B</td>
		</tr>
		<tr>
			<td>72</td>
			<td>2020-05-02</td>
			<td>INTC</td>
			<td>57.47</td>
			<td>-2.51</td>
			<td>-4.18%</td>
			<td>"4:00PM EDT"</td>
			<td>21.195M</td>
			<td>32.404M</td>
			<td>243.328B</td>
		</tr>
		<tr>
			<td>100</td>
			<td>2020-05-02</td>
			<td>MSFT</td>
			<td>174.57</td>
			<td>-4.64</td>
			<td>-2.59%</td>
			<td>"4:00PM EDT"</td>
			<td>39.37M</td>
			<td>55.944M</td>
			<td>1.324T</td>
		</tr>
		<tr>
			<td>174</td>
			<td>2020-05-02</td>
			<td>NVDA</td>
			<td>282.78</td>
			<td>-9.50</td>
			<td>-3.25%</td>
			<td>"4:00PM EDT"</td>
			<td>8.552M</td>
			<td>15.687M</td>
			<td>173.061B</td>
		</tr>
		<tr>
			<td>175</td>
			<td>2020-05-02</td>
			<td>SNE</td>
			<td>62.73</td>
			<td>-1.52</td>
			<td>-2.37%</td>
			<td>"4:02PM EDT"</td>
			<td>"623,784"</td>
			<td>1.581M</td>
			<td>77.453B</td>
		</tr>
		<tr>
			<td>276</td>
			<td>2020-05-02</td>
			<td>SQNXF</td>
			<td>41.74</td>
			<td>+0.29</td>
			<td>+0.70%</td>
			<td>"12:28PM EDT"</td>
			<td>899</td>
			<td>793</td>
			<td>4.96B</td>
		</tr>
		<tr>
			<td>377</td>
			<td>2020-05-02</td>
			<td>TSLA</td>
			<td>701.32</td>
			<td>-80.56</td>
			<td>-10.30%</td>
			<td>"4:00PM EDT"</td>
			<td>32.532M</td>
			<td>20.763M</td>
			<td>129.316B</td>
	</table>
	<footer><i>Typed by the fingers of Jim Doyle</i></footer>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</body>
</html>