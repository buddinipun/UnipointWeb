<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>

	<script>
		Breakpoints();
	</script>

<!-- navbar search -->
<div id="navbar-search" class="navbar-search collapse">
  <div class="navbar-search-inner">
    <form action="#">
      <span class="search-icon"><i class="fa fa-search"></i></span>
      <input class="search-field" type="search" placeholder="search..."/>
    </form>
    <button type="button" class="search-close" data-toggle="collapse" data-target="#navbar-search" aria-expanded="false">
      <i class="fa fa-close"></i>
    </button>
  </div>
  <div class="navbar-search-backdrop" data-toggle="collapse" data-target="#navbar-search" aria-expanded="false"></div>
</div>
<main id="app-main" class="app-main">
  <div class="wrap">
  <section class="app-content">
    <div class="row">
      <div class="col-md-12">
        <div class="widget">
          <header class="widget-header">
            <h4 class="widget-title">Demographic Report</h4>
						<div class="col-md-12">
				<div class="widget">
					
					<div class="widget-body">
						<div class="m-b-xl">
							<h4 class="m-b-md">Select Date Range</h4>
							<form class="form-inline">
								<div class="form-group">
									<label for="starting_date">Starting Date</label>
									<input type="date" class="form-control" id="start" placeholder="Select date">
								</div>
								<div class="form-group">
									<label for="ending_date">Ending Date</label>
									<input type="date" class="form-control" id="ending" placeholder="Select date">
								</div>
								<button type="submit" class="btn btn-default">Get Reporting</button>
							</form>
						</div>
						
					</div><!-- .widget-body -->
				</div><!-- .widget -->
			</div><!-- END column -->
					</header><!-- .widget-header -->
          <hr class="widget-separator">
          <div class="widget-body">
            <div data-plugin="chart" data-options="{
              tooltip : {
                trigger: 'axis'
              },
              legend: {
                data:['Male','Female']
              },
              calculable : true,
              xAxis : [
                {
                  type : 'category',
                  data : ['13-17','18-24','25-34','35-44','45-54','55-64','65+']
                }
              ],
              yAxis : [
                {
                  type : 'value'
                }
              ],
              series : [
                {
                  name:'Sale',
                  type:'bar',
                  data:[2.0, 4.9, 7.0, 23.2, 25.6, 76.7, 135.6, 162.2, 32.6, 20.0, 6.4, 3.3],
                  markPoint : {
                    data : [
                      {type : 'max', name: 'Max'},
                      {type : 'min', name: 'Min'}
                    ]
                  },
                  markLine : {
                    data : [
                     {type : 'average', name: 'Average'}
                    ]
                  }
                },
                {
                  name:'Market',
                  type:'bar',
                  data:[2.6, 5.9, 9.0, 26.4, 28.7, 70.7, 175.6, 182.2, 48.7, 18.8, 6.0, 2.3],
                  markPoint : {
                    data : [
                      {name : 'Max', value : 182.2, xAxis: 7, yAxis: 183, symbolSize:18},
                      {name : 'Min', value : 2.3, xAxis: 11, yAxis: 3}
                    ]
                  },
                  markLine : {
                    data : [
                      {type : 'average', name : 'Average'}
                    ]
                  }
                }
              ]
            }" style="height:300px">
            </div>
          </div><!-- .widget-body -->
        </div><!-- .widget -->
      </div><!-- END column -->
</div><!-- END row -->
  </section><!-- .app-content -->
  <div class="col-md-12">
				<div class="widget p-lg">
					<h4 class="m-b-lg">Overall status of both Male and Female Customer</h4>
					
					<table class="table table-hover">
						<tr><th>Outlet name</th><th>Location</th><th>Count</th><th>13-17</th><th>18-24</th><th>255-34</th><th>45-54</th><th>55-64</th><th>64+</th><th>Count</th></tr>
						
					</table>
				</div><!-- .widget -->
			</div><!-- END column -->
</div><!-- .wrap -->
</main>


  <%@include file="../../resources/include/footer.jsp" %>