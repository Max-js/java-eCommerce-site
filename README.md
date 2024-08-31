# Max Smith Java Frameworks Project

Changes Implemented:

    # Part C: Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
        - mainscreen.html Line 14: changed shop name
        - mainscreen.html Line 19: changed shop name
        - mainscreen.html Line 22: changed parts heading
        - mainscreen.html Line 53: changed product name
        - productForm.html Line 12: changed part heading

    #Part D: Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
        - AboutScreenController.java: Create file and contents
        - aboutScreen.html: Create file and contents
        - mainscreen.html Line 20: Add About Us button to redirect to About Us page

    #Part E: Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
        - BootStrapData.java Line 4: add import for inhousePart
        - BootStrapData.java Line 8: add import for InhousePartRepository
        - BootStrapData.java Line 34: add private final for InhousePartRepository
        - BootStrapData.java Line 40: add alias for inhousePartRepository
        - BootStrapData.java Line 46 - 80: add if statement to load outsourced parts if the count of the outsourced part repository is 0. This loads in pickups, tuners, and bridge outsourced parts.
        - BootStrapData.java Line 83 - 96: add if statement to load inhouse parts if the count in the inhouse part repository is 0. This loads in guitar necks and guitar bodies.
        - BootStrapData.java Line 99 - 110: Add if statement to load products into the product repository if the current repository count is 0. This loads in my 5 different guitar products (double cut, single cut, flying v, explorer, and headless).

    #Part F: Add a “Buy Now” button to your product list.
        - mainscreen.html Line 87: Add buy now button
        - BuyNow.java Lines 1-32: Create controller for buy now button. Controller includes get mapping directing to if statement that decrements the product inventory by 1 if the product exists, then returns a success message. If purchase fails, a failure message is returned.
        - success.html Lines 1 - 16: create view showing successful purchase message and button linking back to main page
        - failure.html Lines 1 16: create view showing failure message and button linking back to main page.
    
    #Part G: Modify the parts to track maximum and minimum inventory.
        - Part.java Line 6: import Maximum validation constraint
        - Part.java Lines 33 - 38: Define min and max variables
        - Part.java Lines 58 - 59: Add min and max defaults to Part object
        - Part.java Lines 94 - 118: Define getter and setter methods for minimum and maximum inventory, as well as method to enforce inventory limits.
        - PartServiceImpl.java Line 59: add method to enforce inventory limits on save
        - OutsourcedPartServiceImpl.java Line 52: add method to enforce inventory limits on save
        - InhousePartServiceImpl.java Line 54: add method to enforce inventory limits on save
        - InhousePart.java Lines 18-19: add default values for min and max inventory
        - OutsourcedPart.java Lines 18-19: add default values for min and max inventory
        - BootStrapData.java Lines 51-52, 67-68, 77-78, 93-94, 102-103: add default min and max inventory values to each part
        - InhousePartForm.html Lines 18, 22, 25-28, 30-34: Add titles above each input field for clarity. Add minimum and max inventory input fields.
        - OutsourcedPartForm.html Lines 19, 23, 27-35: Add titles above each input field for clarity. Add minimum and max inventory input fields.
        - application.properties Line 6: change name of database file

    #Part H: Add validation for between or at the maximum and minimum fields.
        - ValidMinParts.java Lines 1-25: Create file, add default message for when parts fall below minimum
        - ValidMaxParts.java Lines 1-25: Create file, add default message for when parts inventory is above allowable maximum
        - MinPartValidator Lines 1-24: Create file. Create function to validate if part inventory is greater than minimum allowable inventory.
        - MaxPartValidator Lines 1-24: Create file. Create function to validate if part inventory is less than maximum allowable inventory.
        - Part.java Lines 4-5: import validators for min and max parts
        - Part.java Lines 22-23: add validators so they can be utilized
        - InhousePartForm.html Lines 38-40: Add error message from validator to in house part form so it can be triggered by the submit action.
        - OutsourcedPartForm.html Lines 39-41: Add error message from validator to outsourced part form so it can be triggered by the submit action.
        - EnufPartsValidator.java Lines 36-40: Add Inventory too low error message
