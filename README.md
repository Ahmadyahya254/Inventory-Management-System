Ahmad Atta 
1191194
https://app.swaggerhub.com/apis/1191194_1/web_services/1.0.0#/default/get_customers
# Inventory-Management-System
Inventory Management System: Optimizing Retail Business through Comprehensive Management of Customers, Orders, Products, and Categories
The Inventory Management System is a structured software solution crafted to enhance and streamline the operations of a retail business. Central to this system are four key entities: Customers, Orders, Products, and Categories, each playing a pivotal role in the smooth functioning of retail operations.
Customers form the foundation of the retail operation, represented within the system by unique identifiers and attributes such as CustomerID, Name, and Email. The system meticulously tracks the various orders each customer places, underscoring the critical one-to-many relationship labeled "places" between customers and their orders. This configuration enables a single customer to place multiple orders, demonstrating the system's capability to manage and maintain detailed customer profiles and their transaction histories effectively.

Orders are the manifestations of transactions initiated by customers, organized around attributes including OrderID, Date, Total Price, and CustomerID (the latter linking back to the Customer entity). Each order amalgamates a variety of products, showcasing a many-to-many relationship with the Product entity, which is managed through a junction table in a relational database structure. This relationship, labeled "includes," illustrates the system's adaptability in managing diverse and intricate order compositions.

Products lie at the heart of retail operations, each characterized by a ProductID, Name, Description, Price, and a CategoryID, which connects it to a specific category. The system recognizes the complex nature of retail products through a one-to-many relationship with the Category entity, marked by "contains." This arrangement ensures that while a category may house numerous products, each product is affiliated with a single category, enabling efficient product management and categorization.

Categories function to systematically organize the wide spectrum of products within the retail system. Each category is distinguished by a CategoryID, Name, and Description, acting as a simple yet crucial element of the system. The interplay between categories and products is critical, facilitating the structured organization and easy access of product information.
![image](https://github.com/Ahmadyahya254/Inventory-Management-System/assets/119107643/c5e11d45-318e-460a-842f-b35fb9102f6d)
![image](https://github.com/Ahmadyahya254/Inventory-Management-System/assets/119107643/06848e95-aa51-41f4-9f4e-c69b4690be70)
![image](https://github.com/Ahmadyahya254/Inventory-Management-System/assets/119107643/9b721ce7-1e20-472a-b350-2e57ae1525f4)
![image](https://github.com/Ahmadyahya254/Inventory-Management-System/assets/119107643/15346c67-f757-4c6a-bacf-c86c5da73a74)
![image](https://github.com/Ahmadyahya254/Inventory-Management-System/assets/119107643/e3873570-6362-4619-80a3-e636b2b99f91)
for all tabel includ this 404 Not Found
500 Internal Server Error
501 Not Implemented



