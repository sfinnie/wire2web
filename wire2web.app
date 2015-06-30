application wire2web

imports templates/wftemplate

section Domain Model

entity Party {
	title		<> Title
	forename	:: String
	surname		:: String
	email		:: Email
	phone		:: String
}

enum Title {
	mr("Mr"),
	mrs("Mrs"),
	miss("Miss"),
	dr("Dr")
}

entity Gender {
	name	:: String
}

entity Complaint {
	summary			:: String
	details			:: Text
	response		:: Bool
	complainant		-> Party
}

section Pages

define page root() {
	wfPageTemplate()
	
	define wireframe() {
		header{"Tell us about your Complaint"}
		par{"We're sorry we didn't meet your expectations.  Please tell us how so we can improve next time"}
		
		form {
			submit next()[class="float-right"] { "Next" }
		}		  
		action next(){return findCustomer();}
	}
	define pagelist() {
		complaintsPagelist()
	}
}
define page findCustomer(){ 
	wfPageTemplate()
	
	define wireframe() {
				
		var party := Party{}
		
		//TODO: Complete Domain model to cover Org/Individual as 
		//subtypes of Party.  Include logic to create/look up the right
		//one based on fields populated.
		
		var organisation: String := "Organisation"
		var postcode: String := ""
		var gender: String
		var genderOpts: Set<Gender> := {Gender{name :="male"}, Gender{name := "female"}}
		
		header{"Customer Details"}
		<h2>"Find Customer"</h2>
		form {
			label("Title:") {input(party.title)[class="small-text"]} <br class="clear" />
			label("Forename:") {input(party.forename)[class="medium-text"]}
			label("Surname:") {input(party.surname)[class="medium-text"]} <br class="clear" />
			label("Organisation:") {input(organisation)[class="large-text"]} <br class="clear" />
			label("Postcode:") {input(postcode)[class="large-text"]} <br class="clear" />
			label("Phone:") {input(party.phone)[class="large-text"]} <br class="clear" />
			label("Email:") {input(party.email)[class="large-text"]} <br class="clear" />

			submit next()[class="float-right"] { "Next" }
			submit back()[class="float-left clear-left"] { "Back" }
		}		  
		action next(){party.save(); return submitComplaint();} //TODO: action on submit & back
		action back(){return root();}
	}
	
	define pagelist() {
		complaintsPagelist()
	}
}

define page submitComplaint() {
	
	wfPageTemplate()
	
	define wireframe() {
		var complaint: Complaint := Complaint{}
		
		header {"Submit a Complaint"}
		<h2>"Please tell us about your Complaint"</h2>
		form {
			label("Title") {input(complaint.summary)[class="large-text"]} <br class="clear" />
			label("Details") {input(complaint.details)} <br class="clear" />
			label("Would you like a response?") {input(complaint.response)} <br class="clear" />

			submit submit()[class="float-right"] { "Submit" }
			submit back()[class="float-left clear-left"] { "Back" }
		}
		action submit(){complaint.save(); return confirmation();}
		action back(){return findCustomer();}
	}
	define pagelist() {
		complaintsPagelist()
	}
}

define page confirmation() {
	
	wfPageTemplate()
	
	define wireframe() {
		header{"Thanks for submitting your complaint"}
		par{"We appreciate you taking time to let us know how we're doing."}
	}
	define pagelist() {
		complaintsPagelist()
	}
}

define complaintsPagelist() {
	<li>navigate(root()){"Introduction"}</li>
	<li>navigate(findCustomer()){"Find Customer"}</li>
	<li>navigate(submitComplaint()){"Submit Complaint"}</li>
	<li>navigate(confirmation()){"Confirmation"}</li>
}
