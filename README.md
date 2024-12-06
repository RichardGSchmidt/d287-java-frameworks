# WESTERN GOVERNORS UNIVERSITY
## D287 – JAVA FRAMEWORKS  RICHARD SCHMIDT ID#010869529

## SUMMARY OF CHANGES
### C. Customize the HTML user interface for your customer's application

> Includes the following changes to UI elements:
> 1. Shop name updated, Filename: templates/mainscreen.html Lines/Changes: 14: Richard's 3D Printer Shop, 19: Richard's 3D Printer Shop

### D. Add an "About" page to the application

> Has the following elements:
> 1. A Description of the Company an About page.  - Filename: about.html, Lines / Change: Created an about page with a title (line:5), a welcome header (line 8), and a brief company description (lines 8-9).
> 2. Controller to display the About page.  - Filename: AboutController.java, Lines / Changes:  Controller for the about page, gets mapping to /about (line 8) and returns a string reference to about.html (line 10).
> 3. Navigation from the Main page to the About page. - Filename: mainscreen.html, Lines/Changes: Added about button that references the /about mapping (line 20).
> 4. Navigation from the About page to the Main page. - Filename: about.html Lines / Change: Added a link to return to the main page (lines 11-12).

### E. Add a sample inventory appropriate for your chosen store to the application.
> 1. contains five parts  - Filename: BootstrapData.java, Lines/Changes: added 5 parts, two outsourced parts (lines 47-66) and three in-house parts(68-93)
> 2. contains five products - Filename: BootstrapData.java Lines/Changes: added 5 products (lines 102-106).
> 3. should not overwrite existing data in the database. Ensure the sample inventory is added only when both the part and product lists are empty and data is not duplicated. - Filename: BoostrapData.java Lines/Changes: Logic check to assert there is no existing data before adding sample data (line 45), prevents unwanted duplication.

### F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
> 1. The “Buy Now” button must be next to the buttons that update and delete products. - Filename mainscreen.html, Lines/Changes: added a buy button next to the other two buttons (line 90).
> 2. The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts. - Filename: AddProductController.java, Lines/Changes: Added a buy product function to the controller (lines 177-193) that decrements the inventory by one if there is available inventory (lines 184-188)
> 3. Display a message that indicates the success or failure of a purchase. - Filename: AddProductController.java, Lines/Changes: if inventory is available a success page is shown (line 188), otherwise a failure page is shown (line 191).
     > Filename: buysuccess.html Lines/Changes: Created an item successfully purchased notification page with a message informing the user of success (lines 8-9) and a link back to the main page (lines 10-11).
     > Filename: buyfailure.html Lines/Changes: Created an item purchase failure notification page with a message informing the user the product is out of stock (lines 9-10) and a link back to the main page (lines 11-12).


### G.  Modify the parts to track maximum and minimum inventory by doing the following:
> 1. Add additional fields to the part entity for maximum and minimum inventory.
> 2. Modify the sample inventory to include the maximum and minimum fields.
> 3. Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
> 4. Rename the file the persistent storage is saved to.
> 5. Modify the code to enforce that the inventory is between or at the minimum and maximum value.

### H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
> 1. Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
> 2. Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
> 3. Display error messages when adding and updating parts if the inventory is greater than the maximum.

### I.  Add at least two unit tests
> 1. for the maximum fields to the PartTest class in the test package.
> 2. for the minimum fields to the PartTest class in the test package.


## J.  Remove the class files for any unused validators in order to clean your code.