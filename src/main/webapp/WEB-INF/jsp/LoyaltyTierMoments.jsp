<%-- 
    Document   : Buzz Me
    Created on : 18-Aug-2016, 00:14:43
    Author     : chinthana
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>

});




<main id="app-main" class="app-main">
<div class="wrap">
	<section class="app-content">
    <div class="row">
      <div class="col-md-7">
        <div class="widget">
          <header class="widget-header">
            <h4 class="widget-title">loyalty Tier Moments</h4>
          </header><!-- .widget-header -->
          <hr class="widget-separator">
          <div class="widget-body">
            <div data-plugin="chart" data-options="{
                tooltip: {
                    trigger: 'item',
                    formatter: '{a} <br/>{b} : {c}%'
                },
                legend: {
                    data: ['Tier1','Tier2','Tier3','Tier4','Tier5']
                },
                calculable: true,
                series: [
                    {
                        name:'Funnel plot',
                        type:'funnel',
                        left: '10%',
                        top: 60,
                        //x2: 80,
                        bottom: 60,
                        width: '80%',
                        // height: {totalHeight} - y - y2,
                        min: 0,
                        max: 100,
                        minSize: '0%',
                        maxSize: '100%',
                        sort: 'descending',
                        gap: 2,
                        label: {
                            normal: {
                                show: true,
                                position: 'inside'
                            },
                            emphasis: {
                                textStyle: {
                                    fontSize: 16
                                }
                            }
                        },
                        labelLine: {
                            normal: {
                                length: 10,
                                lineStyle: {
                                    width: 1,
                                    type: 'solid'
                                }
                            }
                        },
                        itemStyle: {
                            normal: {
                                borderColor: '#fff',
                                borderWidth: 1
                            }
                        },
                        data: [
                            {value: 60, name: 'Tier5'},
                            {value: 40, name: 'Tier4'},
                            {value: 20, name: 'Tier3'},
                            {value: 80, name: 'Tier2'},
                            {value: 100, name: 'Tier1'}
                        ]
                    }
                ]
            }" style="height: 300px;">
            </div>
          </div><!-- .widget-body -->
        </div><!-- .widget -->
      </div><!-- END column -->
	  
	  <div class="col-md-5">
				<div class="widget">
					<header class="widget-header">
						<h4 class="widget-title">Tier Percentage by Users</h4>
					</header><!-- .widget-header -->
					<hr class="widget-separator">
					<div class="widget-body">
						<div data-plugin="plot" data-options="
							[
								{ label: 'Tier1', data: 51.74, color: 'rgb(103, 157, 198)' },
								{ label: 'Tier2', data: 15.74, color: 'rgb(57, 128, 181)' },
								{ label: 'Tier3', data: 16.67, color: '#ffa000' },
								{ label: 'Tier4', data: 4.21, color: '#e64a19' },
								{ label: 'Tier5', data: 9.84, color: '#4caf50' }
								
							],
							{
								series: {
									pie: { show: true }
								},
								legend: { show: false },
								grid: { hoverable: true },
								tooltip: {
									show: true,
									content: '%s %p.0%',
									defaultTheme: true
								}
							}" style="height: 300px;width: 100%;">
						</div>
					</div><!-- .widget-body -->
				</div><!-- .widget -->
			</div><!-- END column -->
			
			
			<div class="col-md-12">
				<div class="widget p-lg">
					<h4 class="m-b-lg">Tier moments</h4>
					
					

					<table class="table table-bordered">
						<tr><th>New SignUp</th><th>Tier 1</th><th>Tier 2</th><th>Tier 3</th><th>Tier 4</th><th>Tier 5</th></tr>
						<tr><td>Tier 1</td><td>100</td><td>200</td><td>300</td><td>400</td><td>500</td></tr>
						<tr><td>Tier 2</td><td>100</td><td>200</td><td>300</td><td>400</td><td>500</td></tr>
						<tr><td>Tier 3</td><td>100</td><td>200</td><td>300</td><td>400</td><td>500</td></tr>
						<tr><td>Tier 4</td><td>100</td><td>200</td><td>300</td><td>400</td><td>500</td></tr>
						<tr><td>Tier 5</td><td>100</td><td>200</td><td>300</td><td>400</td><td>500</td></tr>
					</table>
				</div><!-- .widget -->
			</div><!-- END column -->
     
    </div><!-- END row -->
  </section><!-- .app-content -->
</div><!-- .wrap -->
 
 

<%@include file="../../resources/include/footer.jsp"%>

</html>
