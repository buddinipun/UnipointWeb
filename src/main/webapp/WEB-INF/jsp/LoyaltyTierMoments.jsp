<%-- 
    Document   : Buzz Me
    Created on : 18-Aug-2016, 00:14:43
    Author     : chinthana
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<script src="../../UnipointWeb/resources/js/angular.js"></script>

<script src="../../UnipointWeb/resources/js/d3.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/d3/3.5.2/d3.min.js" charset="utf-8"></script>

<script src="../../UnipointWeb/resources/js/nv.d3.js"></script>
<script src="../../UnipointWeb/resources/js/angularjs-nvd3-directives.js"></script>
<link rel="stylesheet" href="../../UnipointWeb/resources/css/nv.d3.css"/>

  <style>
        text {
            font: 12px sans-serif;
        }
        svg {
            display: block;
            float: left;
            height: 350px !important;
            width: 350px !important;
        }
        html, body {
            margin: 0px;
            padding: 0px;
            height: 100%;
            width: 100%;
        }
    </style>
    <style type="text/css">
			    .box{
			        display: none;
			        margin-top: 20px;
			    }
			    .schema1{ background: transparent; }
			    .schema2{ background: transparent; }
			    .schema3{ background: transparent; }
			</style>
		
<script type="text/javascript">
$(document).ready(function(){
    $("select").change(function(){
        $(this).find("option:selected").each(function(){
            if($(this).attr("value")=="schema2"){
                $(".box").not(".schema2").hide();
                $(".schema2").show();
            }
            else if($(this).attr("value")=="schema1"){
                $(".box").not(".schema1").hide();
                $(".schema1").show();
            }
            else if($(this).attr("value")=="schema3"){
                $(".box").not(".schema3").hide();
                $(".schema3").show();
            }
            else{
                $(".box").hide();
            }
        });
    }).change();
});
</script>
<script>
        var app = angular.module("nvd3TestApp", ['nvd3ChartDirectives']);

        function ExampleCtrl($scope){
            $scope.exampleData = [
                {
                    "key": "Series1",
                    "color": "#d62728",
                    "values": [
                        ["Group A" , -1.8746444827653 ],
                        ["Group B" , -8.0961543492239 ],
                        ["Group C" , -0.57072943117674],
                        ["Group D" , -2.4174010336624 ],
                        ["Group E" , -0.72009071426284],
                        ["Group F" , -0.77154485523777],
                        ["Group G" , -0.90152097798131],
                        ["Group H" , -0.91445417330854],
                        ["Group I" , -0.055746319141851]
                    ]
                },
                {
                    "key": "Series2",
                    "color": "#1f77b4",
                    "values": [
                        ["Group A" , 25.307646510375],
                        ["Group B" , 16.756779544553],
                        ["Group C" , 18.451534877007],
                        ["Group D" , 8.6142352811805],
                        ["Group E" , 7.8082472075876],
                        ["Group F" , 5.259101026956],
                        ["Group G" , 0.30947953487127],
                        ["Group H" , 0],
                        ["Group I" , 0]
                    ]
                }
            ];

        }
    </script>
<!-- START X-NAVIGATION VERTICAL -->

<!-- END X-NAVIGATION VERTICAL -->

<!-- START BREADCRUMB -->
<ul class="breadcrumb">
	<li><a href="#">Home</a></li>
	<li><a href="#">Report Management</a></li>
	<li class="active">Loyalty Tier Moments</li>
</ul>
<!-- END BREADCRUMB -->

<!-- PAGE TITLE -->
<div class="page-title">
	<h2>
		<span class="fa fa-arrow-circle-o-left"></span>Reporting Section
	</h2>
</div>
<!-- END PAGE TITLE -->

<!-- PAGE CONTENT WRAPPER -->
<div class="page-content-wrap">

	<div class="row"></div>


	<div class="row">
		<div class="col-md-12">
			<!-- START PANEL WITH STATIC CONTROLS -->
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">Loyalty Tier Moments</h3>

				</div>
				<div class="panel-body">
				<div class="row">
				<div class="col-md-3">
			<svg id="test1" class="mypiechart"></svg>
			
			</div>
			<div class="col-md-9">
			 <div class="dropdown" style="float:right;width:300px;margin-right:45px;font-size:18px;">
                    	<select class="form-control">
				            <option value="schema1">schema 1</option>
				            <option value="schema2">schema 2</option>
				            <option value="schema3">schema 3</option>
				        </select>
                    </div>	
                    
                     <div class="schema1 box">
                     <h1>Schema1</h1>
                    <div ng-app='nvd3TestApp'>
<div ng-controller="ExampleCtrl">
    <nvd3-multi-bar-horizontal-chart
            data="exampleData"
            id="exampleId"
            showXAxis="true"
            showYAxis="true"
            >
        <svg></svg>
    </nvd3-multi-bar-horizontal-chart>
</div>
                     </div>
                     <div class="schema2 box">
                     <h1>schema2</h1>
                     </div>
                     <div class="schema3 box">
                     <h1>schema3</h1>
                     </div>
			</div>
				</div>
				</div>
				</div>

		</div>
		<!-- END PAGE CONTENT WRAPPER -->
	</div>
	<!-- END PAGE CONTENT -->
</div>
<!-- END PAGE CONTAINER -->




<!--< -------------------------------------------------START INPUT VALIDATION ----------------------------->


<!--< -------------------------------------------------END INPUT VALIDATION ----------------------------->
<%@include file="../../resources/include/footer.jsp"%>
<script>
 var testdata2 = [
        {key: "Schema1", y: 5},
        {key: "Schema3", y: 9},
        {key: "Schema2", y: 4},    
    ];
   var height = 400;
    var width = 400;

    nv.addGraph(function() {
        var chart = nv.models.pieChart()
            .x(function(d) { return d.key })
            .y(function(d) { return d.y })
            .width(width)
            .height(height)
            .showTooltipPercent(true);

        d3.select("#test1")
            .datum(testdata2)
            .transition().duration(1200)
            .attr('width', width)
            .attr('height', height)
            .call(chart);
	  return chart;
    });

    nv.addGraph(function() {
        var chart = nv.models.pieChart()
            .x(function(d) { return d.key })
            .y(function(d) { return d.y })
            //.labelThreshold(.08)
            //.showLabels(false)
            .color(d3.scale.category20().range().slice(8))
            .growOnHover(false)
            .labelType('value')
            .width(width)
            .height(height);

        // make it a half circle
       

        // MAKES LABELS OUTSIDE OF PIE/DONUT
        //chart.pie.donutLabelsOutside(true).donut(true);

        // LISTEN TO CLICK EVENTS ON SLICES OF THE PIE/DONUT
        // chart.pie.dispatch.on('elementClick', function() {
        //     code...
        // });

        // chart.pie.dispatch.on('chartClick', function() {
        //     code...
        // });

        // LISTEN TO DOUBLECLICK EVENTS ON SLICES OF THE PIE/DONUT
        // chart.pie.dispatch.on('elementDblClick', function() {
        //     code...
        // });

        // LISTEN TO THE renderEnd EVENT OF THE PIE/DONUT
        // chart.pie.dispatch.on('renderEnd', function() {
        //     code...
        // });

        // OTHER EVENTS DISPATCHED BY THE PIE INCLUDE: elementMouseover, elementMouseout, elementMousemove
        // @see nv.models.pie

        d3.select("#test2")
            .datum(testdata)
            .transition().duration(1200)
            .attr('width', width)
            .attr('height', height)
            .call(chart);

        // disable and enable some of the sections
        var is_disabled = false;
       

        return chart;
    });

</script>
</html>
