module templates/wftemplate

define wfPageTemplateNoBorders() {
	<br class="clear-both" />
	
	<div id="box">
		<div id="box-top"></div>
		<div id="box-middle">
			wireframe()
		</div>
		<div id="box-bottom"></div>
	</div>
}

/**
 * 3 columns wireframes layout, as follows:
 * LH column: list of pages            (function pagelist())
 * RH column: notes on page (editable) (function pagenotes())
 * middle column: The wireframe itself (function wireframe())
 */
	
define wfPageTemplate() {
    <div id="wrapper">
	    <div id="left">
	      <div class="container">
	        <h2>"Pages"</h2>
	        <ul>
	        	pagelist()
 		    </ul>
	      </div>
	    </div>
	    
	    <div id="middle">
	      <div class="container">
	        <div id="box">
	          <div id="box-top">" "</div>
	          <div id="box-middle">
				wireframe()
	          </div>
	          <div id="box-bottom">" "</div>
	        </div>
	      </div>
	    </div>
	    
	    <div id="right">
	      <div class="container">
	      	pagenotes()
	      </div>
	    </div>
    </div>	
}	

define pagelist() {
	<li>"<Pages in the wireframe project will be listed here>"</li>
}

define pagenotes() {
	<h2>"Notes"</h2>
	form {
	  <textarea>"Notes Notes Notes Notes Notes Notes Notes Notes Notes Notes Notes Notes Notes Notes"</textarea>
	  submit save()[class="float-left clear-left"] { "Save" }
	}
	action save(){}	
}

define wireframe() {
	<h1>"Default wireframe content"</h1>	
}
