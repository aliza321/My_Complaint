
# My_Complaint
A simple complaint management system in Java

### Problem Statement: 
The problem is to build a complaint system which records the information regarding the complaints registered by a complainant to a municipal corporation.It enables the user to effectively communicate with the authorities in the form of a feedback system. It also encourages the complainant to voice their inconveniences, thus increasing the opportunities for the corporation to improve its efficiency. 


2. The complaint system will first display a log in screen to the user, indicating the user to enter his/ her ID and the password assigned to the user. The user can either be a complainant or an admin. Judging by the ID used for the log in, the system decides whether it’s a complainant or an admin who is trying to access the system. 

3. If a complainant has logged in to the system, he/she is greeted to a window that includes options that pertain to their demands. The window contains three options: 
- Add a complaint: When this option is selected by the complainant, a window opens which gives them a platform for writing and filing a complaint in the database. The complaint number, which is unique to each complaint is provided automatically. The complainant has the option to select the type of grievance to which the complaint is to be addressed. The text box prompt is for them to write the complaint. By clicking Submit button, the complaint will be stored in the database. 
- Edit complaint: This option enables the complainant to edit the complaint registered, meaning that the they are able to change the complaint registered or delete the complaint registered. The window shows all the complaints filed by them. A complaint is selected and edited by writing in the text box or it is deleted. 
- Show status: When this option is clicked, the complainant is given full list of the complaints filed by them with all the relevant information and also a status column is displayed which indicates whether a solution for the complaint has yet been provided or not. 

4. If an admin has logged in to the system, he/ she is greeted by a window that includes options that are of the admin’s interest. This window has three options: 
- Add Solution: This option enables the admin to enter a solution of the complaints registered by the complainants. The admin can select the complaint out of the list and provide the solution by typing in the text-box. 
- Update solution: An admin also has the option to update or rectify the already given solution regarding a registered complaint by clicking this option. Here they are provided with the list of solution provided by the admin along with their complaint number and complaint. They can change the solution but cannot delete the solution. That is, they must either replace the solution with another or let it remain the same. 
- Show my solution: This option allows the admin to see all the solutions they have provided in the database till now. 

5.The last option, which is common to both the complainant and the admin the option to log out of the system. The user, when logged out, can access the system anytime and the data pertaining to the user will not be removed from the database.


