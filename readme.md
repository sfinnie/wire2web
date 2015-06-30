#Wire2Web

This is a sample [webdsl](http://webdsl.org) project.  Its purpose is to facilitate the creation of *working wireframes*.  [Wireframes](https://en.wikipedia.org/wiki/Website_wireframe) are often created during a website project.  The intention is to explore requirements and help users/customers identify what's required.

##Motivation

Wireframes are deliberately "low fidelity": no colours, graphic design, real imagery etc.  Including those elements tends to steer conversation towards matters of presentation and detract from getting the fundamentals right.  Design is of course important - but a good graphic design won't make up for a fundamentally flawed site.

Several tools exist for wireframing, from pencil & paper through to bespoke apps such as [Axure](http://www.axure.com/).  These can all be effective.  However, the wireframe is the end of the tool chain; once the wireframes are approved, development needs to start from scratch.

That can be a good thing.  The up side of such tools is turn around time.  Because the user isn't creating the "real" application, the wireframes can be iterated rapidly.  But it still creates a discontinuity between wireframing and development in the delivery process.

There's also the question of behaviour.  Wireframes are fundamentally static images.  So it's difficult for the user to understand flow among pages - especially when there are multiple routes through the application.

#Why Wire2Web?

Wire2web tries to support the concept of wireframing - without dropping development off a cliff at the end.  The real power comes from the [webdsl](http://www.webdsl.org) toolkit; wire2web is just a starter webdsl project.

Webdsl provides a simple way to define real, interactive websites.  It's much quicker than normal website development because it abstracts much of the accidental complexity.  Users only define two things:

 - The concepts underpinning the application: Recipes, People, Dogs, Pensions, whatever.
 - The pages the user sees, their content and inter-page flow.

That makes creating much quicker than writing a typical application.  Qualitatively, it's on a par with using a more typical wireframing tool.

##Interactive Wireframes

Webdsl generates a working application.  Wire2web adds some stylesheets that make the app look like a wireframe; for example:

![Web2wire example](/images/wire2web-sample.png)

The wireframe itself sits in the center panel.  Although it looks like a wireframe, under the covers it's a real application.  So the buttons all work and navigate as expected; field validations work, and so on.

The left and right columns aren't part of the wireframe itself; they support the review process.  The Left hand column lists all the pages, so simplifies the review process.  The right hand column allows the reviewer to submit comments which are separately held against the page for subsequent collation/review by the designer (this bit isn't done yet...!).

##3 routes to working software

Wire2web can be used like a "normal" wireframing tool in that coding the application starts from scratch once the wireframes are approved.  However, it's a real application, complete with database, full implementation of application logic, web front end, and all the connectivity.

So getting to production application can be as simple as changing the stylesheets.

The reality is likely in the middle.  Wireframes probably won't cover all routes through the app, or perhaps won't include all validation logic/domain concepts.  However these can be added to the underlying webdsl model rather than starting from scratch.

#Status
Wire2Web is rudimentary at this point.  Nevertheless it's usable in its current form, though there's lot more that could be done.  Contributions greatfully accepted.

#Instructions for use
Download, Install & Build the starter project:

1. Download & Install [Webdsl](http://webdsl.org/singlepage/Download)
2. Clone the wire2web project: `git clone https://github.com/sfinnie/wire2web.git`
3. Run Webdsl
4. Import the Wire2web project into Webdsl: `File->Import->Existing Project into Workspace` and select the project as downloaded in step 2.
5. Select the Wire2web project in the project explorer and build it: `Ctrl-alt-b` on Linux/Windows, `Cmd-alt-b` on Mac.  This will build then launch the app and open a web browser onto the default page.


#Make your wireframes
 - The Domain model and pages are defined in `wire2web.app`.
 - The wireframe template is in `templates/wftemplate.app`
 - Stylesheets are in `stylesheets` (no surprises there then).
 - Rebuild with `ctrl-alt-b` / `cmd-alt-b` as above.

The [webdsl manual](http://webdsl.org/indexpage/Manual) documents how to add pages & domain model content.








