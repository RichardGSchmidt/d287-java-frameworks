# WESTERN GOVERNORS UNIVERSITY
## D287 – JAVA FRAMEWORKS  RICHARD SCHMIDT ID#010869529

## SUMMARY OF CHANGES
### C. Customize the HTML user interface for your customer's application

> Includes the following changes to UI elements:
> 1. Shop name updated, Filename: templates/mainscreen.html Lines/Changes: 14: Richard's 3D Printer Shop, 19: Richard's 3D Printer Shop
> 2. Labels for clarity: Filename: InhousePartForm.html Lines/Changes: labeled fields (lines 15, 18, 21, 34)
> 3. Labels for clarity: Filename: OutsourcedPartForm.html Lines/Changes: labeled fields (lines 16, 18, 21, 24, 27, 34)
> 4. While completing Task G. Added min and max labels to Filename: mainscreen.html Lines/Changes: Min Max column labels (lines 39-40) and part min and max values (lines 49-50).


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
> 1. Add additional fields to the part entity for maximum and minimum inventory. - Filename: Part.Java, Lines/Changes: Added minInv and maxInv fields (lines 32-35), an updated constructor using these values (lines 59-67), and set and get functions for each field (lines 74-84).
> 2. Modify the sample inventory to include the maximum and minimum fields. - Filename: BootStrapData.java, Lines/Changes: For each sample part, added calls to set functions for minInv (lines: 54, 64, 73, 82, 91) and maxInv (lines: 55, 65, 74, 83, 92)
> 3. Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values. Filename: InhousePartForm.html, Lines/Changes: Added a minimum inventory input box (lines: 25-27), added a maximum inventory input box (lines: 29-31). Filename: OutsourcedPartForm.html, Lines/Changes: Added a minimum inventory input box (lines: 24-26), added a maximum inventory input box (lines: 27-29).
> 4. Rename the file the persistent storage is saved to. - Renamed database in application.properties (line 6).
> 5. Modify the code to enforce that the inventory is between or at the minimum and maximum value. - Filename: Part.java, Lines/Changes: The @ValidInventory constraint (line 20) enforces these requirements. Helper functions invGreaterMax() (line 110), invLessMin() (line 111), isMaxIntValid() (line 113) added for use in validators.
     > Filename: ValidInventory.java, Lines/Changes: Created an interface (lines 16-23) to validate the inventory using the InventoryValidator class as a validator for the constraint (line 16).
     > Filename: InventoryValidator.java, Lines/Changes: Created logic to check if a part is valid and to return true if valid and false if invalid (lines: 8-41).  Adds additional Constraint violations for each condition causing one, including if minInv > maxInv (lines: 17-23), if inv < minInv (lines 24-30), and if inv > maxInv (line: 38).

### H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
> 1. Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
> > - Filename: InventoryValidator.java Lines/Changes: Created an error message for the event inventory is below minimums (lines 27-32)
> 2. Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum. 
> - Filename EnufPartsValidator.java Changes / Lines: Updated the validator that checks that there are enough parts to create a product to account for in inv values (line 36).
> - Filename ValidEnufParts.java Changes/Lines: Updated the error message to better reflect what is happening (line 20).
> 3. Display error messages when adding and updating parts if the inventory is greater than the maximum. 
> - Filename: InventoryValidator.java Lines/Changes: Created an error message for the event inventory exceeds maximum (lines 35-40)

### I.  Add at least two unit tests
> 1. for the maximum fields to the PartTest class in the test package.
     > Filename: PartTest.java, Lines/Changes: create unit test testMinValue() which tests the minimum value (lines: 161-165)
> 2. for the minimum fields to the PartTest class in the test package.
     > Filename: PartTest.java, Lines/Changes: created unit test testMaxValue() which tests the maximum value (lines: 168-172)


## J.  Remove the class files for any unused validators in order to clean your code.
> 1. Deleted DeletePartValidator.java as it was unused in accordance with Task J.  This is the only unused validator and completes Task J.