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
