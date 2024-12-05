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
> 1. contains five parts  - Filename: Line: Change:
> 2. contains five products - Filename: Line: Change:
> 3. should not overwrite existing data in the database.
> 4. Ensure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.

### F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
> 1. The “Buy Now” button must be next to the buttons that update and delete products.
> 2. The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
> 3. Display a message that indicates the success or failure of a purchase.


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